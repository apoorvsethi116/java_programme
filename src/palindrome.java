import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String str = "naman";
        int i = 0, j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }


        if (isPalindrome) {
            System.out.println("Is a Palindrome!");
        } else {
            System.out.println("Not a Palindrome!");
        }
    }
}
