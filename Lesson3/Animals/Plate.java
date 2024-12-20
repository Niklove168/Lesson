package Lesson3.Animals;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (this.food >= food) {
            this.food -= food;
        } else {
            System.out.println("There is not enough food");
        }
    }
}