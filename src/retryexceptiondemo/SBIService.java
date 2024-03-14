package retryexceptiondemo;

public class SBIService {
    int i=0;
    public String transfer(){
        i=i+1;
        System.out.println("SBI Service I value is" +i);
        if(i%2==0){
            throw new InsufficientFundsException(ErrorCodes.INSUFFICIENT_NUMBER_CODE.getCode(),
                    ErrorCodes.INSUFFICIENT_NUMBER_CODE.getMessage());
        }else{
            throw new TimeOutException(ErrorCodes.TIMEOUT_ERROR_CODE.getCode(),
                    ErrorCodes.TIMEOUT_ERROR_CODE.getMessage());
        }
    }
}
