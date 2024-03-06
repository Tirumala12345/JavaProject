package BankEMI;

public class Test {
    public static void main(String[] args) {

        SBI sbi = new SBI(100000, 1);
        HDFC hdfc = new HDFC(150000, 2);

        System.out.println("SBI Details:");
        sbi.displayDetails();

        System.out.println(" HDFC Details:");
        hdfc.displayDetails();
    }
}
