import java.util.Arrays;
import java.util.Scanner;

public class SumofArray
{
    static int digSum(int n)
    {
        int sum = 0;

        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
//        int[] firstArray = {1,2,3,4};
//        int[] secondArray = {2,4,6,8};
        Scanner sc = new Scanner(System.in);
        int[] firstArray = new int[4];
        int[] secondArray = new int[4];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = sc.nextInt();
        }
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = sc.nextInt();
        }

        int fal = firstArray.length;
        int sal = secondArray.length;
        int sumduplicate = 0;
        int sumarray = 0;
        int sum1 = 0;
        int[] result = new int[fal + sal];
        System.arraycopy(firstArray, 0, result, 0, fal);
        System.arraycopy(secondArray, 0, result, fal, sal);

        for (int i = 0; i < result.length; i++) {
            for (int j = i+1; j < result.length; j++) {
                if(result[i] == result[j])
                {
                    sumduplicate+=result[j];
                }
            }
        }
        sumduplicate = 2 * sumduplicate;
        for (int i = 0; i < result.length ; i++) {
            sumarray+=result[i];
        }

        sum1 = sumarray - sumduplicate;

//        System.out.println(sum1);
        System.out.println(digSum(sum1));
    }
}