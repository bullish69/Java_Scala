import java.util.*;

public class count {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Strings : ");
        String x = s.nextLine();
        int alphabet = 0;
        int vowels = 0;
        int digits = 0;
        int symbols = 0;
        int blank = 0;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                alphabet++;
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'O') {
                vowels++;
            } else if (c >= '0' && c <= '9') {
                digits++;
            } else if (c == ' ') {
                blank++;
            } else if (c == '@' || c == '#' || c == '.' || c == '?' || c == '!')
                symbols++;
        }
        System.out.println("Alphabet : " + alphabet);
        System.out.println("Vowels : " + vowels);
        System.out.println("Digits : " + digits);
        System.out.println("Blank : " + blank);
        System.out.println("Symbols : " + symbols);
    }
}