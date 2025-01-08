import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of primitives

//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 256;
//        arr[2] = 237;
//        arr[3] = 4521;
//        arr[4] = 255;
//        // [23,256,237,4521,255] data store in this format in heap memory
//
//        System.out.println(arr[3]);
//
//        // Input using For Loop
//        for (int i = 0; i < arr.length ; i++) {
//            arr [i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]+" ");
//        }

        // Array of Objects
        String[] scr = new String[4];
        for (int i = 0; i < scr.length ; i++) {
            scr[i]=sc.next();
        }
        System.out.println(Arrays.toString(scr));

    }
}
