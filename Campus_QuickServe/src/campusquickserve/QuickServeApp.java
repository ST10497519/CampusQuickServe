package campusquickserve;

import javax.swing.JOptionPane;

public class QuickServeApp {

    public static void main(String[] args) {
        
        // Accept input using JOptionPane
        String customerName = JOptionPane.showInputDialog("Enter customer name:");
        String studentNumber = JOptionPane.showInputDialog("Enter student number:");
        String itemOrdered = JOptionPane.showInputDialog("Enter item ordered:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
        double pricePerItem = Double.parseDouble(JOptionPane.showInputDialog("Enter price per item:"));
        
        // Create Order object
        Order order = new Order(customerName, studentNumber, itemOrdered, quantity, pricePerItem);
        
        // Display formatted receipt in console
        System.out.println("------ CAMPUS QUICKSERVE ------");
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Student Number: " + order.getStudentNumber());
        System.out.println();
        System.out.println("Item Ordered: " + order.getItemOrdered());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.printf("Price per Item: R%.2f%n", order.getPricePerItem());
        System.out.println();
        System.out.printf("Subtotal: R%.2f%n", order.calculateSubtotal());
        System.out.printf("Discount Applied: R%.2f%n", order.calculateDiscount());
        System.out.printf("VAT (15%%): R%.2f%n", order.calculateVAT());
        System.out.printf("Total: R%.2f%n", order.calculateTotal());
        System.out.println();
        System.out.println("Thank you for your order!");
        System.out.println("--------------------------------");
    }
}