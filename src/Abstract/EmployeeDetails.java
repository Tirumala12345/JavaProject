package Abstract;

public abstract class EmployeeDetails {
    protected String employeeId;
    protected String employeeName;


    public EmployeeDetails(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    public String displayEmployeeDetails(String employeeId,String employeeName){
        return "Employee Id " +employeeId + "\n Employee Name " + employeeName;

    }

    public  abstract double calculateSalary();

}
