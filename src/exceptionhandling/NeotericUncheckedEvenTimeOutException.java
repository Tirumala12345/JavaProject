package exceptionhandling;

public class NeotericUncheckedEvenTimeOutException extends RuntimeException{
    public String code;

    public NeotericUncheckedEvenTimeOutException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
