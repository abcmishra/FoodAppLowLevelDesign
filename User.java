import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String userId;
    private String email;
    private Address address;
    private List<Order> orderHistory;

    public User(String userName,String userId,String email,Address address){
        this.userId=userId;
        this.userName=userName;
        this.email=email;
        this.address=address;
        this.orderHistory= new ArrayList<>();
    }

    public void placeOrder(Order order){
        if(!orderHistory.contains(order))
            orderHistory.add(order);
        else throw  new IllegalArgumentException("Order already included");
    }

    public void showOrderHistory(){
        if(orderHistory.isEmpty()){
            System.out.println("No orders placed by the user");
        }
        else {
            for(Order order:orderHistory){
                System.out.println("Users order: "+order);
            }
        }
    }

    public Order getOrderById(String orderId){
        for(Order order:orderHistory){
            if(orderHistory.equals(orderId)){
                return order;
            }
        }
        return null;

    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
}
