package pl.strefakursow.strategy;

import pl.strefakursow.decorator.Payable;

public class Employee implements TravelStrategy, JobStrategy, BreakfastStrategy, Payable {

    private int salary;

    public TravelStrategy travelStrategy;
    public JobStrategy jobStrategy;
    public BreakfastStrategy breakfastStartegy;

    @Override
    public void eatYourBreakfast(Employee employee) {
        breakfastStartegy.eatYourBreakfast(employee);
    }

    @Override
    public void doYourJob() {
        jobStrategy.doYourJob();
    }

    @Override
    public void goToWork() {
        travelStrategy.goToWork();

    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
