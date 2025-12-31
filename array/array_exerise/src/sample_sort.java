import java.util.Scanner;
import java.util.Arrays;
public class sample_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            System.out.printf("enter the %d number of array:", i);
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.print("you entered array[");
        for (i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.printf("%d,", arr[i]);
            } else {
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.print("]\n");
        System.out.print("sorted array is [");
        int j;
        for(i=0;i<n-1;i++)
        {
            boolean s=false;
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    s=true;
                }
            }
            if(!s)
            {
                break;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
