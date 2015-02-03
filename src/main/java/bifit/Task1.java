package bifit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Novikov Dmitry
 */
public class Task1 {
    
    public static void main(String[] args) {
        List<Integer> numbers = getNumbers();
        System.out.println("numbers="+ numbers);

//        StringBuilder buildNum = new StringBuilder();
//        for (Integer num : numbers) {
//            if (num != numbers.get(0)) {
//                buildNum.append(",");
//            } 
//            buildNum.append(num);
//        }
//        System.out.println("buildNum="+ buildNum);
//        
//        StringTokenizer tokenizer = new StringTokenizer(buildNum.toString());
//        while (tokenizer.hasMoreElements()) {
//            System.out.println("tokenizer="+ tokenizer.nextToken(",") + ".");
//        }
        
        int[] array = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++ ) {
            array[i] = numbers.get(i);
        }
        System.out.println("ar="+Arrays.toString(array));
    }
    
    public static List<Integer> getNumbers() {
        List<Integer> res = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа через пробел. В конце.");
        
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                res.add(scan.nextInt());
                System.out.println("WHILE res=" + res);
            } else {
                String done = scan.next();
                System.out.println("done=" + done);
                if (done.equals("done")) break;
            }
        }
        System.out.println("RES=" + res);
        
        return res;
    }
    
    
}
