public class PalindromeCheckerApp {

    public static void main(String args[]){
        int i;
        String str = new String("madam");
        int n = str.length();
        for (i = 0; i < str.length()/2; i++) {

            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("Not a Palindrome!");
                return;
            }

        }
                System.out.println("Palindrome!");
        }
    }