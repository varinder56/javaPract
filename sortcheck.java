import java.util.*;

public class sortcheck {
     public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Size :");
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
        System.out.println("Enter " + (i+1) + " th element :");
          numbers[i] = sc.nextInt();
      }

      sc.close();
      boolean isAscending = true;
     
       for(int i=0; i<numbers.length-1; i++) { 
           if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
               isAscending = false;
           }
       }


       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }
      
   }

}
