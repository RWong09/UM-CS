import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password to check its validity : ");
        String input = sc.nextLine();
        if (passwordChecker(input)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }

    private static boolean passwordChecker(String pw) {
        boolean length = false,
                CapNSmall = false,
                threeDigit = false,
                oneSChar = false;
        int Cap = 0, smallCaps = 0;
        int digitCounter = 0;
        int SCharCounter = 0;
        if (pw.length() >= 8) {
            length = true;
        }
        for (int i = 0; i < pw.length(); i++) {
            if (CapNSmall == false) {
                if (Character.isUpperCase(pw.charAt(i))) {
                    Cap++;
                } else if (Character.isLowerCase(pw.charAt(i))) {
                    smallCaps++;
                }
                if (Cap >= 1 && smallCaps >= 1) {
                    CapNSmall = true;
                }
            }

            if (pw.charAt(i) >= '0' && pw.charAt(i) <= '9') {
                digitCounter++;
                if (digitCounter >= 3) {
                    threeDigit = true;
                }
            }
            if (!Character.isLetterOrDigit(pw.charAt(i))) {
                SCharCounter++;
                if (SCharCounter == 1) {
                    oneSChar = true;
                }
            }
        }
        boolean validity;
        if (length && CapNSmall && threeDigit && oneSChar) {
            validity = true;
        } else
            validity = false;

        return validity;
    }

}