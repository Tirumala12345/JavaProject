package Gmail;

public class SentMail {
    public String fromMailId;
    public String toMailId;

    public String sendMessage(String fromMailId, String toMailId){
        String localfromMailId="abc@gmail.com";
        String localtoMailId="xyz@gmail.com";
        if(localfromMailId.equals(fromMailId)  &&  localtoMailId.equals(toMailId)){
            return "Hii";
        }else{
            return "Email Address is Wrong";
        }
    }

}
