import java.util.Scanner;
//pg 64
public class powBaseFunc {

     // Function to check if num is a power of base
    public static boolean isPowerOf(int num, int base) {
        if (num <= 0 || base <= 1)
         {
            return false;
        } // base must be >1

        while (num > 1) {
            if (num % base != 0) {
                return false;
            }
            num = num / base;
        }

        return true;
    }

    public static void main(String[] args)
     {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();     
        System.out.println("Enter the base");
        int base = sc.nextInt(); 
        sc.close();

        if (isPowerOf(num, base)) {
            System.out.println(num + " is a power of " + base);
        } else {
            System.out.println(num + " is NOT a power of " + base);
        }
    }
}
