package Gmail;

public class GmailLogin {
     boolean login(Gmail gmail){
        String fromMailId="abc@gmail.com";
        String password="1234";

        if(fromMailId.equals(gmail.fromMailId)  &&  password.equals(gmail.password)){
            return true;
        }else{
            return false;
        }
    }
}