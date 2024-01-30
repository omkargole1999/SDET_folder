package com.cg.els.service;

import java.util.Scanner;

import com.cg.els.bean.Employee;

public class Employee_service_1 implements Employee_service{

    @Override
    public void getEmployeeDetails(Employee employee) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        employee.setId(scanner.nextInt());

        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("Enter Employee Name: ");
        employee.setName(scanner.nextLine());

        System.out.println("Enter Employee Salary: ");
        employee.setSalary(scanner.nextDouble());

        scanner.nextLine(); // Consume the newline character left by nextDouble()

        System.out.println("Enter Employee Designation: ");
        employee.setDesignation(scanner.nextLine());

        scanner.close();
    }

    @Override
    public void findInsuranceScheme(Employee employee) {
        // Placeholder logic to determine insurance scheme based on salary and designation
        if (employee.getSalary() > 50000) {
            employee.setInsuranceScheme("Platinum");
        } else if (employee.getSalary() > 30000) {
            employee.setInsuranceScheme("Gold");
        } else {
            employee.setInsuranceScheme("Silver");
        }
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("\nEmployee Details:\n" + employee.toString());
    }
}