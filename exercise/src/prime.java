import java.util.Scanner;
public class prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,temp=0;
        System.out.print("enter the number A:");
        a=sc.nextInt();
        /*System.out.sample.print("enter the number B:");
        b=sc.nextInt();*/
        int i;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                temp++;
            }
        }
        if(temp==2)
        {
            System.out.printf("its prime%n");
        }
        else
        {
            System.out.printf("not a prime%n");
        }

    }

}
