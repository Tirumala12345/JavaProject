package Basics;

public class CalculateInterest {
    public int interest(int principalAmount,int time,int rateOfInterest) {
        int totalInterest = (principalAmount * time * rateOfInterest) / 100;
       System.out.println("Total Interest "  + totalInterest);
        int finalAmount = principalAmount + totalInterest;
        return finalAmount;
    }
}
