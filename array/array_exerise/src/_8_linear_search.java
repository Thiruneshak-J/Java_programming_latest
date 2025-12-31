import java.util.Scanner;
import java.util.Arrays;
public class _8_linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print("enter the number:");
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.print("you entered array is [");
        for (i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.printf("%d,", arr[i]);
            } else {
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.print("]\n");
        //linear search
        System.out.print("enter the element to find :");
        int key = sc.nextInt();
        boolean f=false;
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.printf("your searching element index %d in array.", i);
                f=true;
                break;
            }
        }
        if(!f)
        {
            System.out.print("element is not found");
        }
    }
}
