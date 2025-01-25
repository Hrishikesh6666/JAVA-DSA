public class ceiling {
    public static void main(String[] args) {

        // This is for Sorted arr

        int[] arr = {-22,-1,0,2,12,13,16,20,58,85,95,112};
        int target = 20;
        int ans = Ceiling(arr,target);
        System.out.println("Target Index is : "+ans);

    }
     // this will give you the smallest element in the Greater or equal to Target

    static int Ceiling(int[] arr, int target) {
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

