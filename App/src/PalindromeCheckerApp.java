public class PalindromeCheckerApp {

    public static void main(String args[]) {
        String reversed = "";
        String str = "madam";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed = reversed + str.charAt(i);
        }

        if (reversed.equals(str)) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a Palindrome!");
        }
    }
}