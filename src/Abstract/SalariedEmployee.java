package Abstract;

public class SalariedEmployee extends EmployeeDetails {
    private int monthlySalary;

    public SalariedEmployee(String employeeId, String employeeName, int monthlySalary) {
        super(employeeId, employeeName);
        this.monthlySalary = monthlySalary;
    }
    public String displayEmployeeDetails(String employeeId,String employeeName){
        return "Employee Id " +employeeId + "\nEmployee Name " + employeeName;

    }
    public double calculateSalary()
    {
        return monthlySalary;
    }

}
