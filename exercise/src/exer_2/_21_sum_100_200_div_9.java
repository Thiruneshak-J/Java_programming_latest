package exer_2;

public class _21_sum_100_200_div_9
{
    public static void main(String[] args)
    {
        int i;
        for(i=100;i<=200;i++)
        {
            if(i%9==0)
            {
                System.out.printf("%d ",i);
            }
            else
            {
                continue;
            }
        }
    }
}
