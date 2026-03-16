package com.demo.lab1_2;

public class Employee {

    private int empId;
    private String empName;
    private double salary;
    private int age;
    private SBU sbu;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSbu(SBU sbu) {
        this.sbu = sbu;
    }

    public void display() {

        System.out.println("Employee Details");
        System.out.println("****************");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);

        System.out.println(sbu.getSBUDetails());
    }
}