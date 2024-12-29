import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Taking input from User and try Arithmatic Operation ");

        Scanner input = new Scanner(System.in);

        int Num1 = input.nextInt();
        int Num2 = input.nextInt();

        int Sum = Num1+Num2;
        System.out.println("sum:"+Sum);

        // Celcious to Ferenhite converter

        System.out.println("Please enter the temperature in C :");

        float temC = input.nextFloat();

        float temF = (temC * 9/5)+35;

        System.out.println("Temperature in Ferenhite is: "+temF);
    }
}
