import java.util.Scanner;
public class reverse_pali
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String str=new String(sc.nextLine());
        System.out.printf("enterd string is %s%n",str);
        String rev=new String("");
        int i;
        for(i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.printf("reverse is %s\n",rev);
        if(str.equals(rev))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        System.out.print("enter the other string:");
        String str1=new String(sc.nextLine());
        String rev1=new StringBuilder(str1).reverse().toString();
        if(str1.equals(rev1))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }


    }
}