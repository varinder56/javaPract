

import java.util.Scanner;

public class raisedto
 {
    public static void main(String args[]) {
       System.out.println("Enter Value of x");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.println("Enter n");
       int n = sc.nextInt();
       sc.close();


       float result = raiseto(x, n);
       System.out.println("x to the power n is : "+ result);
   }   

   public static float raiseto(int x,int n)
   {
    //Please see that n is not too large or else result will exceed the size of int
    float result =1;
    if(n>0)
    {   
    for(int i=0; i<n; i++)
        {
          result = result * x;
       }
       //x^n=(2)^3=2*2*2
    }
    else
    {
        result = 1 / (float) Math.pow(x, -n);
    }   
       return result;
   }
}


