public class ex_21_1_to_100_skip_5
{
    public static void main(String[] args)
    {
        int i;
        for(i=0;i<=100;i++)
        {
            if(i%5==0)
            {
                System.out.printf("%n");
                continue;
            }
            else
            {
                System.out.printf("%d\t",i);
            }
        }
    }

}
