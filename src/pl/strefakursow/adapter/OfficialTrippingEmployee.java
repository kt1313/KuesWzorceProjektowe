package pl.strefakursow.adapter;

import pl.strefakursow.strategy.Employee;

public class OfficialTrippingEmployee {
    private  Employee emlployee;

    public OfficialTrippingEmployee(Employee employee) {
        this.emlployee=employee;
    }

    public void goToClient() {
        emlployee.goToWork();
        System.out.println(" to Client");
    }
}
