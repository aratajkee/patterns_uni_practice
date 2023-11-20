package SportProgramBuilder.equipment;

public class Equipment {

    private String name;
    private String description;
    private double cost;

    public Equipment(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "\nОписание оборудования"
                + "\nНазвание " + getName()
                + "\nЦена " + getCost()
                + "\nОписание " + getDescription();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
