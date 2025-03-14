import java.util.Scanner;

public class Palendrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String rev = new StringBuilder(input).reverse().toString();

        if (input.equals(rev)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
