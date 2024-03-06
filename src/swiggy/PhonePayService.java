package swiggy;

public class PhonePayService extends SwiggyOrder{
    private int balance=2000;

    public int pin=1234;
    public int transactionId=4567;
    public int merchantId=1245;

    private int price=180;

    public String nextprocess;


    public PhonePayService(int orderId, String foodItem,int quantity, String restaurantName,
                           String deliveryAddress,String nextprocess) {
        setOrderId(orderId);
        setFoodItem(foodItem);
        setQuantity(quantity);
        this.restaurantName = restaurantName;
        this.deliveryAddress = deliveryAddress;
        this.nextprocess=nextprocess;

    }

    @Override
    public String phonePay() {

        int localPin = 1234;
        int localTransactionId = 4567;
        int localMerchantId = 1245;
        String localnextprocess="Order Confirm";
        if(localnextprocess.equals(nextprocess)) {
            if (localTransactionId == transactionId && localMerchantId == merchantId && localPin == pin) {
                int n = balance - getQuantity() * price;
                System.out.println(" Order Confirm   "+"Remaining balance:   " + n + "/-");
                return "Transcation Successfull";

            } else {
                return "Wrong Pin";
            }
        }else{
            System.out.println("order has been canceled, "+ "Available balance: "+balance);
            return  "balance";
        }

    }


    @Override
    public void calculateTotalAmount() {

        setTotalAmount(getQuantity()*price);
    }


    @Override
    public void displayOrderDetails() {
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Food Item: " + getFoodItem());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Total Amount: " + getTotalAmount()+"/- (180/- per each)");
    }

}