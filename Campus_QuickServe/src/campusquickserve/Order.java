package campusquickserve;

public class Order {
    
    // Constant
    public static final double VAT_RATE = 0.15;
    
    // Attributes
    private String customerName;
    private String studentNumber;
    private String itemOrdered;
    private int quantity;
    private double pricePerItem;
    
    // Constructor
    public Order(String customerName, String studentNumber, String itemOrdered, int quantity, double pricePerItem) {
        this.customerName = customerName;
        this.studentNumber = studentNumber;
        this.itemOrdered = itemOrdered;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    // Method to calculate subtotal
    public double calculateSubtotal() {
        return quantity * pricePerItem;
    }
    
    // Method to calculate VAT
    public double calculateVAT() {
        return calculateDiscountedSubtotal() * VAT_RATE;
    }
    
    // Method to calculate total
    public double calculateTotal() {
        return calculateDiscountedSubtotal() + calculateVAT();
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getItemOrdered() {
        return itemOrdered;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    
    public double calculateDiscount() {
    if (quantity > 3) {
        return calculateSubtotal() * 0.10;
    }
    return 0;
}
    
    public double calculateDiscountedSubtotal() {
    return calculateSubtotal() - calculateDiscount();
}
    
}