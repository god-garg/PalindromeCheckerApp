import java.util.*;

public class PalindromeCheckerApp {

    static boolean check(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String:");
        String text = scanner.nextLine();

        System.out.println("The string is palindrome: " + check(text));

        scanner.close();

    }
}