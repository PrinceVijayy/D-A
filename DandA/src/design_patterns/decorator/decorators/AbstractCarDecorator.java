package design_patterns.decorator.decorators;

import design_patterns.decorator.concrete.CarComponent;

public abstract class AbstractCarDecorator implements CarComponent {

    private final CarComponent carComponent;

    protected AbstractCarDecorator(CarComponent carComponent) {
        this.carComponent = carComponent;
    }

    @Override
    public void buildCar() {
        if(carComponent!=null){
            carComponent.buildCar();
        }
    }
}
