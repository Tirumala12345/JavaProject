package Interface;

public class SBIBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccountnumber, String toAccountNumber, int amt) {
        return "Transferred From SBI bank";
    }
}
