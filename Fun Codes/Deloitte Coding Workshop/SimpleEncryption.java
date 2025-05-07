public class SimpleEncryption {
    public static void main(String[] args){
        System.out.println(SimpleEncryption.encrypt("cece"));
        System.out.println(SimpleEncryption.encrypt("gogo"));
        System.out.println(SimpleEncryption.encrypt("ICDC"));
        System.out.println(SimpleEncryption.encrypt("GONE"));
        System.out.println(SimpleEncryption.encrypt("CODE"));
        System.out.println(SimpleEncryption.encrypt("book"));
        System.out.println(SimpleEncryption.encrypt("cooked"));
        System.out.println(SimpleEncryption.encrypt("Chef"));
    }

    public static String encrypt(String strValue){
        //Check if it exceeds more than 6 characters
        if(strValue.length()>6){
            throw new IllegalArgumentException("Input must not exceed 6 characters!");
        }

        StringBuilder encryptedText = new StringBuilder();
        int shiftChar=1; //The increment for the character ASCII value
        for (int i=0; i<strValue.length(); i++) {
            char charac = strValue.charAt(i);

            // Check for valid range: a-o or A-O
            if (!((charac >= 'a' && charac <= 'o') || (charac >= 'A' && charac <= 'O'))) {
                throw new IllegalArgumentException("Invalid character found: " + charac);
            }

            char newChar = (char) (charac + shiftChar);
            encryptedText.append(newChar);
            shiftChar += 2; // Increase to the next odd number
        }
            return encryptedText.toString();
    }
}
