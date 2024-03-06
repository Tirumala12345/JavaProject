package Abstract;

public class HourlyEmployee extends EmployeeDetails{
    private int  hourlyRate;
    private int hourlyWorked;

    public HourlyEmployee(String employeeId, String employeeName, int hourlyRate, int hourlyWorked) {
        super(employeeId, employeeName);
        this.hourlyRate = hourlyRate;
        this.hourlyWorked = hourlyWorked;
    }
    public String displayEmployeeDetails(String employeeId,String employeeName){
        return "Employee Id " +employeeId + "\nEmployee Name " + employeeName;

    }

    public double calculateSalary(){

        return hourlyRate*hourlyWorked;
    }
}
