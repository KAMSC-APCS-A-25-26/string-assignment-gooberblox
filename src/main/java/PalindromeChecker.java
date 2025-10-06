import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // TODO: Create a Scanner and read a full line from the user with nextLine().
        //       Keep the original input string so you can print it in the final message.

        // TODO: Build a lowercase version of the input for checking (case-insensitive comparison).
        //       (You don't need to remove spaces/punctuation for the current tests.)

        // TODO: Determine whether the lowercase string reads the same forwards and backwards.
        //       Tip: compare it to a reversed copy of itself.

        // TODO: Treat single-character inputs as palindromes (the above check will already handle this).

        // TODO: Print EXACTLY ONE of the following lines (no extra punctuation/labels):
        //       "<original> is a palindrome"
        //       "<original> is not a palindrome"
        //       where <original> is exactly what the user typed (preserve casing).
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = scan.nextLine();
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s)) {
            System.out.println(s+" is a palindrome!");
        } else {
            System.out.println(s+" is NOT a palindrome.");
        }
    }
}