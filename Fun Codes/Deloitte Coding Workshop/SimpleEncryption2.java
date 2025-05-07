public class SimpleEncryption2 {
    public static void main(String[] args){
        System.out.println(SimpleEncryption2.generateIdValue(333));
    }

    public static String generateIdValue(int intValue){
        StringBuilder resultStr=new StringBuilder();
        //Input must be a valid number and the length must be exactly 3 digit only
        if(intValue >= 100 && intValue <= 999) {
            String numberStr = String.format("%03d", intValue);
            for (int i = 0; i < numberStr.length(); i++) {
                int numtoPrint = Character.getNumericValue(numberStr.charAt(i));
                ;
                if (numtoPrint == 0)
                    continue;
                for (int k = 0; k < numtoPrint; k++) {
                    resultStr.append(numtoPrint);
                }
                resultStr.append("-");
            }
            if (resultStr.length() > 0 && resultStr.charAt(resultStr.length() - 1) == '-') {
                resultStr.deleteCharAt(resultStr.length() - 1);
            }
        }
        //Error handling
        else
            resultStr.append("You must enter a valid number and must be only 3 digits!");

        return resultStr.toString();
    }
}
