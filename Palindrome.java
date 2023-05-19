import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,s=0,temp;
        temp=n;
        while(temp!=0)
          {
              r=temp%10;
              s=s*10+r;
              temp=temp/10;
          }
        if(s==n)
         {
            System.out.println("True");
         }
        else
        {
             System.out.println("False");
        }
      }
  }