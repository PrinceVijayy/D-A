package design_patterns.decorator.decorators;

import design_patterns.decorator.concrete.CarComponent;

public class SpoilerDecorator extends AbstractCarDecorator {
    public SpoilerDecorator(CarComponent carComponent) {
        super(carComponent);
    }

    @Override
    public void buildCar() {
        super.buildCar();
        decorateSpoilerToCar();
    }

    private void decorateSpoilerToCar() {
        System.out.println("Spoiler is added to car");
    }
}
