package exer_2;
import java.util.Scanner;
public class _19_count_pos_neg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pos=0,neg=0,neu=0;
        while (true)
        {
            System.out.print("enter the number:");
            int num= sc.nextInt();
            if(num>0)
            {
                pos+=1;
            }
            else if(num<0)
            {
                neg+=1;
            }
            else
            {
                neu+=1;
            }
            System.out.print("do you want to enter number:(press-1):");
            int ch=sc.nextInt();
            if(ch!=1)
            {
                break;
            }
        }
        System.out.printf("you entered total %d positive numbers.\n",pos);
        System.out.printf("you entered total %d negative numbers.\n",neg);
        System.out.printf("you entered total %d neutral numbers.\n",neu);
    }
}
