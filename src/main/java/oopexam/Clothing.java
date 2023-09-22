package oopexam;

public class Clothing extends Person {
    private String itemName;
    private String description;
    private Size size;

    private double price;

    public Clothing (String itemName, String description, Size size, double price) {
        this.itemName = itemName;
        this.description = description;
        this.size = size;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Clothing{" +
                "itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", size=" + size + ", price=" + price + '}';
    }
}
