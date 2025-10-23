package TestsAndRough.TestingPassByValue;

class Dog {
    String name;
    Dog(String name) {
        this.name = name;
    }
}

public class Main {
    public static void changeDogName(Dog d) {
        d.name = "Max"; // Modifies the object pointed to by the reference copy
    }

    public static void reassignDog(Dog d) {
        d = new Dog("Buddy"); // Reassigns the local reference copy, not the original
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Rex");
        System.out.println("Original name: " + myDog.name); // Output: Rex

        changeDogName(myDog);
        System.out.println("Name after changeDogName: " + myDog.name); // Output: Max (Object state changed)

        reassignDog(myDog);
        System.out.println("Name after reassignDog: " + myDog.name); // Output: Max (Original reference unchanged)
    }
}