package pl.strefakursow.strategy;

public class CarTravelStrategy implements TravelStrategy {
    @Override
    public void goToWork() {
        System.out.println("Going by Car");
    }
}
