package codingNinjaCourse;

import java.util.Scanner;

public class FunctionFtoC {
    public static void FtoC(int f1,int f2,int c)
    {
        if (f1 <= f2){
            int cel = 0;
            cel = (5*(f1-32)/9);
            System.out.print(f1 + " " + cel);
            System.out.println();
            f1 = f1 + c;
            FtoC(f1,f2,c);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f1 = s.nextInt();
        int f2 = s.nextInt();
        int c = s.nextInt();

        FtoC(f1,f2,c);

    }
}
