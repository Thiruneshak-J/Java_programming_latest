import java.util.Scanner;
import java.util.Arrays;
public class _2_sum_avg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.printf("enter the %d number of array:",i);
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.print("you entered array[");
        for(i=0;i<n;i++)
        {
            if(i!=n-1)
            {
                System.out.printf("%d,", arr[i]);
            }
            else
            {
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.print("]\n");
        int sum=0;
        for(i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.printf("the sum of array is %d%n",sum);
        int avg=sum/n;
        System.out.printf("the average of array is %d%n",avg);
    }

}
