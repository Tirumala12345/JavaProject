package ProtectedDemo1;

public class EmployeeDetails1 {
    protected String employeeName;
    protected String employeeId;
    protected String companyName;

    public EmployeeDetails1(String employeeName,String employeeId,String companyName){
        this.employeeName=employeeName;
        this.employeeId=employeeId;
        this.companyName=companyName;
    }


    @Override
    public String toString() {
        return "EmployeeDetails1{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
