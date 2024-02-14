package design_patterns.decorator.concrete;

public class CarConcrete implements CarComponent {

    @Override
    public void buildCar(){
        System.out.println("Car is generated");
    }
}
