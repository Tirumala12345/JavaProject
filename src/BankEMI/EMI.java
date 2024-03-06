package BankEMI;

public class EMI {
    protected double principalAmount;

    int timeInYears;

    public EMI(double principalAmount,int timeInYears) {
        this.principalAmount = principalAmount;
        this.timeInYears=timeInYears;
    }

    public double calculateEMI() {

        return timeInYears;
    }

    public void displayDetails() {
        System.out.println("Principal Amount: " + principalAmount);
        System.out.println("Monthly EMI for 1 year and Remaining Principal Amount:");

        double remainingPrincipal = principalAmount;
        int n =timeInYears*12;
        for (int i = 1; i <= n; i++) {
            double emi = calculateEMI();
            remainingPrincipal -= emi;
            System.out.println("Month " + i + ": EMI - " + emi + ", Remaining Principal Amount - " + remainingPrincipal);
        }
    }
}