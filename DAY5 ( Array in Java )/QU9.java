import java.util.Scanner;

public class QU9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();
        int[] number = new int[size];

        // Input
        System.out.println("Enter the Array : ");
        for (int i = 0; i <size ; i++) {
            number[i]= sc.nextInt();
        }

        System.out.println("Enter the Value of X  : ");
        int x = sc.nextInt();
        // Output

        for (int i = 0; i < number.length ; i++) {
            if (i == x) {
                System.out.println("X found to Index: "+i);

            }

        }


    }
}
