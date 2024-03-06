package interfaceLatest;

public enum ErrorCodes {
    NEOTERIC_ERROR_1000("NEO_ERR_1000","INVALID OTP"),
    NEOTERIC_EXPIRY_OTP_1000("NEOTECH_EX_1001","EXPIRY OTP");
    String code;
    String message;
    ErrorCodes(String errorCode,String message){
        this.code=errorCode;
        this.message=message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
