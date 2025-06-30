import java.util.Scanner;

public class voidSumRec {       //72
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to Print Sum : ");
        System.out.print("From : ");
        int a = sc.nextInt();
        System.out.print("To : ");
        int b = sc.nextInt();
            sc.close();
        
        sumRange(a,b,0);
        
    }

    public static void sumRange(int i , int n,int sum) 
    {
        
        if(i==n)
        {   
            sum += i;
            System.out.println("Sum is :"+ sum);
            return;
        }

        sum += i;
        sumRange(i+1,n,sum);
        return;
        
    }
}
