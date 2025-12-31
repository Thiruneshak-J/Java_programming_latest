import java.util.Scanner;
public class recent_cts_2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the String:");
        String s=sc.next();
        System.out.print("enter the initial energy :");
        int eng=sc.nextInt();
        int eng_f=eng;
        int vow=5;
        int p_vow=0;
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='a'&& s.charAt(i)!='e'&& s.charAt(i)!='i'&& s.charAt(i)!='o'&& s.charAt(i)!='u')
            {
                eng_f+=1;
            }
            else
            {
                if((s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') && eng_f>=vow)
                {

                    eng_f+=vow;
                    vow+=5;
                    p_vow+=1;
                }
                else
                {
                    continue;
                }
            }
        }
        System.out.println("lifted vowel are :"+p_vow);
    }

}
