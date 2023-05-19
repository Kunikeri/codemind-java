import java.util.*;
public class Bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        float n=sc.nextFloat();
        double bill;
        if(n<200)
          {
            bill= (float)n*1.20;   
          }
          else if(n>200 && n<400)
         {
            bill=(float)n*1.50;
         }
        else if(n>400 && n<600)
        {
             bill=(float)n*1.80;
        }
        else
        {
            bill=(float)n*2.00;
        }
        if(n>400)
        {
            bill=(float)bill+0.15*bill;
        }
        else
        {
            bill=(float)bill+100;
        }
        System.out.format("%.2f",bill);
        sc.close();
      }
  }