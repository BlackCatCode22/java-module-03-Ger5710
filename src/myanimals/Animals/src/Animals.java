public class Animal {

    private static int animalCount = 0;

    String name;
    int age;

    public Animal() {
        animalCount++;
    }


    public static int getAnimalCount() {
        return animalCount;
    }


    public void makeNoise() {
        System.out.println("Some generic animal noise");
    }
}
