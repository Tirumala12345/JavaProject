package PrivateDemo;

public class EmployeeDetails {

    private String employeeName;
    private String employeeId;
    private String companyName;


    public EmployeeDetails(String employeeName,String employeeId,String companyName){
        this.employeeName=employeeName;
        this.employeeId=employeeId;
        this.companyName=companyName;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }
    public String getEmployeeId()
    {
        return this.employeeId;
    }
    public String getCompanyName()
    {
        return this.companyName;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
