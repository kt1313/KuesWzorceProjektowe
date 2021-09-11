package pl.strefakursow.database;

import pl.strefakursow.strategy.BikeTravelStrategy;
import pl.strefakursow.strategy.DoctorJobStrategy;
import pl.strefakursow.strategy.Employee;
import pl.strefakursow.strategy.SandwichBreakfastStrategy;

public class EmployeeCreator {

    public static final String BIKE_DOCTOR_SANDWICH = "bikeDoctorSandwich";

    public Employee create(String employeeType) {
        switch (employeeType) {
            case BIKE_DOCTOR_SANDWICH: {
                Employee mike = new Employee();
                mike.travelStrategy = new BikeTravelStrategy();
                mike.jobStrategy = new DoctorJobStrategy();
                mike.breakfastStartegy = new SandwichBreakfastStrategy();
                return mike;
            }
            default:
                return new Employee();
        }
    }
}
