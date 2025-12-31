import java.util.Arrays;
import java.util.Scanner;

public class checking_sort_by_ascen
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("enter the number:");
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        boolean f=false;
        for(i=1;i<n;i++)
        {
            if(arr[i]<temp)
            {
                System.out.println("not in ascending order");
                System.out.printf("array is %s%n", Arrays.toString(arr));
                f=true;
                break;
            }
            else
            {
                temp=arr[i];
            }
        }
        if(!f)
        {
                System.out.print("correctly sorted in ascending order");
        }
    }
}
