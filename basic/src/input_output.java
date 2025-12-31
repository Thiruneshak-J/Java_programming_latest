import java.util.Scanner;
public class input_output
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name:");
        String name = sc.nextLine();
        System.out.print("enter the age:");
        int age=sc.nextInt();
        System.out.print("enter the 12grade percentage:");
        double mar=sc.nextDouble();
        System.out.printf("you entered name is %s%n",name);
        System.out.printf("you entered age is %d%n",age);
        System.out.printf("you entered mark is %.2f%n",mar);
    }

}
