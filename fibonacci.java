
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci Series From Zero Onwards :.....");
        fibo(n);
        System.out.println("Series Printed Successfully");
    }
    public static void fibo(int n) {
        int a = 0, b = 1, c ;
        for (int i = 0; i<n;i++)
        {
            System.out.print(a+" ");
            c=a+b;  
            a=b;
            b=c;
        }
    }
}
