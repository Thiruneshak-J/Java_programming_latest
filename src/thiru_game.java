import java.util.Scanner;
public class thiru_game
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name-1:");
        StringBuilder name_1=new StringBuilder(sc.nextLine());
        System.out.print("enter the name_2:");
        StringBuilder name_2=new StringBuilder(sc.nextLine());
        int i = 0;
        while (i < name_1.length())
        {
            int j = 0;
            boolean matched = false;

            while (j < name_2.length())
            {
                if (name_1.charAt(i) == name_2.charAt(j))
                {
                    name_1.deleteCharAt(i);
                    name_2.deleteCharAt(j);
                    matched = true;       // we deleted, so restart outer loop
                    break;
                }
                j++;
            }
            if (!matched)
            {
                i++;   // only increase if no deletion happened
            }
        }
        System.out.println("name 1:"+name_1);
        System.out.println("name 2:"+name_2);
        int total=name_1.length()+name_2.length();
        System.out.println("remain:"+total);
        StringBuilder rule=new StringBuilder("FLAMES");
        i=0;
        while(rule.length()>1)
        {
            i=(i+total-1)%rule.length();
            rule.deleteCharAt(i);
        }
        char pos=rule.charAt(0);
        System.out.println("result:"+pos);
        switch(pos)
        {
            case 'F':
                System.out.println("F-Friend");
                break;
            case 'L':
                System.out.println("L-LOVE");
                break;
            case 'A':
                System.out.println("A-AFFECTION");
                break;
            case 'M':
                System.out.println("M-MARRIAGE");
                break;
            case 'E':
                System.out.println("E-ENEMY");
                break;
            case 'S':
                System.out.println("S-Sister");
                break;
        }


    }
}
