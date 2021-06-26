package com.pankaj.designPattern.BuilderPattern;

public class Employee {
    String strFirstName =  null;
    String strLastName = null;
    Integer intSalary = null;

    @Override
    public String toString() {
        return "Employee{" +
                "strFirstName='" + strFirstName + '\'' +
                ", strLastName='" + strLastName + '\'' +
                ", intSalary=" + intSalary +
                '}';
    }

    public Employee(EmployeeBuilder employeeBuilder){
        this.strFirstName = employeeBuilder.strFirstName;
        this.strLastName = employeeBuilder.strLastName;
        this.intSalary = employeeBuilder.intSalary;
    }

    public static class EmployeeBuilder{
        String strFirstName =  null;
        String strLastName = null;
        Integer intSalary = null;

        public EmployeeBuilder Name(String firstName , String lastName){
            this.strFirstName = firstName;
            this.strLastName = lastName;
            return this;
        }

        public EmployeeBuilder salary(Integer sal){
            this.intSalary = sal;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}
