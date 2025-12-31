import java.util.Scanner;
import java.util.Arrays;
public class _1_create_array
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
        System.out.printf("you entered array displaying with Array_module:%s%n",Arrays.toString(arr));
        System.out.print("you entered array displaying manually:[");
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
        System.out.print("]");
    }
}
