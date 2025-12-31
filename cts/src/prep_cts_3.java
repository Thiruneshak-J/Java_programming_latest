import java.util.Arrays;
import java.util.Scanner;
public class prep_cts_3
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the number of string array:");
       int inp_1=sc.nextInt();
       sc.nextLine();//to clear
       String[] arr=new String[inp_1];
       for(int i=0;i<inp_1;i++)
       {
           arr[i]=sc.nextLine();
       }
       System.out.println(Arrays.toString(arr));
       int max_co=0;
       for(int i=0;i<inp_1;i++)
       {
           char[] arr_1=arr[i].toCharArray();
           int co=0;
           for(int j=0;j<arr_1.length;j++)
           {
               if(arr_1[j]!='a'&& arr_1[j]!='A' && arr_1[j]!='e' && arr_1[j]!='E' && arr_1[j]!='i'&& arr_1[j]!='I' && arr_1[j]!='o'&& arr_1[j]!='O' && arr_1[j]!='u'&& arr_1[j]!='U' )
               {
                   co+=1;
               }
           }
           if(max_co<co)
           {
               max_co=co;
           }
       }
       System.out.println(max_co );
       long fac=1;
       for(int i=2;i<=max_co;i++)
       {
           fac*=i;
       }
       System.out.println("maximum is "+fac);
    }

}
