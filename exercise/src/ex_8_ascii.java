import java.util.Scanner;
public class ex_8_ascii
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the character to find ascii value:");
        char ch=sc.next().charAt(0);
        int val=(int)ch;
        System.out.printf("character : %c%n",ch);
        System.out.printf("ascii value :%d%n",val);
    }
}