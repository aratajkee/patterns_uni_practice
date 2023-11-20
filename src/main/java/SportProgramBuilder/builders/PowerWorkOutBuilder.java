package SportProgramBuilder.builders;

import SportProgramBuilder.WorkOut;
import SportProgramBuilder.exercises.*;

public class PowerWorkOutBuilder implements WorkOutBuilder{

    private Exercise legs;
    private Exercise core;
    private Exercise hands;
    private Exercise back;

    @Override
    public WorkOutBuilder addLegsExercise() {
        this.legs = new Deadlift();
        return this;
    }

    @Override
    public WorkOutBuilder addHandsExercise() {
        this.hands = new DumbbellBicepsCurls();
        return this;
    }

    @Override
    public WorkOutBuilder addCoreExercise() {
        this.core = new Pullover();
        return this;
    }

    @Override
    public WorkOutBuilder addBackExercise() {
        this.back = new DumbbellRow();
        return this;
    }

    @Override
    public WorkOut buildWorkOut() {
        WorkOut workOut = new WorkOut(legs, hands, core, back);
        if (workOut.doCheck())
            return workOut;
        else {
            System.out.println("Программа тенировки не готова!");
            return null;
        }
    }

}
