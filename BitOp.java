import java.util.*;
public class BitOp {

    public static void main(String[] args) {

        //Get Bit
        System.out.println("//Get Bit ");
        Scanner bc = new Scanner(System.in);

        System.out.print("Enter a number To Check Bit :");
        int n = bc.nextInt();
        System.out.println("Enter Bit Position To Check For :");
        int pos = bc.nextInt();
    
        int bitmask = 1<<pos;
        if ((bitmask & n) == 0)
        {
            System.out.println("Bit at position " + pos + " is Zero ");

        }
        else{
            System.out.println("Bit at position " + pos + " is One ");
        }
        
        //Set Bit
        System.out.println("//Set Bit ");
        System.out.print("Enter a number To set Bit for :");
        int num = bc.nextInt();
        System.out.println("Enter Bit Position To set For :");
        int posi = bc.nextInt();

        int BitMask = 1<<posi;
        int result = num | BitMask;
        System.out.println("Number after setting bit at position " + posi +" to number "+ num+"("+Integer.toBinaryString(num)+ ") is " + result+"("+Integer.toBinaryString(result)+")");
        

        //clear bit
        System.out.println("//Clear Bit ");

        System.out.print("Enter a number To clear Bit for :");
        int numb = bc.nextInt();
        System.out.println("Enter Bit Position To clear :");
        int posit = bc.nextInt();
        int bitM = 1<<posit;
        int notbit = ~(bitM);
        int newnum = numb & notbit;
        System.out.println("Number after clearing bit at position " + posit +" to number "+ numb+" is : "+newnum);


        //update bit
        System.out.println("//update bit ");
        System.out.print("Enter a number To Update Bit :");
        int number = bc.nextInt();
        System.out.println("Enter Bit Position To update :");
        int position = bc.nextInt();
        System.out.println("Enter Bit Value To update :");
        int value = bc.nextInt();
        
        int bitMas = 1<<position;
        
        int newnumber =0;
        if (value==1) 
        {
            newnumber = bitMas|number;
            System.out.println("Number after updating bit at position " + position +" of number "+number+"("+Integer.toBinaryString(number)+") is : "+newnumber+"("+Integer.toBinaryString(newnumber)+")");
        
        }
        else if (value==0)
        {
            int notbitM = ~(bitMas);
            newnumber = numb & notbitM;
            System.out.println("Number after updating bit at position " + position +" of number "+number+"("+Integer.toBinaryString(number)+") is : "+newnumber+"("+Integer.toBinaryString(newnumber)+")");
        
        }
        else
        {
            System.out.println("Invalid Value");
        }


        //toggle bit with XOR
        System.out.println("//toggle bit with XOR");
        System.out.print("Enter a number To toggle Bit :");
        int numbs = bc.nextInt();
        System.out.println("Enter Bit Position To toggle :");
        int posits = bc.nextInt();
        bc.close();
        int bitMasks= 1<<posits;
        
        int newnums = numbs ^ bitMasks;
        System.out.println("Number after toggling bit at position " + posits +" of number "+numbs+"("+Integer.toBinaryString(numbs)+") is : "+newnums+"("+Integer.toBinaryString(newnums)+")");
        
    }
}