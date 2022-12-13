import java.util.*;

public class CaesarCipher {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Plain Text : ");
        String pt = s.nextLine();
        System.out.println("Shift : ");
        int shift = s.nextInt();
        String ciphertext = "";
        char alpha;
        for (int i = 0; i < pt.length(); i++) {
            alpha = pt.charAt(i);

            if (alpha >= 'a' && alpha <= 'z') {
                alpha = (char) (alpha + shift);

                if (alpha > 'z')
                    alpha = (char) (alpha + 'a' - 'z' - 1);
                else
                    ciphertext = ciphertext + alpha;
            } else if (alpha >= 'A' && alpha <= 'Z') {
                alpha = (char) (alpha + shift);
                if (alpha > 'Z') {
                    alpha = (char) (alpha + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + alpha;
            } else {
                ciphertext = ciphertext + alpha;
            }
        }
        System.out.println("Cipher Text : " + ciphertext);

    }
}