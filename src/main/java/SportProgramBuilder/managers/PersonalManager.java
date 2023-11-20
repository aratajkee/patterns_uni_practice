package SportProgramBuilder.managers;

import SportProgramBuilder.WorkOut;
import SportProgramBuilder.builders.CardioWorkOutBuilder;
import SportProgramBuilder.builders.PowerWorkOutBuilder;
import SportProgramBuilder.decoratation.ScheduleDecorator;
import SportProgramBuilder.decoratation.TimeLimitDecorator;

public class PersonalManager {
    private WorkOut  workOut = null;
    private String timeStart;
    private String timeEnd;
    private int subscriptionPlan;
    private int restDays;


    public PersonalManager(String timeStart, String timeEnd, int subscriptionPlan, int restDays) {
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.subscriptionPlan = subscriptionPlan;
        this.restDays = restDays;
    }

    public String getFullCardioPlan() {
        workOut = new PersonalTrainer(new CardioWorkOutBuilder())
                .createWorkOut();
        return new ScheduleDecorator(
                new TimeLimitDecorator(workOut, timeStart, timeEnd),subscriptionPlan, restDays)
                .about();
    }

    public String getFullPowerPlan() {
        workOut = new PersonalTrainer(new PowerWorkOutBuilder())
                .createWorkOut();
        return new ScheduleDecorator(
                new TimeLimitDecorator(workOut, timeStart, timeEnd),subscriptionPlan, restDays)
                .about();
    }
}
