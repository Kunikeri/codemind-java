import java.util.*;
public class disarium
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int r=0,n,temp,k,s=0,i;
        n=sc.nextInt();
        k=(int)Math.log10(n)+1;
        temp=n;
        for(i=k;i>=1;i--)
        {
            r=n%10;
            s=s+(int)Math.pow(r,i);
            n=n/10;
        }
        if(s==temp)
        {
            System.out.println("True");
        }
         else
        {
             System.out.println("False");
        }
        sc.close();
    }
}