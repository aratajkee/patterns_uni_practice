package SportProgramBuilder.equipment;

public class CardioEquipmentSupplier extends Supplier{
    private Equipment[] equipments;
    public CardioEquipmentSupplier(Equipment... equipments) {
        this.equipments = equipments;
    }

    public void shipEquipment() {
        System.out.println("\nПоставщик тренажеров для кардио тренировок отправил: ");
        for (Equipment e : equipments) {
            System.out.println(e.toString());
        }
    }
}
