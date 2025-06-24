import java.util.Scanner;
//pg63
public class pow2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        /*A power of 2 has only one '1' in its binary representation.
        powers of 2 have only one bit set in binary (e.g., 8 = 1000).
Subtracting 1 flips that bit and all bits after it (e.g., 7 = 0111).
Bitwise AND of both is 0.*/

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is NOT a power of 2.");
        }

        sc.close();

/*🔹 Method 2: Using Highest Power of 3 (Optimized for Large Numbers)
The highest power of 3 in int range is 3^19 = 1162261467

So:

If 1162261467 % num == 0,
then num is a power of 3.
*/

/* if (num > 0 && 1162261467 % num == 0) {
    System.out.println("Power of 3");
} */

       /* 
 * -------------------- LOGIC FLOW --------------------
 * Checks if a number is a power of any given base (N).
 * 
 * ➤ Works for bases >= 2.
 * ➤ Keep dividing the number by the base:
 *     ▪ If at any step remainder is not 0 → not a power.
 *     ▪ If finally you get 1 → it is a power.
 * 
 * Example:
 *     isPowerOf(625, 5) → true   (5^4 = 625)
 *     isPowerOf(81, 3)  → true   (3^4 = 81)
 *     isPowerOf(100, 10)→ false
 * 
 * Can be reused for any power check logic in Java.
 * -----------------------------------------------------
 */
    }
}
