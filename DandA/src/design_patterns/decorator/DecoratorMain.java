package design_patterns.decorator;

import design_patterns.decorator.concrete.CarConcrete;
import design_patterns.decorator.decorators.PaintDecorator;
import design_patterns.decorator.decorators.SpoilerDecorator;

public class DecoratorMain {
    public static void main(String[] args) {
        CarConcrete car = new CarConcrete();
        car.buildCar();
        SpoilerDecorator spoilerDecorator = new SpoilerDecorator(car);
        spoilerDecorator.buildCar();
        PaintDecorator paintDecorator = new PaintDecorator(spoilerDecorator);
        paintDecorator.buildCar();
    }
}
