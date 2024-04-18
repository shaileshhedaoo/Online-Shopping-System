import java.util.*;
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adding Electronics to the Cart:");
        System.out.print("Enter product name: ");
        String electronicsName = scanner.nextLine();
        System.out.print("Enter product ID: ");
        int electronicsId = scanner.nextInt();
        System.out.print("Enter price: ");
        double electronicsPrice = scanner.nextDouble();
        System.out.print("Enter quantity in stock: ");
        int electronicsQuantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter brand: ");
        String electronicsBrand = scanner.nextLine();
        System.out.print("Enter warranty period (months): ");
        int warrantyPeriod = scanner.nextInt();

        Electronics electronics = new Electronics(electronicsName, electronicsId, electronicsPrice, electronicsQuantity, electronicsBrand, warrantyPeriod);
        cart.addToCart(electronics);

        System.out.println("Adding Clothing to the Cart:");
        System.out.print("Enter product name: ");
        String clothingName = scanner.next();
        System.out.print("Enter product ID: ");
        int clothingId = scanner.nextInt();
        System.out.print("Enter price: ");
        double clothingPrice = scanner.nextDouble();
        System.out.print("Enter quantity in stock: ");
        int clothingQuantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter size: ");
        String size = scanner.nextLine();
        System.out.print("Enter material: ");
        String material = scanner.nextLine();

        Clothing clothing = new Clothing(clothingName, clothingId, clothingPrice, clothingQuantity, size, material);
        cart.addToCart(clothing);

        // Displaying cart contents and total price
        System.out.println("\nCart Contents:");
        cart.displayCart();
        System.out.println("\nTotal Price: $ " + cart.calculateTotalPrice());

        scanner.close();
    }
}