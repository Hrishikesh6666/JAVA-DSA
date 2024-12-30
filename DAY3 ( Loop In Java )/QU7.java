public class QU7 {
    public static void main(String[] args) {
        int n = 1224224116;

        // Q1: Count how many times 2 is repeated
        int temp = n; // Preserve the original number
        int count = 0;
        while (temp > 0) {
            int rem = temp % 10;
            if (rem == 2) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println("Number 2 is repeated: " + count + " times");

        // Q2: Reverse the number
        temp = n; // Reset temp to the original number
        int ans = 0;
        while (temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println("Reversed Number: " + ans);
    }
}
