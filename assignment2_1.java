public class assignment2_1 {
    private int id;
    private String name;
    private double price;

    public assignment2_1(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayProductDetails() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        assignment2_1 product = new assignment2_1(101, "Laptop", 75000);
        product.displayProductDetails();
    }
}
