package interfaceLatest;

public class InvalidRunTimeOTPException extends RuntimeException{
        private String code;
        public InvalidRunTimeOTPException(String errorCode,String message){
            super(message);
            this.code=errorCode;
        }

        public String getCode() {
            return code;
        }
    }

