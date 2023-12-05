package SportProgramBuilder.employes;

import SportProgramBuilder.equipment.Supplier;

public class SupplierEmploye implements Employe{

    private Supplier supplier;

    public SupplierEmploye(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public void doAction() {
        supplier.shipEquipment();
    }
}
