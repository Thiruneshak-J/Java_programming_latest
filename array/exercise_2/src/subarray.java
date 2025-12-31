import java.util.Arrays;
import java.util.Scanner;
public class subarray
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
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
        System.out.printf("array is %s\n", Arrays.toString(arr));
        int max=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int j;
        for(i=0;i<n;i++)
        {
            int temp=0;
            for(j=i;j<n;j++)
            {
               temp+=arr[j];
               if(temp>max){
                   max=temp;
               }
            }
        }
        System.out.printf("%d%n",max);
    }
}
