package Abstract;

public class AbstractTest {
    public static void main(String[] args) {

        HourlyEmployee hourlyEmployee=new HourlyEmployee("1234","Tirumala",
                1000,10);
        System.out.println(hourlyEmployee.displayEmployeeDetails("1234","Tirumala"));
        System.out.println("Salary is " + hourlyEmployee.calculateSalary());


        SalariedEmployee salariedEmployee=new SalariedEmployee("5678","Supriya",
                25000);
        System.out.println(salariedEmployee.displayEmployeeDetails("5678","Supriya"));
        System.out.println("Salary is " + salariedEmployee.calculateSalary());


        ContractEmployee contractEmployee=new ContractEmployee("1638","Priya",
                3,1500,15);
       System.out.println(contractEmployee.displayEmployeeDetails("1638","Priya"));

        System.out.println("Salary is " + contractEmployee.calculateSalary());
    }
}
