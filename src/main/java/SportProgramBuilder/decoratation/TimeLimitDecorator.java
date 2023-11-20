package SportProgramBuilder.decoratation;

import SportProgramBuilder.FitnessProduct;

public class TimeLimitDecorator extends WorkOutDecorator{
    private String timeStart;
    private String timeEnd;

    public TimeLimitDecorator(FitnessProduct product, String timeStart, String timeEnd) {
        super(product);
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    private int parseClockToInt(String input) {
        return Integer.parseInt(input.split(":")[0]) * 60
                + Integer.parseInt(input.split(":")[1]);
    }

    private String parseIntToClock(Integer input) {
        // 1080 -> 18:00
        String whole = String.valueOf(input / 60);
        String frac = String.valueOf(input % 60);

        if(frac.length() == 1) {
            frac += "0";
        }
        return whole + ":" + frac;
    }

    private String createTimeLimit() {
        //TODO
        int intS = parseClockToInt(timeStart);
        int intE = parseClockToInt(timeEnd);
        int interval = intE - intS;
        int step = interval / 4;
        String resString = "Расписание тренировки: ";

        for (int i = 1; i <= 4; i++) {
            resString += "\n" + i + ") Упражнение: "
            + parseIntToClock(intS + step * (i - 1)) + " - " + parseIntToClock(intS + step * i - 5) +
            " | Отдых " + parseIntToClock(intS + step * i - 5) + " - " + parseIntToClock(intS + step * i) ;

        }
        return resString;
    }

    @Override
    public String about() {
        return super.about() + "\n" +
                createTimeLimit();
    }
}
