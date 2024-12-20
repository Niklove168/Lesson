package Lesson3.Animals;



public class Dog extends Animals {
    private static int numDog;

    public Dog() {
        numDog++;
    }

    public static int getNumDog() {
        return numDog;
    }

    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Dog is run " + distance + " meters!");
        } else {
            System.out.println("Sorry! Dog can not run that much!");
        }
    }

    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Dog swam by " + distance + " meters");
        } else {
            System.out.println("Sorry! Dog can not swim that much!");
        }
    }
}