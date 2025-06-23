
import java.util.*;
public class facto {
    public static int factorial(int x)
    {
        int y=1;
        for(int i=2; i<=x;i++)
        {
            y=y*i;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        sc.close();
         if(fact < 0)
        {
            System.out.println("Factorial of negative number doesn't exist");
            return;
        } 
        System.out.println("Factorial of " + fact + " is " + factorial(fact));
    }
}
