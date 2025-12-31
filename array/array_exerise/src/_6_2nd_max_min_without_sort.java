import java.util.Arrays;
import java.util.Scanner;
public class _6_2nd_max_min_without_sort
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
            System.out.print("enter the number:");
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.print("you entered array is [");
        for(i=0;i<n;i++)
        {
            if(i!=n-1)
            {
                System.out.printf("%d,",arr[i]);
            }
            else
            {
                System.out.printf("%d",arr[i]);
            }
        }
        System.out.print("]\n");
        int max=arr[0],min=arr[0];
        for(i=1;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        for(i=1;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.printf("max of array is %d%n",max);
        System.out.printf("min of array is %d%n",min);
        //sorting
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
        System.out.printf("sorted array is %s%n",Arrays.toString(arr));
        int se_max=arr[n-1],se_min=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]!=se_min)
            {
                se_min=arr[i];
                break;
            }
        }
        for(i=n-1;i>=0;i--)
        {
            if(arr[i]!=se_max)
            {
                se_max=arr[i];
                break;
            }
        }
        System.out.printf("second maximum number in array is %d%n",se_max);
        System.out.printf("second minimum number in array is %d%n",se_min);
    }
}
