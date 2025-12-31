import java.util.Arrays;
import java.util.Scanner;
public class humble_cts_2
{
    String rev(int[] inp_2)
    {
        int N=inp_2.length;
        int n=N/2;
        long sum_f=0,sum_s=0;
        for(int i=0;i<n;i++)
        {
            sum_f+=inp_2[i];
        }
        for(int i=n;i< inp_2.length;i++)
        {
            sum_s+=inp_2[i];
        }
        if(sum_f<sum_s)
        {
            int l=0,r= inp_2.length-1;
            while(l<r)
            {
                int temp=inp_2[l];
                inp_2[l]=inp_2[r];
                inp_2[r]=temp;
                l++;
                r--;
            }
        }
        return Arrays.toString(inp_2);

        }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the input_1:");
        int inp_1=sc.nextInt();
        int[] inp_2=new int[inp_1];
        for(int i=0;i<inp_1;i++)
        {
            inp_2[i]=sc.nextInt();
        }
        humble_cts_2 r=new humble_cts_2();
        String res=r.rev(inp_2);
        System.out.println(res);
    }
}
