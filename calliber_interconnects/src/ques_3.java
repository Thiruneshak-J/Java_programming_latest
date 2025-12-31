public class ques_3
    //triangle-pattern
{
    public static void main(String[] args)
    {
        int i,j,k;
        for(i=0;i<5;i++)
        {
            for(j=4;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                System.out.print((char)(65+k)+" ");
            }
            System.out.println();
        }
    }
}
