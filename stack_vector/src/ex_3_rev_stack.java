import java.util.Scanner;
import java.util.Stack;
public class ex_3_rev_stack
{
    public static void main(String[] args)
    {
        String s="CollectionsFramework";
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            st.push(s.charAt(i));
        }

        String rev="";
        while(!st.empty())
        {
            if(st.size()==1)
            {
                System.out.println(st.peek());
                rev += st.peek();
                st.pop();
            }
            else
            {
                System.out.print(st.peek());
                rev += st.peek();
                st.pop();
            }
        }
        System.out.println("\nreverse string is :"+rev);
    }
}
