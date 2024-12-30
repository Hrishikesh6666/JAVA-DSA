import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers
// (HINT: while loop)

public class QU8 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        int sum =0;
        int number;  // Variable to store the user's input


        System.out.println("Enter numbers to sum them up (enter 0 to stop):");
        // Use a while loop to take inputs until the user enters 0
        while (true){
            number= cs.nextInt();
            if (number==0){
                break;
            }
            sum+=number;

        }
        System.out.println("The sum of all entered numbers is:"+sum);

        // Calculate Average Of N Numbers

        System.out.println("Enter the number of numbers");
        int n = cs.nextInt();

        if (n<=0){
            System.out.println("The number should be Greater then 0 ");
        }else {
            double sm =0;   // To store the sum of numbers

            //Loop to read N numbers
            System.out.println("Enter the number : ");
            for (int i = 0; i <=n ; i++) {
                System.out.println("Number %d:"+i);
                double numb = cs.nextDouble();
                sm +=number;
            }
            double avg = sum/n;
            System.out.printf("The average of the %d numbers is: %.2f%n", n, avg);

        }
    }
}
