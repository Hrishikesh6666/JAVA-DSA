public class LinearSearch2D {
    public static int[] linearSearch(int[][] array, int target) {
        // Traverse through each row
        for (int row = 0; row < array.length; row++) {
            // Traverse through each column in the current row
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) { // Compare with target
                    return new int[]{row, col}; // Return row and column index
                }
            }
        }
        return new int[]{-1, -1}; // Return -1, -1 if target is not found
    }

    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30},
                {40, 50, 60,100},
                {70, 80, 90}
        };

        int target = 100;
        int[] result = linearSearch(numbers, target);

        if (result[0] != -1) {
            System.out.println("Element found at row: " + result[0] + ", column: " + result[1]);
        } else {
            System.out.println("Element not found.");
        }
    }
}
