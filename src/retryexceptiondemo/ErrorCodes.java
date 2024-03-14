package retryexceptiondemo;

public enum ErrorCodes {
    TIMEOUT_ERROR_CODE("1000","Even Number Exception"),
    INSUFFICIENT_NUMBER_CODE("1001","Odd Number Exception");

    private String code;
    private String message;

    ErrorCodes(String code,String message){
        this.code=code;
        this.message=message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
