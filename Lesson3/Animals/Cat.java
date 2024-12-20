package Lesson3.Animals;

public class Cat extends Animals {
    private static int numCat;
    private boolean satiety;
    private Plate plate;

    public Cat() {
        satiety = false;
        numCat++;
    }

    public static int getNumCat() {
        return numCat;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setPlat(Plate plate) {
        this.plate = plate;
    }

    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Cat is run " + distance + " meters");
        } else {
            System.out.println("Sorry! Cat can not run that much!");
        }
    }

    public void swim(int distance) {
        System.out.println("Cat can not swim at all!");
    }

    public void eat(int food) {
        if (plate.getFood() < food) {
            System.out.println("There is not enough food in the plate");
        } else {
            plate.setFood(food);
            System.out.println("Cat is full");
            satiety = true;
        }
    }
}