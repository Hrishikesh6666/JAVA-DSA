import java.util.Scanner;
 // (Q1) Area of circle
public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Area of circle");
        System.out.println("Enter the Radius : ");
        double Radius = cs.nextInt();

        double Area = 3.14*Math.pow(Radius,2);

        System.out.println("Area of Circle : "+Area);

 // (Q2) Area Of Rectangle Program:
        System.out.println("Area of Rectangle");

        System.out.println("Enter the Length: ");
        double len = cs.nextInt();
        System.out.println("Enter the Width: ");
        double width = cs.nextInt();

        double AreaRec = len*width;

        System.out.println("Area of RECTANGLE: "+AreaRec);
    }
}
