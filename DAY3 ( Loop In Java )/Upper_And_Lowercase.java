import java.util.Scanner;

public class Upper_And_Lowercase {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        char ch = i.next().trim().charAt(0);

        if (ch>='a'&& ch<='z'){
            System.out.println("LOWERCASE");
        }else {
            System.out.println("UPPERCASE");
        }
    }
}
