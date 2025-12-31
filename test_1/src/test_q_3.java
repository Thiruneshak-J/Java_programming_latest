import java.util.HashSet;

public class test_q_3
{
    public static void main(String[] args)
    {
        String str_1="anagram";
        String str_2="nagaram";
        HashSet<Character>str_2_s=new HashSet<>();
        for(char s:str_2.toCharArray())
        {
            str_2_s.add(str_2.charAt(s));
        }
        int i,j;
        int co=0;
        for(i=0;i<str_1.length();i++)
        {
            for(j=0;j<str_2.length();j++)
            {
                if(str_1.charAt(i)==str_1.charAt(j))
                {

                    continue;
                }
            }
        }
        {
            System.out.print("true");
        }

    }


}
