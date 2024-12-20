package Task4;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try {
            int sum = processArray(array);
            System.out.println("Sum of array elements is " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int processArray(String[][] arr)
            throws MyArraySizeException, MyArrayDataException {
        int rows = arr.length;
        int cols = arr[0].length;
        if (rows != 4 || cols != 4)
            throw new
                    MyArraySizeException("Array size should be 4*4");
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new
                            MyArrayDataException("Invalid data in array cell [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}