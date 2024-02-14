package design_patterns.decorator.decorators;

import design_patterns.decorator.concrete.CarComponent;

public class PaintDecorator extends AbstractCarDecorator{
    public PaintDecorator(CarComponent carComponent) {
        super(carComponent);
    }

    @Override
    public void buildCar(){
        super.buildCar();
        decoratePaintToCar();
    }

    private void decoratePaintToCar(){
        System.out.println("Car has been painted with blue");
    }
}
