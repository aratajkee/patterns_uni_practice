package SportProgramBuilder;

import SportProgramBuilder.exercises.Exercise;

public class WorkOut implements FitnessProduct {
    private Exercise legs;
    private Exercise hands;
    private Exercise core;
    private Exercise back;

    public WorkOut(Exercise legs, Exercise hands, Exercise core, Exercise back) {
        this.legs = legs;
        this.hands = hands;
        this.core = core;
        this.back = back;
    }

    public Exercise getLegs() {
        return legs;
    }

    public void setLegs(Exercise legs) {
        this.legs = legs;
    }

    public Exercise getHands() {
        return hands;
    }

    public void setHands(Exercise hands) {
        this.hands = hands;
    }

    public Exercise getCore() {
        return core;
    }

    public void setCore(Exercise core) {
        this.core = core;
    }

    public Exercise getBack() {
        return back;
    }

    public void setBack(Exercise back) {
        this.back = back;
    }

    public boolean doCheck() {
        return (legs != null && !legs.about().trim().isEmpty()) &&
               (back != null && !back.about().trim().isEmpty()) &&
               (core != null && !core.about().trim().isEmpty()) &&
               (hands != null && !hands.about().trim().isEmpty());
    }

    @Override
    public String about() {
        return "\nОписание программы тренировки:\n" +
                "1) Упражнение на ноги: " + legs.about() + "\n" +
                "2) Упражнение на спину: " + back.about() + "\n" +
                "3) Упражнение на грудь: " + core.about() + "\n" +
                "4) Упражнение на руки: " + hands.about() + "\n";
    }
}
