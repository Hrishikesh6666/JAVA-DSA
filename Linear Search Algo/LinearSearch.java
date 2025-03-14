public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 45, 5, 55, 99, 75, 45, 65, 69};
        int target = 75;
        int ans = linearSearch(num, target);
        System.out.println(ans);
    }

    // Method to search the array and return the index if the item is present; otherwise, return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1; // Return -1 if the array is empty
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) { // Check if the current element matches the target
                return index; // Return the index of the target
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
