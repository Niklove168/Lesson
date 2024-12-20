import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        boolean res = limitSum(7, 9);
        System.out.println(res);
        printNum(-15);
        boolean res1 = rangNum(-55);
        System.out.println(res1);
        printStringReqTimes("Java is cool!");
        boolean res2 = leapYear(2020);
        System.out.println(res2);
        arrChange();
        arrEmpty();
        arrMulti();
        arrSquare(10);
        createArr(5,41);
    }

    public static boolean limitSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printNum(int s) {
        if (s >= 0) {
            System.out.println(s + " число положительное");
        } else {
            System.out.println(s + " число отрицательное");
        }
    }

    public static boolean rangNum(int w) {
        return w >= 0;
    }

    public static void printStringReqTimes(String text) {
        int x;
        for (x = 0; x < 5; x++) {
            System.out.println(text);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return true;
        }
    }

    public static void arrChange() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void arrEmpty() {
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
    }

    public static void arrMulti() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println();
    }

    public static void arrSquare(int n) {
        int[][] arr3 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - j - 1) {
                    arr3[i][j] = 1;
                }
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void createArr(int len, int initialValue) {
        int[] arr4 = new int[len];
        Arrays.fill(arr4,initialValue);

        System.out.println(Arrays.toString(arr4));
    }
    }