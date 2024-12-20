public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing(10, 20);
        printColor(99);
        compareNumbers(15,38);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSing(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
        public static void printColor(int value){
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
        public static void compareNumbers(int a,int b){
        if(a>=b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
        }
    }