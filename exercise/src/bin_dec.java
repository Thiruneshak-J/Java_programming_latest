import java.util.Scanner;
public class bin_dec
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String bin;
        System.out.print("enter the binary:");
        bin=sc.nextLine();
        int i,dec=0,power=0;
        for(i=bin.length()-1;i>=0;i--)
        {
            if(bin.charAt(i)=='1')
            {
                dec += Math.pow(2,power);
            }
            power++;
        }
        System.out.printf("answer of this binary number %s is : %d%n",bin,dec);
    }

}
