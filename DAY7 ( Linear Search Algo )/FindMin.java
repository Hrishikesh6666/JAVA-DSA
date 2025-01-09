public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 9, 544, 465, 12, 5, 45, 88, 44, -8};
        System.out.println("Minimum value: " + min(arr));
        System.out.println("Maximum value: " + max(arr));
    }

    // Function to find the minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0]; // Initialize with the first element
        for (int i = 1; i < arr.length; i++) { // Start from the second element
            if (arr[i] < ans) {  // Update if a smaller element is found
                ans = arr[i];
            }
        }
        return ans; // Return the minimum value
    }

    // Function to find the maximum value in the array
    static int max(int[] arr) {
        int ans = arr[0]; // Initialize with the first element
        for (int i = 1; i < arr.length; i++) { // Start from the second element
            if (arr[i] > ans) {  // Update if a larger element is found
                ans = arr[i];
            }
        }
        return ans; // Return the maximum value
    }
}
