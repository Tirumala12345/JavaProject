package OnlineOrder;

public class LoginProcess {
    boolean login(OrderDetails details){
        String localId="1234 1234 1234";
        String localPassword="1234";
        if(localId.equals(details.id)  &&  localPassword.equals(details.password)){
            return true;
        }else{
            return false;
        }
    }
}
