public class Animals {
    // TODO: Define a class called Animal with:
    public class Animal {
        // - A protected String field called name
        protected String name;
        // - A constructor that takes a name and assigns it
        Animal (String name){
            this.name = name;
        }
        // - A public void method called speak() that prints a generic sound
        void speak(){
            System.out.print("Yee-Haw");
        }
        // - Override toString() to return "Animal: " + name
        @Override
        public String toString(){
            return "Animal: " + name;
        }
        // - Override equals(Object o) to compare names if o is an Animal
    }

    // Subclass
    // TODO: Define a class called Mammal that extends Animal with:
    public class Mammal extends Animal {
        // - A protected boolean field called warmBlooded (set to true)
        protected boolean warmBlooded = true;
        // - A protected String field called dietType (e.g., "herbivore")
        protected String dietType;
        // - A protected int field called numLegs (e.g., 4)
        protected int numLegs;
    // - A protected String field called sound (e.g., "growl")
        protected String sound;
    // - A constructor that uses super to set name and sets these fields
    Mammal(String name, boolean warmBlooded, String dietType, int numLegs, String sound){
        super.name
    }

    }
// - Override speak() to print the value of sound prefixed by name


    // Subclasses of Mammal
// TODO: Define a class Dog that extends Mammal
    public class Dog extends Mammal {
// - Constructor takes name and passes name, true, "omnivore", 4, "Woof!" to super
// - Override speak() to print "<name> says: Woof!"
    }

    // TODO: Define a class Cat that extends Mammal
    public class Cat extends Mammal {
// - Constructor takes name and passes name, true, "carnivore", 4, "Meow!" to super
// - Override speak() to print "<name> says: Meow!"
    }

    // TODO: Define a final class Human that extends Mammal
    public class Human extends Mammal {
// - Constructor takes name and passes name, true, "omnivore", 2, "Hello!" to super
    }

    // TODO: Define a class Reptile that extends Animal
    public class Reptile extends Animal {
// - Add fields: boolean warmBlooded (set to false), int numLegs, String dietType, String sound
// - Constructor should take all values and use super for name
// - Override speak() to print the value of sound prefixed by name
    }

    // Main class to test
// TODO: Define class AnimalKingdomTest with a main method
    public class AnimalKingdomTest {
        public static void main(String[] args) {

        }
    }
// - Create Animal a1 = new Dog("Buddy")
// - Create Animal a2 = new Cat("Whiskers")
// - Call speak() on both (demonstrating polymorphism)
// - Print both using System.out.println
// - Use equals() to compare a1 to a new Dog("Buddy")

// Additional TODOs:
// 1. Create a new subclass of Animal (e.g., Bird) and override speak()
// 2. Try to extend Human – what happens and why?
// 3. Override equals() in Dog or Cat to also check the type
// 4. Add a method to Mammal called performTrick() and call it via downcasting
}
