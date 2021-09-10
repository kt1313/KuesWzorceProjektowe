package pl.strefakursow.strategy;

public class SandwichBreakfastStrategy implements BreakfastStrategy {
    @Override
    public void eatYourBreakfast(Employee employee) {

        System.out.println("Eat sandwich");
    }
}
