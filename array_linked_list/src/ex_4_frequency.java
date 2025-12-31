import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
public class ex_4_frequency
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<String>list=new LinkedList<>(Arrays.asList("java","python","java","c++","java","c++","java","python","java","python","C++"));
        System.out.println(list);
        int i,j,k;

        for(i=0;i<list.size()-1;i++)
        {
            boolean foundbefore=false;
            for(k=0;k<i;k++)
            {
                if(list.get(i).equalsIgnoreCase(list.get(k)))
                {
                    foundbefore=true;
                    break;
                }
            }
            if(foundbefore)
            {
                continue;
            }

            int co=1;

            for(j=i+1;j<list.size();j++)
            {
                if(list.get(i).equalsIgnoreCase(list.get(j)))
                {
                    co+=1;

                }

            }
            System.out.printf("the element %s is %d times\n",list.get(i),co);
        }
        System.out.println("java:"+Collections.frequency(list,"java"));
        System.out.println("python:"+Collections.frequency(list,"python"));
        System.out.println("c++:"+Collections.frequency(list,"c++"));

        sc.close();

    }
}
