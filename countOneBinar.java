import java.util.*;
public class countOneBinar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        //int count = Integer.bitCount(n);
        
        System.out.println("Binary of number is : "+Integer.toBinaryString(n));
        
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1; // Right shift the number by 1
        }

        System.out.println("Number of 1's in binary: " + count);

        sc.close();
    }
}
