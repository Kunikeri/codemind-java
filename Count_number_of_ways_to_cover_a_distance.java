import java.util.Scanner;
public class Distance
{
    // Function returns count of ways to cover 'dist'
    static int printCountRec(int dist)
    {
        // Base cases
        if (dist<0)
           return 0;
        if (dist==0)
           return 1;
           
           
           
        // Recur for all previous 3 and add the result
        return printCountRec(dist-1) +
               printCountRec(dist-2) +
               printCountRec(dist-3);
    }
    
    
    // driver program
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int dist=sc.nextInt();
        System.out.println(printCountRec(dist));
    }
}