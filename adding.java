
import java.util.*;
public class adding {
    public static int sum(int x, int y)
    {
        int z=x+y;
        return z;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        sc.close();
        int c=sum(a,b);
        System.out.println("Sum of two numbers is "+c);

    }
}
