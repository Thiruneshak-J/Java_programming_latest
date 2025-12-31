import java.util.Scanner;
public class first_non_rep
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String str=sc.nextLine();
        int i,j;
        for(i=0;i<str.length();i++)
        {
            boolean fo=false;
            for(j=0;j<str.length();j++) {
                if (i != j && str.charAt(i) == str.charAt(j))
                {
                    fo = true;
                }
            }
            if (!fo) {
                System.out.printf("1st non-repeated character:%s\n", str.charAt(i));
                break;
            }
        }
        //2nd
        String non_rep="";
        int co=0;
        for(i=0;i<str.length();i++)
        {
            boolean fo=false;
            for(j=0;j<str.length();j++) {
                if (i != j && str.charAt(i) == str.charAt(j))
                {
                    fo = true;
                }
            }
            if (!fo) {
                non_rep=non_rep+str.charAt(i);
                co+=1;
            }
            if(co==2)
            {
                break;
            }
        }
        System.out.printf("2nd non repeated character is %s\n",non_rep.charAt(1));

    }
}
