import java.util.*;
public class sumRec {           //71
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to Print Sum : ");
        System.out.print("From : ");
        int a = sc.nextInt();
        System.out.print("To : ");
        int b = sc.nextInt();
            sc.close();
        int s=sumRange(a,b);
        System.out.println("Sum of numbers from "+a+" to "+b+" is "+s);
    }

    public static int sumRange(int i , int n)
    {
        int sum =0;
        if(i==n)
        {
            return sum +=i;
        }

        sum=sumRange(i+1,n);
        return sum +=i;
    }
}
