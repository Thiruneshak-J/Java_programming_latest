import java.util.Scanner;
public class ex_5_lar_3
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int num1,num2,num3,lar=0;
        System.out.print("enter the number 1:");
        num1=sc.nextInt();
        System.out.print("enter the number 2:");
        num2=sc.nextInt();
        System.out.print("enter the number 3:");
        num3=sc.nextInt();
        if(num1>num2 || num1 == num2)
        {
            lar=num1;
        }
        else if(num2 > num1 || num1==num2)
        {
            lar=num2;
        }
        else
        {
            System.out.println("invalid");
        }
        if(lar > num3 || lar == num3)
        {
            System.out.printf("largest between three numbers is %d%n",lar);
        }
        else
        {
            System.out.printf("largest between three numbers is %d%n",num3);
        }

    }

}