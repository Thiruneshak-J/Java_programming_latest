import java.util.Scanner;
public class anagram
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the String-1:");
        String str1 = sc.nextLine();
        System.out.print("enter the String-2:");
        String str2 = sc.nextLine();
        if (str1.length() != str2.length()) {
            System.out.print("its is not anagram");
        } else {
            /*int i,j,co=0;
            boolean ov_fo=false;
            for(i=0;i<str1.length();i++)
            {
                boolean fo=false;
                for(j=0;j<str1.length();j++)
                {
                    if(str1.charAt(i)==str2.charAt(j))
                    {
                        fo=true;
                        break;
                    }
                }
                if(fo)
                {
                    co+=1;
                    ov_fo=true;
                }
                else
                {
                    System.out.println("it is not anagram");
                    break;
                }
            }
            if(co==str1.length() && ov_fo )
            {
                System.out.println("it is anagram");
            }
        }*/
            int i,j;
            for(i=0;i<str1.length();i++)
            {
                for(j=0;j<str2.length()-i-1;j++)
                {

                }
            }
        }
    }
}
