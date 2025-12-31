import java.util.Scanner;
public class max_occurrenes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the String:");
        String str=new String(sc.nextLine());
        int len=str.length();
        int i,j,max=0;
        char max_ch=' ';
        for(i=0;i<len;i++)
        {
            int max_i=0;
            for(j=0;j<len;j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    max_i += 1;
                }
            }
                if(max_i>max)
                {
                    max=max_i;
                    max_ch=str.charAt(i);
                }
        }
        System.out.printf("maximum character in string ; %s%n",max_ch);
        System.out.printf("maximum times : %d",max);
    }
}
