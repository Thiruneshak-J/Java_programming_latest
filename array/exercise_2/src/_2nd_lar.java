import java.util.Scanner;
public class _2nd_lar
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
       System.out.print("array is [");
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
       System.out.println("]");
        int first =arr[0];
        int first_ind=0;
        for(i=1;i<n;i++)
        {
            if(first <arr[i])
            {
                first =arr[i];
                first_ind=i;
            }
        }
        int second=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            if(i!=first_ind && arr[i]>second)
            {
                second=arr[i];
            }
        }
        System.out.printf("the largest number in array is %d\n", first);
        System.out.printf("the second largest in array is %d",second);
        sc.close();
    }
}
