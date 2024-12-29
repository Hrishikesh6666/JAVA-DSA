import java.util.Scanner;

public class If_and_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("Adult");
        }
        else {
            System.out.println("Child");
        }

        if (age%2==0){
            System.out.println("Even Number");
        }else {
            System.out.println("ODD number");
        }
    }
}
