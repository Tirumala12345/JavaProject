package Gmail;

public class GmailTest {
    public static void main(String []args){
        GmailLogin gmailLogin =new GmailLogin();
        Gmail gmail=new Gmail();
        gmail.fromMailId="abc@gmail.com";
        gmail.password="1234";
        SentMail sentMail=new SentMail();
        sentMail.fromMailId="abc@gmail.com";
        sentMail.toMailId="xyz@gmail.com";
        boolean loginstatus=gmailLogin.login(gmail);
        if(loginstatus){
            System.out.println(sentMail.sendMessage("abc@gmail.com","xyz@gmail.com"));
        }
    }
}
