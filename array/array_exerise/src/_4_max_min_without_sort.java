import java.util.*;
public class _4_max_min_without_sort
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
        int max=arr[0],min=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(i=1;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.printf("maximum number in array is %d%n",max);
        System.out.printf("minimum number in array is %d%n",min);
    }
}
