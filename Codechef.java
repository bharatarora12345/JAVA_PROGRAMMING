package codingNinjaCourse;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(input.readLine());
            while(t!=0){
                // int arr[] = new arr[2];
                // String[] s = br.readLine().split(" ");
                // a[i] = Integer.parseInt(s[i]);
                // for(int i =0;i<2;i++){
                //     arr[i] = s.nextInt;
                // }
                int a[] = new int[4];
                String str[] = input.readLine().split(" ");
                for(int i=0;i< 4;i++){
                    a[i] = Integer.parseInt(str[i]);
                }
                int D = a[0];
                int d = a[1];
                int P = a[2];
                int Q = a[3];
                // int M = Integer.parseInt(input.readLine());
                // int S = Integer.parseInt(input.readLine());

                int sum = 0;
                int n = 0;
                int m = 0;
                for(int i=0;i<D;i++) {
                    if (m == d) {
                        n++;
                        m = 0;
                    }
                    sum += (P + (n * Q));
                    m++;
                }
                System.out.println(sum);
                sum = 0;
                t--;
            }
        }
        catch(Exception e){
            return;
        }
        // your code goes here
    }
}