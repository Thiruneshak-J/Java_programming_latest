import java.util.Scanner;
public class screenshot_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        StringBuilder s= new StringBuilder(sc.next());
        int co=0;
        for(int i=1;i<s.length()-1;i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int j=i;
                while(j<s.length() && Character.isDigit(s.charAt(j)))
                {
                    j++;
                }
                if(Character.isLowerCase(s.charAt(i-1)) && j<s.length() && (Character.isLowerCase(s.charAt(j))))
                {
                    co+=1;
                }
                i=j-1;
            }

        }
        System.out.println("co="+co);

    }
}
