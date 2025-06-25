import java.util.Scanner;

public class NumberSysConv {
    
    public static String decimalToBinary(int decimal) {
        if (decimal == 0)
        {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal >0 ) 
        {
            int bit = decimal % 2;
            binary.insert(0,bit);
            decimal = decimal / 2;
        }
        String bn = binary.toString();
            
        return bn;
        
    }


    // Function to convert Binary to Decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        System.out.println("Enter Binary number :");
        String binaryNumber = sc.next();
        sc.close();
        // Test Decimal to Binary
        String binaryResult = decimalToBinary(decimalNumber);
        System.out.println("Decimal to Binary of " + decimalNumber + " is: " + binaryResult);

        // Test Binary to Decimal
        int decimalResult = binaryToDecimal(binaryNumber);
        System.out.println("Binary to Decimal of " + binaryNumber + " is: " + decimalResult);
    }
}
