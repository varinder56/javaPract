import java.util.*;

public class arrStr {
    public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter the number of srings to take input :");
     int size = sc.nextInt();
     String array[] = new String[size];
     int totLength = 0;


     for(int i=0; i<size; i++)
      {
        System.out.print("Enter "+ i+1+"th String : ");
       array[i] = sc.next();
       totLength += array[i].length();
     }
    sc.close();

     System.out.println("Total cumulative Length : "+totLength);
   }

}
