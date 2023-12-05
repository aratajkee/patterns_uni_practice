package SportProgramBuilder;

import SportProgramBuilder.employes.Employe;
import SportProgramBuilder.employes.PersonalManagerEmploye;
import SportProgramBuilder.employes.SupplierEmploye;
import SportProgramBuilder.equipment.Equipment;
import SportProgramBuilder.equipment.HeavyEquipmentSupplier;
import SportProgramBuilder.managers.PersonalManager;

public class Main {
    public static void main(String[] args) {

//        System.out.println(
//                new PersonalManager("13:00","15:00",2,3)
//                        .getFullCardioPlan()
//        );
//
//        HeavyEquipmentSupplier supplier = new HeavyEquipmentSupplier(
//                new Equipment("Гантельки", "Описание",100),
//                new Equipment("Штанга", "Описание",200),
//                new Equipment("Лавка для жима", "Описание",300)
//        );
//        supplier.shipEquipment();

        PersonalManagerEmploye manager = new PersonalManagerEmploye(
                new PersonalManager("13:00","15:00",2,3));

        SupplierEmploye supplier = new SupplierEmploye(new HeavyEquipmentSupplier(
                new Equipment("Гантельки", "Описание",100),
                new Equipment("Штанга", "Описание",200),
                new Equipment("Лавка для жима", "Описание",300)
        ));

        manager.doAction();

        System.out.printf("\n======================================================================\n");

        supplier.doAction();
    }
}
