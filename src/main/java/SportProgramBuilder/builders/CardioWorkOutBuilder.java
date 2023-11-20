package SportProgramBuilder.builders;

import SportProgramBuilder.WorkOut;
import SportProgramBuilder.exercises.*;

public class CardioWorkOutBuilder implements WorkOutBuilder{

   private Exercise legs;
   private Exercise hands;
   private Exercise core;
   private Exercise back;
    @Override
    public WorkOutBuilder addLegsExercise() {
        this.legs = new SitUps();
        return this;
    }

    @Override
    public WorkOutBuilder addHandsExercise() {
        this.hands = new PushUps();
        return this;
    }

    @Override
    public WorkOutBuilder addCoreExercise() {
        this.core = new KneeTuckCrunches();
        return this;
    }

    @Override
    public WorkOutBuilder addBackExercise() {
        this.back = new PullUps();
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
