import java.util.*;
class ShoppingCart {
    private List<Product> cartItems = new ArrayList<>();

    public void addToCart(Product product) {
        cartItems.add(product);
    }

    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Shopping Cart Contents:");
            for (Product item : cartItems) {
                item.displayDetails();
                System.out.println("-------------------------");
            }
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product item : cartItems) {
            total += item.getPrice();
        }
        return total;
    }
}