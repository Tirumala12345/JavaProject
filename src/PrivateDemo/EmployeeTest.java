package PrivateDemo;

public class EmployeeTest {
    public static void main(String[] args){

        EmployeeDetails employeeDetails=new EmployeeDetails("Tirumala","123","Neoteric");
        employeeDetails.getEmployeeName();
        employeeDetails.getEmployeeId();
        employeeDetails.getCompanyName();
        System.out.println(employeeDetails);
    }
}
