package Lesson3.Animals;

public class Animals {
    private static int numAnimals;

    public Animals() {
        numAnimals++;
    }

    public static int getNumAnimals() {
        return numAnimals;
    }

    public void run(int distance) {
        System.out.println("Animal ran " + distance + " meters");
    }

    public void swim(int distance) {
        System.out.println("Animal swam by " + distance + " meters");
    }
}