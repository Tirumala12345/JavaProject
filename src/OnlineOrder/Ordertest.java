package OnlineOrder;

public class Ordertest {
    public static void main(String[] args){
        LoginProcess loginProcess=new LoginProcess();
        OrderDetails orderDetails=new OrderDetails();
        orderDetails.id="1234 1234 1234";
        orderDetails.password="1234";
        boolean loginStatus=loginProcess.login(orderDetails);
        System.out.println(loginStatus);
        if(loginStatus){
            ItemPrice itemPrice=new ItemPrice();
            Products product=new Products();
            product.chain=2;
            int itemsAdded=itemPrice.items(product);
            System.out.println("Total Items:"+" " +itemsAdded);
        }
    }
}