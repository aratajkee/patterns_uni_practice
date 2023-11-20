package SportProgramBuilder.decoratation;

import SportProgramBuilder.FitnessProduct;

public abstract class WorkOutDecorator implements FitnessProduct {
    private FitnessProduct product;
    public WorkOutDecorator(FitnessProduct product) {
        this.product = product;
    }
    @Override
    public String about() {
        return product.about();
    }
}
