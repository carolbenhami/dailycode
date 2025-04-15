// SuperStore Exercise: Access Modifiers & Object Modeling Focus

// TODO: Define a class called Product with:
class Product{

    // - A protected String field called name
    protected String name;

    // - A protected double field called price
    protected double price;

    // - A private final int productId
    private final int productId;

    // - A public static int nextId to help generate unique IDs
    public static int nextId = 1000;

    // - A constructor that sets name, price, and assigns a unique ID
    public Product (String name, double price){
        this.name = name;
        this.price = price;
        this.productId = nextId++;
    }

    // - Public getters for all fields
    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    int getProductId(){
        return this.productId;
    }

    // - Override toString() to return formatted product details
    @Override
    public String toString() {
        return name + " ID: " + productId + " costs $" + price;
    }

    // - Override equals(Object o) to compare name and productId
    @Override
    public boolean equals(Object o){
        //Check if both references point to the same object in memory
        if (this == o){
            return true;
        }

        // If o is not Product (or subclass), they can't be equal
        if (!(o instanceof Product)) {
            return false;
        }

        Product product = (Product) o;

        //Compare name and productId
        if(name.equals(product.name) && productId == product.productId){
            return true;
        }
        else{
            return false;
        }
    }
}


// TODO: Define a subclass Electronics that extends Product
class Electronics extends Product{
    // - Add a private String field called brand
    private String brand;
    // - Add a private boolean field called hasBattery
    private boolean hasBattery;
    // - Constructor takes all fields and uses super for shared ones
    public Electronics(String name, double price, String brand, boolean hasBattery){
        super(name, price);
        this.brand = brand;
        this.hasBattery = hasBattery;
    }
    // - Override toString() to include brand and battery status
    @Override
    public String toString() {
        return "Product: " + name + "\nBrand: " + brand + "\nPrice: $ " + price + "\nHas Battery: " + hasBattery + "\n\n";
    }
}


// TODO: Define a subclass Grocery that extends Product
class Grocery extends Product{

    // - Add a private double field called weight (in kg)
    private double weight;

    // - Add a private boolean field called isPerishable
    private boolean isPerishable;

    // - Constructor takes all fields and uses super for shared ones
    public Grocery (String name, double price, double weight, boolean isPerishable){
        super(name, price);
        this.weight = weight;
        this.isPerishable = isPerishable;
    }

    // - Override toString() to include weight and perishability
    @Override
    public String toString() {
        return "Product: " + name + "\nWeights: " + weight + "kgs \nCosts: $" + price + "\nIs perishable? " + isPerishable + "\n\n";
    }
}


// TODO: Define a final class Toy that extends Product
final class Toy extends Product{
    // - Add a private int field called minAge
    private int minAge;
    // - Constructor takes all fields and uses super for shared ones
    public Toy(String name, double price, int minAge){
        super(name, price);
        this.minAge = minAge;
    }
    // - Override toString() to include minAge
    @Override
    public String toString() {
        return "Product: " + name + "\nCosts: $" + price + "\nMin Age: " + minAge + "\n\n";
    }
}


// TODO: Define class SuperStoreTest with a main method
class SuperStoreTest{
    public static void main(String[] args) {

        // - Create at least one instance of each subclass
        Electronics iphone = new Electronics("Iphone", 1000.00, "Apple", true);
        Grocery steak = new Grocery("Steak", 19.00, 2.7, true);
        Toy toy = new Toy ("Mr. Potato Head", 29.00, 3);

        // - Store them in a Product[] array
        String[] Product = {iphone.toString(), steak.toString(), toy.toString()};

        // - Loop through and print each item
        for (int i = 0; i < 3; i++){
            System.out.println(Product[i]);
        }

        // - Call equals() to compare two products with the same ID and name
        System.out.println(iphone.equals(iphone));
    }
}


// Additional TODOs:
// 1. Try to extend Toy — what happens and why?
//Cannot because the class is final
// 2. Make a class Coupon with a final discountRate and apply it to a Product
// 3. Add a method to Electronics called warrantyInfo() and mark it final
// 4. Use access modifiers appropriately and explain your choices in comments
