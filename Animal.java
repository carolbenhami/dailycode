// Base class
public class Animal{
    // TODO: Define a class called Animal with:
// - A protected String field called name
    protected String name;
    // - A constructor that takes a name and assigns it
    public Animal (String name){
        this.name = name;
    }
    // - A public void method called speak() that prints a generic sound
    public void speak(){
        System.out.println("Yee Haw");
    }
    // - Override toString() to return "Animal: " + name
    @Override
    public String toString (){
        return "Animal :" + name;
    }
    // - Override equals(Object o) to compare names if o is an Animal
    @Override
    public boolean equals(Object o) {
        if (o instanceof Animal) {
            Animal other = (Animal) o;
            return this.name.equals(other.name);
        }
        return false;
    }
}


// Subclass
// TODO: Define a class called Mammal that extends Animal with:
    class Mammal extends Animal{
    // - A protected boolean field called warmBlooded (set to true)
    protected boolean warmBlooded = true;
    // - A protected String field called dietType (e.g., "herbivore")
    protected String dietType;
    // - A protected int field called numLegs (e.g., 4)
    protected int numLegs;
    // - A protected String field called sound (e.g., "growl")
    protected String sound;
    // - A constructor that uses super to set name and sets these fields
    public Mammal(String name, boolean warmBlooded, String dietType, int numLegs, String sound){
        super(name);
        this.warmBlooded = warmBlooded;
        this.dietType = dietType;
        this.numLegs = numLegs;
        this.sound = sound;
    }
    // - Override speak() to print the value of sound prefixed by name
    @Override
    public void speak(){
        System.out.println(name + " goes: " + sound);
    }

    //Aditional Method
    public void performTrick(){
        System.out.println(name + " is performing a trick!");
    }
}

// Subclasses of Mammal
// TODO: Define a class Dog that extends Mammal
    class Dog extends Mammal{
    // - Constructor takes name and passes name, true, "omnivore", 4, "Woof!" to super
    public Dog (String name){
        super(name, true, "omnivore", 4, "woof woof");
    }
    // - Override speak() to print "<name> says: Woof!"
    @Override
    public void speak(){
        System.out.println(name + "says: Woof!");
    }

    //Equals override
    @Override
    public boolean equals(Object o) {
        if (o instanceof Dog) {
            Dog other = (Dog) o;
            return this.name.equals(other.name);
        }
        return false;
    }
}

// TODO: Define a class Cat that extends Mammal
    class Cat extends Mammal{
    // - Constructor takes name and passes name, true, "carnivore", 4, "Meow!" to super
    public Cat(String name){
        super(name, true, "carnivore", 4, "meow");
    }
    // - Override speak() to print "<name> says: Meow!"
    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }
}

// TODO: Define a final class Human that extends Mammal
    final class Human extends Mammal{
    // - Constructor takes name and passes name, true, "omnivore", 2, "Hello!" to super
    public Human (String name){
        super (name, true, "omnivore", 2, "Words!!");
    }
}

// TODO: Define a class Reptile that extends Animal
    class Reptile extends Animal{
    // - Add fields: boolean warmBlooded (set to false), int numLegs, String dietType, String sound
    private boolean warmBlooded = false;
    private int numLegs;
    private String dietType;
    private String sound;
    // - Constructor should take all values and use super for name
    public Reptile(String name, int numLegs, String dietType, String sound){
        super(name);
        this.warmBlooded = warmBlooded;
        this.numLegs = numLegs;
        this.dietType = dietType;
        this.sound = sound;
    }
    // - Override speak() to print the value of sound prefixed by name
    @Override
    public void speak(){
        System.out.println(name + " says: " + sound);
    }
}

//Adittional animal
    class Fish extends Animal{
    private String sound;

    public Fish (String name){
        super (name);
        this.sound = "GlubGlub!";
    }

    @Override
    public void speak(){
        System.out.println(name + " says: " + sound);
    }
}

// Main class to test
// TODO: Define class AnimalKingdomTest with a main method
    class AnimalKingdomTest{
    public static void main(String [] args){
        // - Create Animal a1 = new Dog("Buddy")
        Animal a1 = new Dog ("Buddy");
        // - Create Animal a2 = new Cat("Whiskers")
        Animal a2 = new Cat ("Whiskers");
// - Call speak() on both (demonstrating polymorphism)
        a1.speak();
        a2.speak();
// - Print both using System.out.println
        System.out.println(a1);
        System.out.println(a2);
        // - Use equals() to compare a1 to a new Dog("Buddy")
        Animal newDog = new Dog ("Buddy");
        System.out.println(a1.equals(newDog));

        Dog newDog2 = new Dog("Buddy");
        newDog2.speak();
        newDog2.performTrick();
    }
}


// Additional TODOs:
// 1. Create a new subclass of Animal (e.g., Bird) and override speak()
// 2. Try to extend Human – what happens and why?
//Error because Human class was creates as final.
// 3. Override equals() in Dog or Cat to also check the type
// 4. Add a method to Mammal called performTrick() and call it via downcasting
