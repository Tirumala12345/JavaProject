package BankEMI;

public class HDFC extends SBI{
    private final double rateOfInterest = 9.0; // Replace with actual HDFC rate

    public HDFC(double principalAmount,int timeInYears)
    {

        super(principalAmount,timeInYears);
    }

    @Override
    public double calculateEMI() {
        int timeInMonths = timeInYears * 12;
        double monthlyInterestRate = rateOfInterest / 12 / 100;
        double term = 1;
        for (int i = 0; i < timeInMonths; i++) {
            term *= (1 + monthlyInterestRate);
        }
        return (principalAmount * monthlyInterestRate * term) / (term - 1);
    }


}