package interfaceLatest;

public class InvalidOTPException extends Exception{
    private String code;
    public InvalidOTPException(String code,String message){
        super(message);
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
