import java.util.Arrays;
import java.util.Scanner;
public class ascen
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            System.out.print("enter the number:");
            int num=sc.nextInt();
            arr[i]=num;
        }
        for(i=0;i<n-1;i++)
        {
            for (j = i+1; j < n; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.printf("array sorted random:%s\n",Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.printf("ascending order of array is : %s%n",Arrays.toString(arr));
    }
}
