import java.util.Scanner;

class MessageEncryption {

    // Encrypt method
    public static char[] encrypt(char[] msg, int key) {
        char[] encrypted = new char[msg.length];

        for (int i = 0; i < msg.length; i++) {
            encrypted[i] = (char) (msg[i] + key);
        }
        return encrypted;
    }

    // Decrypt method
    public static char[] decrypt(char[] msg, int key) {
        char[] decrypted = new char[msg.length];

        for (int i = 0; i < msg.length; i++) {
            decrypted[i] = (char) (msg[i] - key);
        }
        return decrypted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = sc.nextLine();

        System.out.print("Enter key value: ");
        int key = sc.nextInt();

        // Convert string to array
        char[] msgArray = message.toCharArray();

        // Encrypt
        char[] encrypted = encrypt(msgArray, key);
        System.out.println("Encrypted Message: " + new String(encrypted));

        // Decrypt
        char[] decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted Message: " + new String(decrypted));

        sc.close();
    }
}
