package pl.strefakursow;

import pl.strefakursow.adapter.OfficialTrippingEmployee;
import pl.strefakursow.database.EmployeeCreator;
import pl.strefakursow.database.EmployeeDatabase;
import pl.strefakursow.decorator.DeadlineBonus;
import pl.strefakursow.decorator.FreqBonus;
import pl.strefakursow.decorator.Payable;
import pl.strefakursow.decorator.SpecialBonus;
import pl.strefakursow.strategy.*;

public class ApiFacade {

    private EmployeeDatabase eDatabase = new EmployeeDatabase();
    private EmployeeCreator employeeCreator=new EmployeeCreator();

    public Employee createDoctor(int i) {

        Employee mike = employeeCreator.create(EmployeeCreator.BIKE_DOCTOR_SANDWICH);
        mike.setSalary(i);

        eDatabase.addEmployee(mike);

        return mike;
    }

    public void pushDoctorToJob(Employee mike) {
        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast(mike);

        mike.travelStrategy = new CarTravelStrategy();
        mike.goToWork();
    }

    public int countSalary(Employee mike) {
        Payable employee = mike;

        if (mike.getSalary() > 8000) {
            employee = new SpecialBonus(mike);
        }

        if (mike.travelStrategy instanceof BikeTravelStrategy) {
            employee = new FreqBonus(employee);
        }
        return employee.getSalary();
    }

    public void giveFreeHouseToBestFreqEmployee(Employee mike) {
        System.out.println(mike.toString() + "dostaje dom " + new House.HouseBuilder()
                .setAdress("Za Zakretem 3")
                .setDoorsNumber(3)
                .setFloorsNumber(4)
                .setWindowsNumber(10)
                .build().toString());
    }
}
