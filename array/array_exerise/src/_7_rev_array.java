import java.util.Scanner;
import java.util.Arrays;
public class _7_rev_array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<arr.length;i++)
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
                System.out.printf("%d,", arr[i]);
            }
            else
            {
                System.out.printf("%d",arr[i]);
            }
        }
        System.out.print("]\n");
        //reverse printing
        System.out.print("reverse of array without  storing [");
        for(i=n-1;i>=0;i--)
        {
            if(i!=0)
            {
                System.out.printf("%d,",arr[i]);
            }
            else {
                System.out.printf("%d",arr[i]);
            }
        }
        System.out.print("]\n");
        //storing in new array
        int[] rev_arr=new int[n];
        int j;
        for(j=0;j<n;)
        {
            for(i=n-1;i>=0;)
            {
                rev_arr[j]=arr[i];
                j++;
                i--;
            }
        }
        //2-type
        int[] rev_arr_2=new int[n];
        for(i=0;i<n;i++)
        {
            rev_arr_2[i]=arr[n-1-i];
        }
        System.out.printf("reverse array is %s%n",Arrays.toString(rev_arr));
        System.out.print("reverse the array 2-type:[");
        for(i=0;i<n;i++)
        {
            if(i==n-1)
            {
                System.out.printf("%d",rev_arr_2[i]);
            }
            else
            {
                System.out.printf("%d,",rev_arr_2[i]);
            }
        }
        System.out.print("]\n");
    }
}
