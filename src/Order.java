import java.util.Arrays;

public class Order {
    String name;
    String phoneNumber;
    int[] items;
    double[] prices;

    // Constructor
    public Order(String name, String phoneNumber, int[] items, double[] prices) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.prices = prices;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Repeat above for other fields (if needed)

    public String generateBill() {
        // Method to print the bill with VAT and total price
        double vatRate = 0.13;
        double totalAmount = 0;

        for (double price : prices) {
            totalAmount += price;
        }

        double vatAmount = totalAmount * vatRate;
        totalAmount += vatAmount;

        System.out.println("Calculating bill for " + name);

        StringBuilder bill = new StringBuilder();
        bill.append("Order details:\n");
        bill.append("Name: ").append(name).append("\n");
        bill.append("Phone number: ").append(phoneNumber).append("\n\n");
        bill.append("Items: ").append(Arrays.toString(items)).append("\n");
        bill.append("Prices: ").append(Arrays.toString(prices)).append("\n\n");
        bill.append("VAT (13%): ").append(vatAmount).append("\n");
        bill.append("Total Price: ").append(totalAmount).append("\n");

        return bill.toString();
    }

    public static void main(String[] args) {
        // Demonstrate the Order class
        Order order1 = new Order("Gopal Sharma", "0486756465", new int[]{572, 681}, new double[]{1235, 1780});

        // Print the generated bill
        System.out.println("Generating bill for order1:");
        System.out.println(order1.generateBill());
    }
}
