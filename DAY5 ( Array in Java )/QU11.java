import java.util.Arrays;

public class QU11 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {5, 6, 7},
                {8, 9, 10}
        };

        // Iterating over rows and columns to print the array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { // arr[row] means the array of that perticular row
                                                              // for example row= 0 hase 4 element in arr so we write { arr[row].length }
                System.out.print(arr[row][col] + " "); // Print each element with a space
            }
            System.out.println(); // Newline after each row
        }
    }
}
