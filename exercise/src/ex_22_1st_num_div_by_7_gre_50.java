public class ex_22_1st_num_div_by_7_gre_50
{
    public static void main(String[] args)
    {
        for(int i=50;i<=9999;i++)
        {
            if(i%7==0)
            {
                System.out.printf("1st number which is divisible by 7 after 50 is %d",i);
                break;
            }
        }
    }

}
