public class QU1_BS {
    public static void main(String[] args) {

        // This is for Sorted arr

        int[] arr = {'a','c','e','r'};
        int target = 'b';
        int ans = SmallestLetter(arr,target);
        System.out.println("Target Index is : "+ans);

    }
    // this will give you the smallest element in the Greater or equal to Target

    static int SmallestLetter(int[] arr, int target) {
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
        return  end;   //this will give you the smallest index  is  the Greater or equal to Target
        //return start; //this will give you the smallest element in the Greater or equal to Target
    }

}
