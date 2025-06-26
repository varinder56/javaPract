
import java.util.*;
public class recursion {
    public static int fact(int x)
    {
    if(x==0||x==1)
    {
        return 1;
    }
        return x*fact(x-1);
    
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        if(n<0)
        {
            System.out.println("Factorial of negative number doesn't exist");
            return;
        }
        System.out.println("Factorial By Recursion of "+n+"is "+fact(n));
    }
}
