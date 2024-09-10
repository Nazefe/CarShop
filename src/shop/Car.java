package shop;

public class Car {
    private String model;
    private String color;
    private int quantity;
    private int price;

    public Car(String model, String color, int quantity, int price) {
        this.model = model;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
