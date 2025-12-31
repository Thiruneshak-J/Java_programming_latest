import java.util.Scanner;
public class ex_9_pos_or_neg
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number:");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.print("entered number is positive");
        }
        else if(num==0)
        {
            System.out.print("neutal");
        }
        else
        {
            System.out.print("entered number is negative");
        }
    }


}
