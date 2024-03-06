package swiggyDemo.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<OrderItem> orderItemList=new ArrayList<>();
    private double price;
    private double serviceCharges;
    private int tip;
    private String status;

    public Order( double price, double serviceCharges, int tip) {
         this.price = price;
        this.serviceCharges = serviceCharges;
        this.tip = tip;
    }

    public Order(){

    }

    public void addItem(OrderItem item){
        orderItemList.add(item);
        price=price+item.getPrice();
    }

    public void removeItem(OrderItem item){
        orderItemList.remove(item);
        price=price-item.getPrice();
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public double getPrice() {
        return price;
    }

    public double getServiceCharges() {

        return serviceCharges;
    }

    public int getTip() {
        return tip;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getStatus() {
        return status;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setServiceCharges(double serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
