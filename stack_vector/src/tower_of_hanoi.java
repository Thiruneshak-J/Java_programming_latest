import java.util.Stack;
import java.util.Scanner;
public class tower_of_hanoi
{
    public static void move(Stack<Integer> src,Stack<Integer> dest, char s,char d)
    {
        if(src.isEmpty())
        {
            src.push(dest.pop());
            System.out.println(" move disk " + src.peek() + " from " + d + " to " + s);

        }
        else if(dest.isEmpty())
        {
            dest.push(src.pop());
            System.out.println(" move disk " + dest.peek() + " from " +s + " to " + d);
        }
        else if(src.peek()>dest.peek())
        {
            src.push(dest.pop());
            System.out.println(" move disk "+ src.peek() +" from "+ d +" to "+ s);
        }
        else
        {
            dest.push(src.pop());
            System.out.println(" move disk "+ dest.peek() +" from "+ s + " to " + d);
        }
    }
    public static void solve(int n)
    {
        Stack<Integer>A=new Stack<>();
        Stack<Integer>B=new Stack<>();
        Stack<Integer>C=new Stack<>();

        for(int i=n;i>=1;i--)
        {
            A.push(i);
        }
        char s='A',a='B',d='C';
        if(n%2==0)
        {
            char temp=d;
            d=a;
            a=temp;
        }
        int tot_mov=(int)(Math.pow(2,n)-1),co=0;
        for(int i=1;i<=tot_mov;i++)
        {
            if(i%3==1)
            {
                move(A,C,s,d);
                co+=1;
            }
            else if(i%3==2)
            {
                move(A,B,s,a);
                co+=1;
            }
            else
            {
                move(B,C,a,d);
                co+=1;
            }
        }
        System.out.println("----------------steps:"+co+"----------------------");
        System.out.println("-----------total_moves:"+tot_mov+"------------------");
    }

    public static void main(String[] args)
    {
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the number of tower:");
            int n=sc.nextInt();
            solve(n);
            System.out.print("enter Y to Continue:");
            char ch=Character.toLowerCase(sc.next().charAt(0));
            if(ch!='y')
            {
                break;
            }
        }

    }
}
