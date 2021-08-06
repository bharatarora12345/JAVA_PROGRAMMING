package codingNinjaCourse;
import java.lang.*;
import java.util.Scanner;
public class Allprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 0;
        for (int i = 2; i <= N; i++){
            c=0;
            for (int j = 2; j <=i ; j++) {
                if (i%j == 0)
                {
                    c++;
                }
            }
            if (c == 1)
            {
                System.out.print(i + " ");
                c=0;
            }
        }
    }
}
