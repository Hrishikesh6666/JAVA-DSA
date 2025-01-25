public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {-22, -1, 0, 2, 12, 13, 16, 20, 20, 20, 20, 20, 35};
        int target = 20;
        int[] ans = searchRange(nums, target); // Updated function call to handle an array response
        System.out.println("Target Indices are : [" + ans[0] + ", " + ans[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // Check for the first occurrence of the target
        ans[0] = search(nums, target, true);
        // If the target exists, find the last occurrence
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // This function returns the index of the target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevent integer overflow

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Found a potential match
                ans = mid;
                if (findStartIndex) {
                    // Narrow search to the left half
                    end = mid - 1;
                } else {
                    // Narrow search to the right half
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
