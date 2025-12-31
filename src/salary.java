import java.util.Scanner;
public class salary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String gen_l;
        int ser;
        char qua;
        System.out.print("enter the gender:");
        gen_l=sc.nextLine().toLowerCase();
        System.out.print("enter the years of service:");
        ser=sc.nextInt();
        System.out.print("enter the qualification(Post-graduate=p,Graduate =g):");
        qua=Character.toLowerCase(sc.next().charAt(0));
        if(gen_l.equals("male") && ser>=10 && qua=='p')
        {
            System.out.println("Salary is 15000(15k)");
        }
        else if(gen_l.equals("male") && ser>=10 && qua=='g')
        {
            System.out.println("Salary is 10000(10k)");
        }
        else if(gen_l.equals("male") && ser<10 && qua=='p')
        {
            System.out.println("Salary is 10000(10k)");
        }
        else if(gen_l.equals("male") && ser<10 && qua=='g')
        {
            System.out.println("Salary is 7000(7k)");
        }
        else if(gen_l.equalsIgnoreCase("female") && ser>=10 && qua=='p')
        {
            System.out.println("Salary is 12000(12k)");
        }
        else if(gen_l.equalsIgnoreCase("female") && ser>=10 && qua=='g')
        {
            System.out.println("Salary is 9000(9k)");
        }
        else if(gen_l.equalsIgnoreCase("female") && ser<10 && qua=='p')
        {
            System.out.println("Salary is 10000(10k)");
        }
        else if(gen_l.equalsIgnoreCase("female") && ser<10 && qua=='g')
        {
            System.out.println("Salary is 6000(6k)");
        }
        else
        {
            System.out.println("salary calculation error");
        }
    }

}
