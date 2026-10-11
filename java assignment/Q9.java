
// Create a "Product" class to calculate the final bill for a product purchase.

// Requirements:
// Store product name, product ID, unit price, and quantity as private fields.
// Initialize product details using a constructor.
// Calculate the subtotal using a separate method.
// Apply a discount based on the subtotal:
// Subtotal| Discount
// Below ₹1,000| 0%
// ₹1,000–₹4,999.99| 5%
// ₹5,000–₹9,999.99| 10%
// ₹10,000 or more| 15%
// Calculate the discount amount and final bill.
// Reject invalid prices and quantities.

class Product {
    private String name;
    private int productId;
    private double unitPrice;
    private int quantity;

    public Product(String name, int productId, double unitPrice, int quantity) {
        if (unitPrice <= 0) throw new IllegalArgumentException("Unit price must be positive.");
        if (quantity <= 0) throw new IllegalArgumentException("Quantity must be positive.");
        this.name = name;
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public double calculateSubtotal() { return unitPrice * quantity; }
    private double discountRate(double subtotal) {
        if (subtotal >= 10000) return 0.15;
        if (subtotal >= 5000)  return 0.10;
        if (subtotal >= 1000)  return 0.05;
        return 0.0;
    }
    public double calculateDiscount() {
        double s = calculateSubtotal();
        return s * discountRate(s);
    }
    public double calculateFinalBill() { return calculateSubtotal() - calculateDiscount(); }
    public void displayBill() {
        System.out.println("Product Name: " + name);
        System.out.println("Product ID: " + productId);
        System.out.println("Subtotal: " + calculateSubtotal());
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Bill: " + calculateFinalBill());
    }
}

public class Q9 {
    public static void main(String[] args) {
        new Product("Keyboard", 501, 2000, 3).displayBill();
    }
}