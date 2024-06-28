import java.util.Scanner;

class Product {
    private String Name;
    private double Price;
    private int Qty;

    public void setName(String name) {
        this.Name = name;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public void setQty(int qty) {
        this.Qty = qty;
    }

    public void ShowDetails() {
        double totalPrice = this.Price * this.Qty;
        System.out.println("Name: " + this.Name);
        System.out.println("Price: " + this.Price + " baht");
        System.out.println("Quantity: " + this.Qty);
        System.out.println("Total Price: " + totalPrice + " baht");
    }
}

public class LAB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter product price (baht): ");
            double price = scanner.nextDouble();

            System.out.print("Enter product quantity: ");
            int qty = scanner.nextInt();
            scanner.nextLine();

            Product product = new Product();
            product.setName(name);
            product.setPrice(price);
            product.setQty(qty);

            product.ShowDetails();

            System.out.print("Do you want to continue? (y/n): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                running = false;
            }
        }

        scanner.close();
    }
}