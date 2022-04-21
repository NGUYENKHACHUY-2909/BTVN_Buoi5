package Bai11;
import java.util.Scanner;
public class Bai11 {
    public static void removeCharOddIndex(String s){
        String new_string = "";

        for (int i = 0; i < s.length(); i++) {

            // If current index is odd
            if (i % 2 == 1) {

                // Skip the character
                continue;
            }

            // Otherwise, append the
            // character
            new_string += s[i];
        }

        // Return the result
        return new_string;
    }
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        removeCharOddIndex(str);
    }
}
