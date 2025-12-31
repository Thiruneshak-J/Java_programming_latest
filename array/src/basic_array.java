//1-declaration
//2-Default values
//3-Traversing (for, for-each)
import java.util.Scanner;
public class basic_array
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            //1-type
            int[] arr={2,3,2005};
            int i;
            for(i=0;i<arr.length;i++)
            {
                System.out.printf("%d%n", arr[i]);
            }

            //2-type
            int[] arr1=new int[5];
            for(i=0;i<arr1.length;i++)
            {
                System.out.print("enter the number:");
                int num=sc.nextInt();
                arr1[i] = num;
            }
            for(i=0;i<arr1.length;i++)
            {
                System.out.printf("%d%n",arr1[i]);
            }
            //3-type
            int n;
            System.out.print("enter the size of array:");
            n=sc.nextInt();
            int[] array=new int[n];
            for(i=0;i<n;i++)
            {
                System.out.print("enter the number:");
                int num=sc.nextInt();
                array[i]=num;
            }
            System.out.println("you entered array is:");
            System.out.print("[");
            for(i=0;i<n;i++)
            {
                if(i!=n-1) {
                    System.out.printf("%d,", array[i]);
                }
                else
                {
                    System.out.printf("%d",array[i]);
                }
            }
            System.out.print("]");
        }
}
