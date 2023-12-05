package SportProgramBuilder.equipment;

public class HeavyEquipmentSupplier extends Supplier{
    private Equipment[] equipments;
    public HeavyEquipmentSupplier(Equipment... equipments) {
        this.equipments = equipments;
    }

    public void shipEquipment() {
        System.out.println("\nПоставщик тренажеров для силовых тренировок отправил: ");
        for (Equipment e : equipments) {
            System.out.println(e.toString());
        }
    }
}
