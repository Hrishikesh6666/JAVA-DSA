public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {-22,-1,0,2,12,13,16,20,58,85,95,112};
        int target = 20;
        int ans = orderAgnosticSearch(arr, target);
        System.out.println("Target Index is: " + ans);
    }

    static int orderAgnosticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Determine whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // Calculate the middle element
            int mid = start + (end - start) / 2;

            // Check if the middle element is the target
            if (arr[mid] == target) {
                return mid;
            }

            // Binary search logic based on order of the array
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1; // Move the end pointer left
                } else {
                    start = mid + 1; // Move the start pointer right
                }
            } else { // Descending order
                if (target > arr[mid]) {
                    end = mid - 1; // Move the end pointer left
                } else {
                    start = mid + 1; // Move the start pointer right
                }
            }
        }

        // Target not found
        return -1;
    }
}
