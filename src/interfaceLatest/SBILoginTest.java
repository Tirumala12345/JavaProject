package interfaceLatest;

public class SBILoginTest {
    public static void main(String[] args) {
        BankLoginService loginService = new SBIBankLoginProcess();
        try {
            boolean loginStatus = loginService.login("1111", "1234");
            if (loginStatus) {
                System.out.println("Login SuccessFul");
            } else {
                System.out.println("Login Failed ");
            }
        } catch (InvalidRunTimeOTPException e) {
            System.out.println(e.getCode() + "  " + e.getMessage());
        }
    }
}