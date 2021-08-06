import java.util.Scanner;

public class SplitTheNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        int b = a;
        while (b > 0){
            b = b/10;
            count++;
        }
        int c = 1;
        int d = count/2;
        while (d > 0){
            c *= 10;
            d--;
        }
        int c1 = 0;
        int c2 = 0;
        c1 = a/c;
        c2 = a%c;
        System.out.println(c1);
        System.out.println(c2);
    }
}
