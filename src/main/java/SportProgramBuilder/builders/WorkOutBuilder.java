package SportProgramBuilder.builders;

import SportProgramBuilder.WorkOut;

public interface WorkOutBuilder {
     WorkOutBuilder addLegsExercise();
     WorkOutBuilder addHandsExercise();
     WorkOutBuilder addCoreExercise();
     WorkOutBuilder addBackExercise();
     WorkOut buildWorkOut();
}
