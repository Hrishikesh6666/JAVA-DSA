import java.util.Scanner;

// FIBONACCI NUMBER : 1,1,2,3,5,8,13,.........

public class fibonacci_Num {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while (count<=n){
            int temp =b;
            b=b+a;
            a=temp;
            count++;

        }
        System.out.println(b);
    }
}


