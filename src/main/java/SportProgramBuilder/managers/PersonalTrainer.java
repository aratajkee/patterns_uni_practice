package SportProgramBuilder.managers;

import SportProgramBuilder.WorkOut;
import SportProgramBuilder.builders.WorkOutBuilder;

public class PersonalTrainer {

    private WorkOutBuilder workOutBuilder;

    public PersonalTrainer(WorkOutBuilder workOutBuilder) {
        this.workOutBuilder = workOutBuilder;
        if (this.workOutBuilder == null) {
            throw new IllegalArgumentException("Отсутствует workOutBuilder!");
        }
    }

    public WorkOut createWorkOut() {
        return workOutBuilder
                .addBackExercise()
                .addCoreExercise()
                .addHandsExercise()
                .addLegsExercise()
                .buildWorkOut();
    }
}
