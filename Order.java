import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<OrderItem> orderItemsList;
    private User user;
    private Restaurant restaurant;
    private Delivery deliveryDetails;
    private Payment paymentDetails;
    private Status status;

    public Order(String orderId,User user,Restaurant restaurant,Delivery deliveryDetails,Payment paymentDetails,Status status){
        this.orderItemsList= new ArrayList<>();
        this.orderId=orderId;
        this.restaurant=restaurant;
        this.deliveryDetails=deliveryDetails;
        this.paymentDetails=paymentDetails;
        this.status=status;

    }




}
