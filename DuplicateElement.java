import java.util.Scanner;
import java.lang.*;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                if (arr[i] == arr[j])
                {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
    }
}
