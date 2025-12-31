import java.util.Scanner;
public class ex_12_switch_add_sub_mul_div
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter tha number A:");
        int a=sc.nextInt();
        System.out.print("enter the number B:");
        int b=sc.nextInt();
        int ch;
        while(true) {
            System.out.println("enter the choice to function:");
            System.out.println("1-addition");
            System.out.println("2-subraction");
            System.out.println("3-multiplication");
            System.out.println("4-division");
            ch = sc.nextInt();
            if (ch>=1 && ch<=4)
            {
                break;
            }
            else
            {
                System.out.print("invalid.enter correctly\n");
            }
        }
        switch(ch)
        {
            case 1:
                int c=a+b;
                System.out.printf("addition of %d and %d is %d",a,b,c);
                break;
            case 2:
                int d=a-b;
                System.out.printf("subraction of %d and %d is %d",a,b,d);
                break;
            case 3:
                int e=a*b;
                System.out.printf("multiplication of %d and %d is %d",a,b,e);
                break;
            case 4:
                int f=a/b;
                System.out.printf("division of %d and %d is %d",a,b,f);
                break;
            default:
                System.out.print("invaild");

        }
    }
}
