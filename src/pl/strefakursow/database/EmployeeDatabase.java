package pl.strefakursow.database;

import pl.strefakursow.strategy.Employee;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmployeeDatabase {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employee());
        employeeList.add(new Employee());

    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }
}

