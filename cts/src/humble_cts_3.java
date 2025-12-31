import java.util.Scanner;
public class humble_cts_3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.print("enter the number:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int co=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i;j<n-2;j++)
            {
                if(arr[j]+arr[j+2]==arr[j+1])
                {
                    co+=1;
                    break;
                }
                break;
            }
        }

        int co_1=0;
        for(int i=0;i<n-2;i++)
        {
            if(arr[i]+arr[i+2]==arr[i+1])
            {
                co_1+=1;
            }
        }

        int co_2=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i;j<i+1;j++)
            {
                if(arr[j]+arr[j+2]==arr[j+1])
                {
                    co_2+=1;
                }
            }
        }
        System.out.println("formations are:(i,j)"+co);
        System.out.println("formations in simple way:"+co_1);
        System.out.println("formation is other way :"+co_2);
    }

}
