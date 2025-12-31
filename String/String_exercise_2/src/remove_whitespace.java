import java.util.Scanner;
public class remove_whitespace
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the String:");
        String str=sc.nextLine();
        int i;
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ' || ch==',' || ch=='.' ||Character.isWhitespace(ch))
            {
                continue;
            }
            else
            {
                System.out.printf("%c",str.charAt(i));
            }
        }

    }

}
