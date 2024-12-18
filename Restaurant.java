import java.util.List;

public class Restaurant {
    private String restaurantId;
    private String restaurantName;
    private  Address address;
    private List<MenuItem> menuItemList;
    private int ratings;

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    private String contactNumber;

    public Restaurant(String  restaurantName,String restaurantId,int ratings,String contactNumber,Address address){
        this.restaurantId=restaurantId;
        this.restaurantName=restaurantName;
        this.ratings=ratings;
        this.contactNumber=contactNumber;
        this.address=address;
    }


}
