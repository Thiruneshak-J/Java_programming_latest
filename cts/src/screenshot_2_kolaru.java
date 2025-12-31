import java.util.Scanner;
public class screenshot_2_kolaru
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        StringBuilder s=new StringBuilder(sc.next());
        StringBuilder ans=new StringBuilder();
        ans.append(s.charAt(0));
        for(int i=1;i<s.length()-1;i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                if ( Character.isDigit(s.charAt(i)) && Character.isAlphabetic(s.charAt(i+1)) )
                {
                    ans.append(s.charAt(i + 1));
                }
                else
                {
                    continue;
                }
            }
            else if(Character.isAlphabetic(s.charAt(i)))
            {
                if (Character.isAlphabetic(s.charAt(i)) && Character.isDigit(s.charAt(i + 1)))
                {
                    ans.append(s.charAt(i + 1));
                }
                else
                {
                    continue;
                }
            }
        }
        
        System.out.println("after game:"+ans);
    }

}
