import java.util.Scanner;
public class library
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the book name:");
        String name=sc.nextLine();
        System.out.print("enter how many days late:");
        int day=sc.nextInt();
        double fine;
        if(day==0)
        {
            System.out.printf("%s book returned sucessfully. there is no fine%n",name);
        }
        else if(day>0 && day<=5)
        {
            fine=day*0.5;
            System.out.printf("%s book returned sucessfully.%n",name);
            System.out.printf("your fine amount is %f",fine);
        }
        else if(day>5 && day<=10)
        {
            fine=day*1;
            System.out.printf("%s book returned sucessfully.%n",name);
            System.out.printf("your fine amount is %f",fine);
        }
        else if(day>10 && day<30)
        {
            fine=day*1.5;
            System.out.printf("%s book returned sucessfully.%n",name);
            System.out.printf("your fine amount is %f",fine);
        }
        else
        {
            fine=day*1.5;
            System.out.printf("%s book returned sucessfully.%n",name);
            System.out.printf("your fine amount is %f%n",fine);
            System.out.println("sorry,your membership is cancelled");
        }
    }

}
