import java.util.ArrayList;

public class shopping {

    private ArrayList<Product> products;

    public shopping() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }
    public void removeProduct(String productName) {
        boolean removed = false;

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(productName)) {
                products.remove(p);
                System.out.println(productName + " removed from cart.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Product not found in cart.");
        }
    }

    public double calculateTotalCost() {
        double total = 0;

        for (Product p : products) {
            total += p.getPrice();
        }

        return total;
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("Products in Cart:");
        for (Product p : products) {
            System.out.println("Name: " + p.getName() + 
                               " | Price: ₹" + p.getPrice());
        }

        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}


