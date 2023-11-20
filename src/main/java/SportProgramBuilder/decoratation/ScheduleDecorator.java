package SportProgramBuilder.decoratation;

import SportProgramBuilder.FitnessProduct;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScheduleDecorator extends WorkOutDecorator{
    private int subscriptionPlan;
    private int restDays;

    public ScheduleDecorator(FitnessProduct product, int subscriptionPlan, int restDays) {
        super(product);
        this.subscriptionPlan = subscriptionPlan;
        this.restDays = restDays;
    }

    private String createSchedule() {

        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime endDate = currentDate.plusMonths(subscriptionPlan);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String res = "\nРасписание по датам: ";

        int trainNum = 1;
        while (currentDate.compareTo(endDate) < 0) {
            res += "\n" + trainNum + ")" + " Дата занятия: " + formatter.format(currentDate);
            trainNum++;
            currentDate = currentDate.plusDays(restDays);
        }
        return res;
    }

    @Override
    public String about() {
        return super.about() + "\n" +
                createSchedule();
    }
}
