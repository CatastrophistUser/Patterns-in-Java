import java.util.*;
class Pattern_20
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=i;j>1;j--)
            System.out.print(" ");
            for(j=4;j>=i;j--)
            System.out.print("*");
            System.out.println();
        }
    }
}