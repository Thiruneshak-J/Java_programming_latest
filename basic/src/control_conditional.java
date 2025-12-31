import java.util.Scanner;
public class control_conditional
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the age :");
        int age=sc.nextInt();
        //if-condition
        if (age>18)
        {
            System.out.println("adult");
        }
        //if-else condition
        System.out.print("enter the age :");
        age=sc.nextInt();
        if(age>18)
        {
            System.out.println("adult");
        }
        else
        {
            System.out.println("minor");
        }
        System.out.print("enter the age :");
        age=sc.nextInt();
        if (age > 18)
        {
            System.out.println("adult");
        }
        else if(age==18)
        {
            System.out.println("entry adult");
        }
        else
        {
            System.out.println("minor");
        }
        System.out.print("enter the number of day :");
        int day=sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invaild");
                break;
        }
        sc.close();
    }

}