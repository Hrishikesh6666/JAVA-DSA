import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt and take roll number
        System.out.print("Enter your roll number: ");
        int roll_no = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()

        // Prompt and take name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Prompt and take marks
        System.out.print("Enter your marks: ");
        float marks = input.nextFloat();

        // Print the inputs
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
