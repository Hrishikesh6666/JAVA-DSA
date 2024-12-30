public class Factorial {
    int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) { // Start from 1, not 0
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int number = 5;
        int result = fact.factorial(number);
        System.out.println(number + " Factorial: " + result);
    }
}
