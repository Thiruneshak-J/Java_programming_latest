import java.util.Scanner;

public class frequency
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name:");
        StringBuilder s=new StringBuilder(sc.next());
        int i,j;
        boolean[] visit=new boolean[s.length()];
        for(i=0;i<s.length();i++)
        {
            if(visit[i]==true)
            {
                continue;
            }
            int co=1;
            for(j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    visit[j]=true;
                    co+=1;
                }
            }
            System.out.printf("%c-%d\n",s.charAt(i),co);
        }

    }
}
