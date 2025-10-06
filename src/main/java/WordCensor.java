import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement

        Scanner scan = new Scanner(System.in);
        System.out.print("Example input: ");
        String s = scan.nextLine();

        List<String> bads = Arrays.asList("dang","nuts","oops","yikes");
        String[] blah = s.split(" ");
        System.out.print("\nCensored: ");
        for(String b : blah) {
            if(bads.contains(b)) {
                System.out.print("*** ");
            } else {
                System.out.print(b+ " ");
            }
        }


    }
}
