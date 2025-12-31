import java.util.Arrays;
import java.util.Scanner;
public class _3_max_min_with_sort
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
        int j;
        for(i=0;i<n-1;i++)
        {
            boolean s=false;
            for(j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    s=true;
                }
            }
            if(!s)
            {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("maximum number in array is %d%n",arr[n-1]);
        System.out.printf("minimum number is array is %d%n",arr[0]);
    }
}
