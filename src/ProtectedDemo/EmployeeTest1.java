package ProtectedDemo;

import ProtectedDemo1.EmployeeDetails1;

public class EmployeeTest1 extends EmployeeDetails1 {
    public EmployeeTest1(String employeeName, String employeeId, String companyName) {
        super(employeeName, employeeId, companyName);
    }

    public static void main(String[] args){
        EmployeeDetails1 employeeDetails1=new EmployeeDetails1("Tirumala","123","Neoteric");
        System.out.println(employeeDetails1);

    }
}