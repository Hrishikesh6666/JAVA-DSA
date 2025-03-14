public class LS_Q1 {
    public static void main(String[] args) {
        String name = "Hrishikesh";
        char target = 'h';
        System.out.println(search(name, target)); // Output: false
    }

    // Method to search for a character in the string
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false; // Return false if the string is empty
        }
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) { // Check if the character matches the target
                return true; // Return true if found
            }
        }
        return false; // Return false if the character is not found
    }
}
