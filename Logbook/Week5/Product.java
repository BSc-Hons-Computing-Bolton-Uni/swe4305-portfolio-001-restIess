package Logbook.Week5;

public class Product {
    private int id;
    private String name;
    private int quantity;

    // constructor
    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // displaying product details
    public void print() {
        System.out.println("Product ID: " + id + ", Name: " + name + ", Quantity: " + quantity);
    }
}
