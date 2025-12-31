import java.util.Scanner;
import java.util.Arrays;
public class humble_cts_1_leetcode_945
{
    public int oper(int[] inp_2)
    {
        int co=0;
        Arrays.sort(inp_2);
        for(int i=0;i<inp_2.length-1;i++)
        {
            if(inp_2[i]>=inp_2[i+1])
            {
                int temp=inp_2[i]+1;
                co+=temp-inp_2[i+1];
                inp_2[i+1]=temp;
            }
        }
        return co;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the inp_1:");
        int inp_1=sc.nextInt();
        int[] inp_2=new int[inp_1];
        System.out.print("enter the number:");
        for(int i=0;i<inp_1;i++)
        {
            inp_2[i]=sc.nextInt();
        }
        humble_cts_1_leetcode_945 leet = new humble_cts_1_leetcode_945();
        int res=leet.oper(inp_2);
        System.out.println("maximum operations:"+res);
    }

}
