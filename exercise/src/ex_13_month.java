import java.util.Scanner;
public class ex_13_month
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int mo;
        while(true)
        {
            System.out.print("enter the number of month:");
            mo = sc.nextInt();
            if(mo>12 || mo<=0)
            {
                System.out.println("invaild.enter conrrectly:");
            }
            else
            {
                break;
            }
        }
        switch (mo)
        {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("MArch");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
        }

    }
}
