
import java.util.*;
public class GCD {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first number: ");
       int n1 = sc.nextInt();
       System.out.println("Enter the second number: ");
       int n2 = sc.nextInt();
       sc.close();
       int r= gcd(n1,n2);
       System.out.println("GCD or HCF is : "+ r);
   }  
   
   public static int gcd(int x, int y)
   {
    while (y!=0) 
    {
            int r = x%y;
            x = y;
            y = r;
            
        }
        return x;
   }

}
