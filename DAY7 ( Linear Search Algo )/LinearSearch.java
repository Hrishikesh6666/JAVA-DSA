public class LinearSearch
//{
//    public static void main(String[] args) {
//        int[] numb={12,45,36,51,52,53,64,65,66,68 };
//        int target= 36;
//        int ans = LinearSearch(numb,target);
//        System.out.println(ans);
//
//    }
//    public static  int LinearSearch(int[]arr,int target){
//        if (arr.length==0){
//            return -1;
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            int element = arr[i];
//            if (element==target){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//}
{
    public static int linearSearch(int[] arr, int target) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) { // Check if element matches the target
                return i; // Return the index of the element
            }
        }
        return -1; // Return -1 if element is not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 40;

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
