package AdvancedLiveCodingex9;

/**
 *Create a Computer class with fields defining computer features: processor, ram, graphics card,
 * company and model.
 * Implement setters, getters, constructor with all fields, toString(), equals() and hashcode() methods.
 * Instantiate several objects and check how the methods work.
 *
 * Create a Laptop class extending the Computer class from the previous task.
 * The Laptop class should additionally contain the battery parameter.
 * Implement additional getters, setters, constructor and overwrite the
 * toString(), equals() and hashcode()
 * methods accordingly. Use a reference to parent class methods.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer1= new Computer(
                "Intel",
                32,
                "GTX1660I",
                "Lenovo",
                "30222"
        );

        System.out.println(computer1);

        Laptop laptop1 = new Laptop(
               "Baterie puternica" ,
                32,
                "Intel",
                "GTX1660I",
                "Lenovo",
                "30222"
        );

        System.out.println(laptop1);
    }
}
