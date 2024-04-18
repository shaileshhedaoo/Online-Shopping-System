import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Product implements Displayable {
    private String productName;
    private int productId;
    private double price;
    private int quantityInStock;

    public Product(String productName, int productId, double price, int quantityInStock) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }
}
