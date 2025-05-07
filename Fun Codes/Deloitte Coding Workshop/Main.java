public class Main {
    public static void main(String[] args){
        replaceValueInSentence("The numbers are 23 45 7 88 59 78 19 12 66");
        replaceValueInSentence("The numbers are 100 200 10 18 19 16 26 1 66");
    }

    public static void replaceValueInSentence(String originalSentence){
        String modifiedSentence = new String();
        //Split the sentences into string of words
        String[] words=originalSentence.split("\\s");

        for(String word:words){
            //Check if the word is a number
            if(word.matches("\\d+")){
                //Check if the number is 2 digit
                if(word.length()==2){
                    char lastdigit=word.charAt(1);
                    //If the 2-digit number ends with 6 or 8, the number is kept. Else is replaced with 0
                    if(lastdigit=='6' || lastdigit=='8')
                        modifiedSentence+=word+" ";
                    else
                        modifiedSentence+="0 ";
                }
                else
                    modifiedSentence+=word+" ";
            }
            else
                modifiedSentence+=word+" ";
        }
        System.out.println(modifiedSentence);
    }
}
