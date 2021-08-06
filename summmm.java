import java.util.ArrayList;
import java.util.List;
public class summmm {
    public static void main (String[] argv) {

        int[] Array1 = new int[] {4,8,9};
        int[] Array2 = new int[] {2,4,6};
        int calculateResult = 0;
        boolean contains = false;
        int mod = 123456789;
        int modSum = 0;

        List<Integer> results = new ArrayList<Integer>();
        for(int i=0; i<Array1.length; i++) {
            for(int j=0; j<Array2.length; j++) {
                if(Array1[i]==Array2[j]) {
                    contains = true;
                    break;
                }
            }
            if(!contains) {
                results.add(Array1[i]);
            }
            else {
                contains = false;
            }
        }
        // calculate the result
        for (int i : results) {
            calculateResult  += i;
        }
        // Print Results
        System.out.println(results);
        System.out.println(calculateResult);
    }}