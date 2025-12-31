import java.util.Scanner;
public class bin_to_oct
{
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the binary number:");
            int num=sc.nextInt();
            int rem=0,n=0;
            double dec=0;
            while(num!=0)
            {
                rem=num%10;
                if(rem!=0)
                {
                    dec+=rem*Math.pow(2,n);
                    n+=1;
                    num/=10;
                }
                else
                {
                    n+=1;
                    num/=10;
                }
            }
            System.out.printf("octal of number is %.0f%n",dec);
        }
    }