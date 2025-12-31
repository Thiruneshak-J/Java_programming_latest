import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class humble_cts_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int inp_1=sc.nextInt();
        int[] inp_2=new int[inp_1];
        System.out.print("enter the numbers:");
        for(int i=0;i<inp_1;i++)
        {
            inp_2[i]=sc.nextInt();
        }
        Arrays.sort(inp_2);
        int co=0;
        ArrayList<Integer>rep=new ArrayList<>();
        for(int i=0;i<inp_1-1;i++)
        {
            if(inp_2[i]==inp_2[i+1])
            {
                co+=1;
                rep.add(inp_2[i]);

            }
        }
        System.out.println("operations :"+co);
        System.out.println("repeated"+rep);
    }
}
