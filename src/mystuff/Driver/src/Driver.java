

public class Driver {
    public static void main(String[] args) {

        Product xboxOne = new Product();
        xboxOne.name = "Xbox One";
        xboxOne.manufacturer = "Microsoft";
        xboxOne.releaseYear = 2013;
        xboxOne.type = "Console";
        xboxOne.price = 299.99;
        xboxOne.weight = 4.45; // Weight in kg
        xboxOne.rating = 8.5;


        Product fenderGuitar = new Product();
        fenderGuitar.name = "Fender Stratocaster";
        fenderGuitar.manufacturer = "Fender";
        fenderGuitar.releaseYear = 1954;
        fenderGuitar.type = "Electric Guitar";
        fenderGuitar.price = 799.99;
        fenderGuitar.weight = 3.5; // Weight in kg
        fenderGuitar.rating = 9.0;

        System.out.println("Product 1: " + xboxOne.name);
        System.out.println("Manufacturer: " + xboxOne.manufacturer);
        System.out.println("Release Year: " + xboxOne.releaseYear);
        System.out.println("Type: " + xboxOne.type);
        System.out.println("Price: $" + xboxOne.price);
        System.out.println("Weight: " + xboxOne.weight + " kg");
        System.out.println("Rating: " + xboxOne.rating + "/10");

        System.out.println();

        System.out.println("Product 2: " + fenderGuitar.name);
        System.out.println("Manufacturer: " + fenderGuitar.manufacturer);
        System.out.println("Release Year: " + fenderGuitar.releaseYear);
        System.out.println("Type: " + fenderGuitar.type);
        System.out.println("Price: $" + fenderGuitar.price);
        System.out.println("Weight: " + fenderGuitar.weight + " kg");
        System.out.println("Rating: " + fenderGuitar.rating + "/10");
    }
}