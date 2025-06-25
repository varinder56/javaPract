import java.util.*;
public class countBinarBit {
    //68
        //using bitwise
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int ones = 0, zeros = 0;
        int totalBits = 32; // Considering 32-bit integer

        // Loop through all 32 bits
        for (int i = 0; i < totalBits; i++) {
            if ((n & (1 << i)) != 0) {
                ones++;
            } else {
                zeros++;
            }
        }

        System.out.println("Total bits considered: " + totalBits);
        System.out.println("Number of 1's: " + ones);
        System.out.println("Number of 0's: " + zeros);

        sc.close();
    }


         
}
