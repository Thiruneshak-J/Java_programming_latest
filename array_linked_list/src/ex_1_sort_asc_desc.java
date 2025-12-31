import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class ex_1_sort_asc_desc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        while(true)
        {
            System.out.print("enter the number to add:");
            list.add(sc.nextInt());
            System.out.print("continue - y:");
            char ch=Character.toLowerCase(sc.next().charAt(0));
            if(ch!='y')
            {
                break;
            }
        }
        System.out.println("linkedlist is "+list);

        int i,j;
        for(i=0;i<list.size()-1;i++)
        {
            for (j = i + 1; j < list.size(); j++)
            {
                if (list.get(i) > list.get(j))
                {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("sort as ascending without sort function:"+list);
        LinkedList<Integer>desc_list=new LinkedList<>(list);
        for(i=0;i<desc_list.size()-1;i++)
        {
            for(j=i+1;j<desc_list.size();j++)
            {

                if(desc_list.get(j)>desc_list.get(i))
                {
                    int temp=desc_list.get(i);
                    desc_list.set(i,desc_list.get(j));
                    desc_list.set(j,temp);
                }

            }
        }
        System.out.println("descending order without sort function:"+desc_list);
        Collections.sort(list);
        System.out.println("ascending order with function:"+ list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("decending order with function:"+list);
    }
}