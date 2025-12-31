import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;
public class ex_3_remove_dup
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList(Arrays.asList(1,2,3,2,4,3,5,1));
        System.out.println(list);
        int i,j;
        for(i=0;i<list.size()-1;i++)
        {
            for(j=i+1;j<list.size();j++)
            {
                if (list.get(i) == list.get(j))
                {
                    list.remove(j);
                    break;
                }
            }
        }
        System.out.print(list);



    }

}
