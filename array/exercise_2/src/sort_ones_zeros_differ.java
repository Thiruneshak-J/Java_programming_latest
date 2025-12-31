import java.util.Arrays;
import java.util.Scanner;
public class sort_ones_zeros_differ
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
        System.out.printf("arrays is %s\n", Arrays.toString(arr));
        int z_l=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                z_l++;
            }
        }
        for(i=0;i<n;i++)
        {
            if(i<z_l)
            {
                arr[i]=0;
            }
            else
            {
                arr[i]=1;
            }
        }
        System.out.printf("array after sort %s",Arrays.toString(arr));
    }
}
