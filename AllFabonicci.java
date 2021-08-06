package codingNinjaCourse;
import java.lang.*;
import java.util.Scanner;
public class AllFabonicci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
//        int c = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0)
            {
                System.out.print(0 + " ");
            }
            else if (i == 1){
                System.out.print(1 + " ");
            }
            else {
                i = a + b;
                a = b;
                b = i;
                if (i < N) {
                    System.out.print(i + " ");

                }
            }
        }
    }
    }
