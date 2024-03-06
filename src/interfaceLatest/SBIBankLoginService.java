package interfaceLatest;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

public class SBIBankLoginService implements BankOTPValidationService{

    String accountNumber="1111";
    String password="1234";
    String otp;
    Date otpExpireTime;
    public SBIBankLoginService(){}

    public boolean login(String userName,String password){
        if(userName.equals(accountNumber)  && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    @Override
    public String generateOTP(String accountNumber) {
        if(this.accountNumber.equals(accountNumber)){
             otp=UUID.randomUUID().toString();
             otpExpireTime=new Date();
             return otp;
        }
        return null;
    }

    @Override
    public boolean validateOTP(String otp) throws InvalidOTPException {
        if(this.otp.equals(otp)){
            return true;
        }else{
            System.out.println("Invalid OTP");
            throw new InvalidOTPException(ErrorCodes.NEOTERIC_ERROR_1000.getCode(),
                    ErrorCodes.NEOTERIC_ERROR_1000.getMessage());

        }
        //return false;
    }
}
