import java.util.Scanner;
import java.util.Stack;
public class ex_1_stack_imp
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>stack_1=new Stack<>();
        stack_1.push(1);
        stack_1.push(2);
        stack_1.push(3);
        System.out.println(stack_1.pop());
        System.out.println(stack_1.peek());
    }

}
