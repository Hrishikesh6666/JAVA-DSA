public class BinarySearch {
    public static void main(String[] args) {

        // This is for Sorted arr

        int[] arr = {-22,-1,0,2,12,13,16,20,58,85,95,112};
        int[] num = {100,95,88,71,65,52,42,30,25,20,15,12,6,4,1};
        int target = 20;
        int ans = binarySearch(arr,target);
        int answer = DiseandingOrder(num,target);
        System.out.println("Target Index is : "+ans);
        System.out.println("Ascending order index is : "+answer);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            // find the middle element
            int mid= start + (end-start)/2;

            if (target < arr[mid]){
                end=mid-1;
            } else if (target > arr[mid]) {
                start=mid+1;
            }else {
                // answer found
                return mid;
            }
        }
        return  -1;
    }
    static int DiseandingOrder(int[] num, int target){
        int start = 0;
        int end = num.length-1;

        while (start<=end){
            // find the middle element
            int mid= start + (end-start)/2;

            if (target < num[mid]){
                start=mid-1;
            } else if (target > num[mid]) {
                end=mid+1;
            }else {
                // answer found
                return mid;
            }
        }
        return  -1;

    }
}
