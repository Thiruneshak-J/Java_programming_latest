import java.util.Arrays;
import java.util.Scanner;

public class balance_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=sc.next();
        int len=s.length();
        int mid=s.length()/2;
        int sum_f=0;
        int sum_l=0;
        if(len%2==0)
        {
            System.out.println("non-balanced");
            return;
        }
        else
        {
        if((len)%2!=0)
        {
            for(int i=0;i<mid;i++)
            {
                sum_f+=Character.getNumericValue(s.charAt(i));
            }
            for(int i=mid+1;i<len;i++)
            {
                sum_l+=Character.getNumericValue(s.charAt(i));
            }
            if(sum_f==sum_l)
            {
                System.out.println("balanced");
            }
            else
            {
                System.out.println("non-balanced");
            }
        }
        }
    }

}