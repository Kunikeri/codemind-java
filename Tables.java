import java.util.*;
public class Table
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=m;i++)
        {
          if(i%2!=0)
         {
            System.out.println(n+" x "+i+" = "+n*i);
         }
    }
  }
}