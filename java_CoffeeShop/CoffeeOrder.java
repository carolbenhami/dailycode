public class CoffeeOrder {
    // TODO 1: Change the class name to CoffeeOrder

    // TODO 2: Create instance variables:
    // - size (String)
    String size = "";
    // - type (String)
    String type = "";
    // - orderID (String, make this one private)
    private String orderID = "";

    // TODO 3: Add a static int variable called totalOrders
    static int totalOrders = 0;

    // TODO 4: Create a no-arg constructor
    CoffeeOrder() {
        // Set size to "medium" and type to "black"
        this.size = "medium";
        this.type = "black";
        // Increment totalOrders
        totalOrders++;
    }

    // TODO 5: Create a constructor that takes a size only
    CoffeeOrder(String size) {
        // Set type to "black" by default
        this.size = size;
        this.type = "black";
        // Increment totalOrders
        totalOrders++;
    }

    // TODO 6: Create a constructor that takes size and type
    CoffeeOrder(String size, String type) {
    // Increment totalOrders
        this.size = size;
        this.type = type;
        totalOrders++;
    }

    // TODO 7: Create a method describeOrder() that returns
    void describeOrder() {
        // something like "Order: medium black"
        System.out.println("Order: " + size + " " + type);
    }

    // TODO 8: Add a static method getTotalOrders() to return totalOrders
    static int getTotalOrders(){
        return totalOrders;
    }
}
