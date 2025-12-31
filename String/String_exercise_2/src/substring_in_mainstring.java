import java.util.Scanner;
public class substring_in_mainstring
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the Mainstring:");
        String str1=new String(sc.nextLine());
        System.out.print("enter the substring:");
        String str2=new String(sc.nextLine());
        if(str1.contains(str2))
        {
            System.out.println("yes,it is contains");
        }
        else
        {
            System.out.println("no,it is not contains");
        }
        int i,j,len1= str1.length(),len2=str2.length();
        boolean fo=false;
        for(i=0;i<=len1-len2;i++) {
            for (j = 0; j < len2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            if (j == str2.length())
            {
                fo=true;
                break;
            }
        }
        if(fo)
        {
            System.out.println("1......yes,it is contains");
        }
        else
        {
            System.out.println("1.......no,it is not contains");

        }
    }
}
