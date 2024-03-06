package Abstract;

public class ContractEmployee extends EmployeeDetails{
    private int contractDuration;
    private int hourlyRate;
    private int totalHoursWorked;

    public ContractEmployee(String employeeId, String employeeName, int contractDuration, int hourlyRate, int totalHoursWorked) {
        super(employeeId, employeeName);
        this.contractDuration = contractDuration;
        this.hourlyRate = hourlyRate;
        this.totalHoursWorked = totalHoursWorked;
    }
    public String displayEmployeeDetails(String employeeId,String employeeName){
        return "Employee Id " +employeeId + "\nEmployee Name " + employeeName;

    }
    public double calculateSalary(){
        return hourlyRate*totalHoursWorked;
    }

}
