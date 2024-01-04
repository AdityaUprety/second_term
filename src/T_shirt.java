public class T_shirt {
    String name;
    int productCode;
    double price;
    String brand;
    String description;
    String[] sizes;

    // Constructor
    public T_shirt(String name, int productCode, double price, String brand, String description, String[] sizes) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }

    // Getter and Setter methods (if needed)

    public String describeTShirt() {
        // Method to describe the T-shirt in the required format
        System.out.println("Describing T-shirt: " + name);

        String tShirtDescription = "Item name: " + name + "\n";
        tShirtDescription += "Description: " + this.description + "\n";
        tShirtDescription += "Product code: " + productCode + "\n";
        tShirtDescription += "Brand: " + brand + "\n";
        tShirtDescription += "Price: " + price + "\n";
        tShirtDescription += "Sizes: " + String.join(", ", sizes) + "\n";

        return tShirtDescription;
    }
}



