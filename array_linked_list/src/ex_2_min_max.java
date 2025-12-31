import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
public class ex_2_min_max
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      LinkedList<Integer>list=new LinkedList<>();
      while(true)
      {
          System.out.print("enter the number :");
          int num=sc.nextInt();
          list.add(num);
          System.out.print("y-continue,n-not:");
          char ch=Character.toLowerCase(sc.next().charAt(0));
          if (ch!='y')
          {
              break;
          }
      }
      System.out.println("linkedList is "+list);
      int i,j,min=list.get(0),max=list.get(0);
      for(i=1;i<list.size()-1;i++)
      {
          for(j=i+1;j<list.size();j++)
          {
              if (list.get(j) < list.get(i))
              {
                  if(min>list.get(j))
                  {
                      min = list.get(j);
                  }
              }
          }
      }
      for(i=1;i<list.size()-1;i++)
      {
          for (j = i + 1; j < list.size(); j++)
          {
              if (list.get(j) > list.get(i))
              {
                  if(max<list.get(j))
                  {
                      max = list.get(j);
                  }
              }
          }
      }
      System.out.println("maximum number in the list:"+max);
      System.out.println("minimum number in the list :"+min);
      System.out.printf("minimum of list is %d\n", Collections.min(list));
      System.out.printf("maximum of list is %d\n",Collections.max(list));

    }

}
