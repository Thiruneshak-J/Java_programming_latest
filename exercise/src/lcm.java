import java.util.Scanner;
public class lcm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,min,i,temp=1;
        System.out.print("enter the number A:");
        a=sc.nextInt();
        System.out.print("enter the number B:");
        b=sc.nextInt();
        if(a>b)
        {
            min=b;
        }
        else
        {
            min=a;
        }
        for(i=2;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            {
                temp=i;
            }
        }
        System.out.printf("gcd of number is %d%n",temp);
        int lcm;
        lcm=(a*b)/temp;
        System.out.printf("lcm of number is %d%n",lcm);
    }
}
