public class SimpleEncryption1 {
    public static void main(String[] args) {
        System.out.println(SimpleEncryption1.mergeInput("AAAAAAA",5));
    }

    public static String mergeInput(String strValue, int intValue){
        StringBuilder resultStr= new StringBuilder();
        /*
        strValue must be a String and length must >= 6 characters
        intValue must be a number between 1-9
        Put intValue in the middle of strValue
        - If strValue length is even, then put intValue in the middle
        - If strValue length is odd, then put intValue between the middle character
        */
        if(strValue.length()%2==1 && strValue.length()>=6 && intValue>0 && intValue<=9){
            for(int i=0;i<strValue.length()/2;i++){
                char letter= strValue.charAt(i);
                resultStr.append(letter);
            }
            resultStr.append(intValue);
            resultStr.append(strValue.charAt(strValue.length()/2));
            resultStr.append(intValue);
            for(int i=strValue.length()/2+1;i<strValue.length();i++){
                char letter= strValue.charAt(i);
                resultStr.append(letter);
            }
        }

        else if(strValue.length()%2==0 && strValue.length()>=6 && intValue>0 && intValue<=9){
            for(int i=0;i<strValue.length()/2;i++){
                char letter= strValue.charAt(i);
                resultStr.append(letter);
            }
            resultStr.append(intValue);
            for(int i=strValue.length()/2;i<strValue.length();i++){
                char letter= strValue.charAt(i);
                resultStr.append(letter);
            }
        }

        else if(strValue.length()<=6){
            resultStr.append("The length of string value must be more than 6 characters!");
        }
        else{
            resultStr.append("Integer value must be a number between 1 to 9!");
        }
        return resultStr.toString();
    }
}