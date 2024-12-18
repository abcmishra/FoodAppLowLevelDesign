public class DeliveryAgent {
    private String deliveryAGentId;
    private String agentName;
    private Address address;

    public String getDeliveryAGentId() {
        return deliveryAGentId;
    }

    public void setDeliveryAGentId(String deliveryAGentId) {
        this.deliveryAGentId = deliveryAGentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    private String vehicleDetails;
    private boolean isAvailable;

    public DeliveryAgent(String deliveryAGentId,String agentName,Address address,String vehicleDetails){
        this.deliveryAGentId=deliveryAGentId;
        this.address=address;
        this.vehicleDetails=vehicleDetails;
        this.agentName=agentName;
        this.isAvailable=true;
    }

}
