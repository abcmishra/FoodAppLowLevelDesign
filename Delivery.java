import java.util.Date;

public class Delivery {
    private int deliveryId;
    private int deliveryAgentId;
    private DeliveryStatus deliveryStatus;
    private Date estimatedDeliveryTime;


    public Delivery(int deliveryAgentId, int deliveryId, DeliveryStatus deliveryStatus, Date estimatedDeliveryTime){
        this.deliveryAgentId=deliveryAgentId;
        this.deliveryStatus=deliveryStatus;
        this.estimatedDeliveryTime=estimatedDeliveryTime;
    }
    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getDeliveryAgentId() {
        return deliveryAgentId;
    }

    public void setDeliveryAgentId(int deliveryAgentId) {
        this.deliveryAgentId = deliveryAgentId;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Date getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(Date estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }





}
