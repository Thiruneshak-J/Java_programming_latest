import java.util.Scanner;
public class miss_num_n_minus_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        int i;
        for(i=0;i<n-1;i++)
        {
            System.out.print("enter the number:");
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.print("[");
        for(i=0;i<n-1;i++)
        {
            if(i!=n-2)
            {
                System.out.printf("%d,",arr[i]);
            }
            else {
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.println("]");
        int arr_sum =0;
        int exp_sum=0;
        for(i=1;i<=n;i++)
        {
            exp_sum+=i;
        }
        for(i=0;i<n-1;i++)
        {
            arr_sum +=arr[i];
        }
        System.out.printf("expected sum is %d%n",exp_sum);
        System.out.printf("array sum is %d%n",arr_sum);
        if(arr_sum!=exp_sum)
        {
            System.out.printf("the missing number is %d",(exp_sum-arr_sum));
        }
        else
        {
            System.out.println("no number is missing");
        }
    }

}
