package OnlineOrder;

public class ItemPrice {
    int orderItems;
    int chainPrice=600;
    int totalPrice;
    public int items(Products product){
        if(orderItems<product.chain){
            orderItems=product.chain;
            totalPrice=product.chain*chainPrice;
            System.out.println("Total Price"+" "+ totalPrice);
        }else{
            System.out.println("Add Items");
        }
        return orderItems;
    }
}
