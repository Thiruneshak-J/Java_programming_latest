import java.util.ArrayList;
import java.util.Scanner;
public class user_arraylist
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int i;
        for(i=0;i<list.size()+1;i++)
       {
           System.out.print("enter the number:");
           int num=sc.nextInt();
           list.add(i,num);
           System.out.print("want to enter(y) to not(n):");
           char ch=Character.toLowerCase(sc.next().charAt(0));
           if(ch=='n') {
               break;
           }
       }
        System.out.print("arraylist :"+list);
    }
}
