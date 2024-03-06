package Interface;

public class HDFCBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccountnumber, String toAccountNumber, int amt) {
        return "HDFC Transfer";
    }
}
