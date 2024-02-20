package Basics;

public class InterestTest {
    public static void main(String[] args){
        InterestDetails interestDetails=new InterestDetails();
        interestDetails.principalAmount=20000;
        interestDetails.time=2;
        interestDetails.rateOfInterest=2;


        CalculateInterest calculateInterest=new CalculateInterest();
        System.out.println(calculateInterest.interest(20000,2,2));
    }
}