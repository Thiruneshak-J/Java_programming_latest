import java.util.Scanner;

public class prep_cts_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int input_1=sc.nextInt();
        int[] arr=new int[input_1];
        for(int i=0;i<input_1;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<input_1-2;i++)
        {
            for(int j=i;j<i+1;j++)
            {
                if(arr[j]+arr[j+2]==arr[j+1])
                {
                    ans+=1;
                }
            }
        }
        System.out.println("answer:"+ans);
        int count=0;
        for(int i=0;i<input_1-2;i++)
        {
            if(arr[i]+arr[i+2]==arr[i+1])
            {
                count++;
            }
        }
        System.out.println("count :"+count);
    }
}
