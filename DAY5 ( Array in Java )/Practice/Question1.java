import java.util.Arrays;

public class Question1 {
    static int GetSecondLargest(int[]arr) {
        int n = arr.length;

        //sorting the array
        Arrays.sort(arr);
        //start from second last elements as lsat element is the largest

        for (int i = n - 2; i >= 0; i--) {
            //largest element
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={12,13,77,55,665,58,54,5,454,54,45,44,454,54,55};
        System.out.println(GetSecondLargest(arr));
    }
}
