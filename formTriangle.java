package codingNinjaCourse;
import java.util.Scanner;

//Form Triangle
public class formTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[3];
        for (int i = 0; i < 3; i++) {
            ar[i] = sc.nextInt();
        }
        int a = ar[0];
        int b = ar[1];
        int c = ar[2];
        System.out.println("The Three Sides Of Triangle is : ");
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);

        if (((a + b) > c) || ((a + c) > b) || ((b + c) > a))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
