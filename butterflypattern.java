import java.util.*;
public class butterflypattern {
    public  static void main(String []args)
    {
        System.out.println("enter a number for the pattern:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //upperpart
        for(int i=1;i<=n;i++)
        {
            //leftpart
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            int space=(n-i)*2;
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            //rightpart
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //nextline
            System.out.println();
        }
        //lowerpart
        for(int i=n;i>=1;i--)
        {
            //leftpart
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            int space=(n-i)*2;
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            //rightpart
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //nextline
            System.out.println();
        }


    }
}
