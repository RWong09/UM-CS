package L6;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        String[] inputs={"well","nice","one","sus","abbaa","baab","T_T"};
        for(String get:inputs){
            System.out.printf("'%s' is palindrome: %s",get,isPalindrome(get));
            System.out.println();
        }
    }
    
    public static boolean isPalindrome(String s){
        Stack<Character> list=new Stack<>();
        for(char c:s.toCharArray())
            list.push(c);
        for(char c:s.toCharArray()){
            if(!list.pop().equals(c))
                return false;
        }
        return true;
    }
}
