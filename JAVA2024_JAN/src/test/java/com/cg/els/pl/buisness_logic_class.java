package com.cg.els.pl;

import java.util.Scanner;

import com.cg.els.bean.Employee;
import com.cg.els.service.Employee_service;
import com.cg.els.service.Employee_service_1;

public class buisness_logic_class {
    public static void main(String[] args) {
        // Creating instances
        Employee employee = new Employee();
        Employee_service employeeService = new Employee_service_1();

        // Getting employee details
        employeeService.getEmployeeDetails(employee);

        // Finding insurance scheme
        employeeService.findInsuranceScheme(employee);

        // Displaying employee details
        employeeService.displayEmployeeDetails(employee);
    }
}