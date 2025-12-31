import java.util.Arrays;
import java.util.Scanner;
public class _9_binary_search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < arr.length; i++)
        {
            System.out.print("enter the number:");
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.print("you entered array is [");
        for (i = 0; i < n; i++)
        {
            if (i != n - 1)
            {
                System.out.printf("%d,", arr[i]);
            } else
            {
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.print("]\n");
        //sort
        int j;
        for(i=0;i<n-1;i++)
        {
            boolean s=false;
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int tem=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tem;
                    s=true;
                }
            }
            if(!s)
            {
                break;
            }
        }
        System.out.printf("sorted array is %s%n", Arrays.toString(arr));
        //binary search
        int low=0,high=n-1,mid=0;
        System.out.print("enter the element to find:");
        int key=sc.nextInt();
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==key)
            {
                System.out.printf("your element in index of %d",mid);
                break;
            }
            else if(arr[mid]<low)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

    }
}
