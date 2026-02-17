abstract class FoodOrder {
    int orderId;
    String customerName;

    FoodOrder(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
    }

    abstract double calculateBill(double amount);
}

class DineInOrder extends FoodOrder {
    int tableNumber;

    DineInOrder(int orderId, String customerName, int tableNumber) {
        super(orderId, customerName);
        this.tableNumber = tableNumber;
    }

    double calculateBill(double amount) {
        return amount + (amount * 0.1); // 10% service charge
    }
}
s