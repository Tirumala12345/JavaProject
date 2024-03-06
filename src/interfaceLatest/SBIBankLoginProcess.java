package interfaceLatest;

import java.util.UUID;

public class SBIBankLoginProcess implements BankLoginService{

    BankOTPValidationService sbiBankLoginService;
    public  SBIBankLoginProcess(){

        sbiBankLoginService=new SBIBankLoginService();
    }
    public  SBIBankLoginProcess( SBIBankLoginService sbiBankLoginService){
        this.sbiBankLoginService=new SBIBankLoginService();
    }

    @Override
    public boolean login(String userName, String password) {
        if(sbiBankLoginService.login(userName, password)){
            String otp=sbiBankLoginService.generateOTP(userName);
            boolean validOtp= false;
            try {
                validOtp = sbiBankLoginService.validateOTP(UUID.randomUUID().toString());
            }catch (InvalidOTPException invalidOTPException){
                System.out.println("Error Occured ;" +invalidOTPException);
                throw new InvalidRunTimeOTPException(invalidOTPException.getCode(),invalidOTPException.getMessage());
            }
            catch (Exception e) {

            }
            if(validOtp){
                System.out.println( " Login Is SuccessFul");
            }else{
                System.out.println( " Invalid OTP ,Login Failed");
            }
            return validOtp;
        }else {
            System.out.println( " Invalid Credentials");
            return false;
        }
    }
}
