import java.util.Arrays;
import java.util.Scanner;
public class cts_3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the input_1:");
        int int_1=sc.nextInt();
        int[] int_2=new int[int_1];
        System.out.print("enter the input_2(characters):");
        String ch=sc.next();
        for(int i=0;i<int_1;i++)
        {
            int_2[i]=ch.charAt(i);
        }
        //System.out.println(Arrays.toString(int_2));
        int sum=0;
        for(int i=0;i<int_1;i++)
        {
           int ind=i+1;
           if(ind%2!=0 || int_2[i]%2!=0)
           {
               int pro=ind*int_2[i];
               sum+=pro;
           }
        }
        System.out.println(sum);
    }

}
