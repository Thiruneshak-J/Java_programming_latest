import java.util.Scanner;

public class count_vo_con
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String str=sc.nextLine();
        int i,vo=0,co=0,num=0,sp=0;
        String vow="";
        String con="";
        String n="";
        for(i=0;i<str.length();i++) {
            char ch=Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vo += 1;
                    vow= vow + ch;
                } else {
                    co += 1;
                    con=con+ch;
                }
            }
            else if(ch>='0' && ch<='9')
            {
                num+=1;
                n=n+ch;
            }
            else if(ch==' ')
            {
                sp+=1;
            }
        }
        int tot=str.length();
        System.out.printf("string : %s%n",str);
        System.out.printf("vowels in string :%d%n",vo);
        System.out.printf("consonants in string :%d%n",co);
        System.out.printf("numbers in string :%d%n",num);
        System.out.printf("spaces in string :%d%n",sp);
        System.out.printf("total characters in string :%s\n",tot);
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("vowels are : %s\n",vow);
        System.out.printf("consonants are : %s\n",con);
        System.out.printf("numbers are :%s\n",n);
    }
}
