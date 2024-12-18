public class MenuItem {
    private String itemId;
    private String itemName;
    private  boolean isAvailable;
    private Cuisine cuisineType;
    private String description;
    private double price;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Cuisine getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(Cuisine cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MenuItem(String itemId, String itemName, boolean isAvailable, Cuisine cuisineType, String description, double price){
        this.itemId=itemId;
        this.itemName=itemName;
        this.cuisineType=cuisineType;
        this.description=description;
        this.price=price;
    }


}
