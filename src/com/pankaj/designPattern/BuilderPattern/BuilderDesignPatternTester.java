package com.pankaj.designPattern.BuilderPattern;

public class BuilderDesignPatternTester {

    public static void main(String [] args){
        Employee.EmployeeBuilder builder = new Employee.EmployeeBuilder();
        Employee employee = builder.Name("Pankaj","Kumar").salary(1000).build();

        System.out.println("Employee : " +employee);
    }
}
