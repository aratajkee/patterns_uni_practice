package SportProgramBuilder.employes;

import SportProgramBuilder.managers.PersonalManager;

public class PersonalManagerEmploye implements Employe{

    private PersonalManager personalManager;

    public PersonalManagerEmploye(PersonalManager personalManager) {
        this.personalManager = personalManager;
    }


    @Override
    public void doAction() {
        System.out.println(
                "Персональный менеджер создал программу:\n" +

                personalManager.getFullPowerPlan());
    }
}
