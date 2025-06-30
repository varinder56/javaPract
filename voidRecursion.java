import java.util.Scanner;

public class voidRecursion {
    public static void fact(int x,int factorial)
    {   
        
        if(x==0||x==1)          //73
        {  
            
            System.out.println("Factorial By Recursion is "+factorial);
            return ;
        }   
            factorial *= x;
            fact(x-1,factorial);
            return;
    
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

        fact(n,1);
    }
}
