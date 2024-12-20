package Lesson3.Animals;

public class Runner {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.run(540);
        animals.swim(320);
        System.out.println("Number of animals: " + Animals.getNumAnimals());
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.run(200);
        cat2.swim(0);
        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);

        System.out.println("Number of cats: " + Cat.getNumCat());
        System.out.println("Number of dogs: " + Dog.getNumDog());
        System.out.println("Number of animals: " + Animals.getNumAnimals());
        Plate plate = new Plate(1);
        cat1.setPlat(plate);
        cat2.setPlat(plate);
        Cat[] cats = {cat1, cat2};
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(5);
        }
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isSatiety()) {
                System.out.println("Cat number " + (i + 1) + " is satiety");
            } else {
                System.out.println("Cat number " + (i + 1) + " is hungry");
            }
        }
        System.out.println("Amount of food in the plate: " + plate.getFood());
    }
}