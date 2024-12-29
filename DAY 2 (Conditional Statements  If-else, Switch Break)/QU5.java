import java.util.Scanner;

public class QU5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Button: ");
        int Botten = sc.nextInt();

        if (Botten==1){
            System.out.println("hello");
        } else if (Botten==2) {
            System.out.println("Swagat");
        } else if (Botten==3) {
            System.out.println("Oni cha");
        }else {
            System.out.println("Gate-out");
        }


        //                               SWITCH FUNCTION

        switch (Botten){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Swagat");
                break;
            case 3:
                System.out.println("Oni cha");
                break;
            default:
                System.out.println("Gate lost");
        }
    }
}
