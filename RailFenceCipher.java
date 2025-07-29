import java.util.Scanner;

public class RailFenceCipher {

    public static String encrypt(String message) {
        int len = message.length();
        int rail = 2;
        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < rail; i++) {
            for (int j = i; j < len; j += 2 * (rail - 1)) {
                cipherText.append(message.charAt(j));
                if (i != 0 && i != rail - 1 && (j + 2 * (rail - 1 - i)) < len) {
                    cipherText.append(message.charAt(j + 2 * (rail - 1 - i)));
                }
            }
        }

        

        return cipherText.toString();
    }


    public static String decrypt(String cipherText) {
        int len = cipherText.length();
        int rail = 2;
        char[][] fence = new char[rail][len];

        // Step 1: Mark the positions to be filled
        boolean down = false;
        int row = 0;

        for (int i = 0; i < len; i++) {
            fence[row][i] = '*';

            if (row == 0 || row == rail - 1)
                down = !down;

            row += down ? 1 : -1;
        }

        // Step 2: Fill the marked positions with the ciphertext characters
        int index = 0;
        for (int i = 0; i < rail; i++) {
            for (int j = 0; j < len; j++) {
                if (fence[i][j] == '*' && index < len) {
                    fence[i][j] = cipherText.charAt(index++);
                }
            }
        }

        // Step 3: Read the message in zigzag order
        StringBuilder message = new StringBuilder();
        down = false;
        row = 0;

        for (int i = 0; i < len; i++) {
            message.append(fence[row][i]);

            if (row == 0 || row == rail - 1)
                down = !down;

            row += down ? 1 : -1;
        }

        return message.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String message = sc.nextLine();

        String encrypted = encrypt(message);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted);
        System.out.println("Decrypted: " + decrypted);

        sc.close();
    }
}
