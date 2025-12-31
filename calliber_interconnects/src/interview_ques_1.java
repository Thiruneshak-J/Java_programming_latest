public class interview_ques_1
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(i==j)
                {
                    System.out.print(5-i);
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
