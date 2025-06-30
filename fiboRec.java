import java.util.*;
public class fiboRec {      //75
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt() ;
        System.out.print("Enter Number to Start with : ");
        int a = sc.nextInt() ;
            sc.close();
        fib(a,n);
    }
    
    public static void fib(int x,int y)
    {
        fib(x,x+1,y);
    }

    public static void fib( int n1,int n2,int n ) 
    {
        if(n==0)
        {
            return;
        }
        int n3=n1+n2;
        System.out.println(n1);
        fib(n2,n3,n-1);
    }
}
