public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;  // Number of rows
        //Pattern1(n);  // Call the method to print the pattern
        //Pattern2(n);
        Pattern3(n);
    }
    static void Pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");  // Print star in the same line
            }
            System.out.println();  // Move to the next line after each row
        }
    }
    static  void Pattern2(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the column
            for (int col = 1; col <=n; col++) {
                System.out.print("* ");  // Print star in the same line
            }
            System.out.println();  // Move to the next line after each row
        }
    }
    static  void Pattern3(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the column
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("* ");  // Print star in the same line
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
