import java.util.Scanner;

public class QU4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1 num: ");
        int x = sc.nextInt();

        System.out.println("Enter the 2 num: ");
        int y = sc.nextInt();

        if (x==y){
            System.out.println("EQUAL VALUE");
        } else {
            if (x > y) {
                System.out.println("x is Greater Number");
            } else {
                System.out.println("Y is Greater Number");
            }
        }
    }
}
