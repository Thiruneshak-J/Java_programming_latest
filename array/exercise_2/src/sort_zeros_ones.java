import java.util.Arrays;
import java.util.Scanner;
public class sort_zeros_ones
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
        System.out.printf("array is %s\n", Arrays.toString(arr));
        for(i=0;i<n;i++)
        {
            boolean f=false;
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    f=true;
                }
            }
            if(!f)
            {
                break;
            }
        }
        System.out.printf("sorted array is %s",Arrays.toString(arr));
    }
}
