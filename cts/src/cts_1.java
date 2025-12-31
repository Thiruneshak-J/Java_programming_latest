import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class cts_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the input 1:");
        int int_1=sc.nextInt();
        int[] int_2=new int[int_1];
        int i;
        for(i=0;i<int_1;i++)
        {
            System.out.print("enter the number:");
            int_2[i]=sc.nextInt();
        }
        System.out.print("enter the input 3:");
        int int_3=sc.nextInt();

        ArrayList<Integer>ans=new ArrayList<>();
        int j;
        for(i=0;i<int_1;i++)
        {
            int sum=0;
            for(j=0;j<int_1;j++)
            {
                if(i!=j)
                {
                    sum+=int_2[j];
                }
            }
            if (sum<int_3)
            {
                ans.add(sum);
            }
            else
            {
                ans.add(int_3);
            }
        }
        System.out.println(ans);
    }
}