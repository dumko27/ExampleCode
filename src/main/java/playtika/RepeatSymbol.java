package playtika;

import java.util.*;

/**
 *
 * @author Novikov Dmitry
 */
public class RepeatSymbol {
    
    public static void main(String[] args) {
        String str = "BCDBABABA";
        
        System.out.println("Contains? -" + repeat(str));
    }
    
    public static boolean repeat(String str) {
        boolean answer = false;
        Set<Character> newStr = new HashSet<Character>();
        char symbol;
        for (int i=0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (newStr.contains(symbol)) {
                System.out.println("Repeat symbol is "+symbol);
                answer = true;
                break;
            } else {
                newStr.add(symbol);
            }
        }
        System.out.println("newStr="+newStr);
        return answer;
    }
}
