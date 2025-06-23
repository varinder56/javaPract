
import java.util.*;
public class strRepB {
  public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter String : ");
     String str =  sc.next();
     StringBuilder result = new StringBuilder(str);

     System.out.print("Enter Character to Replace with : ");
     String replace = sc.next();
     StringBuilder rep = new StringBuilder(replace);
     
     System.out.print("Enter Character to Remove : ");
     String remove = sc.next();
    //char remove = sc.next().charAt(0);
        sc.close();

     char removeChar = remove.charAt(0);
     char repChar = rep.charAt(0);

     for(int i=0; i<str.length(); i++) {
       if(str.charAt(i)==(removeChar))
        {
         result.setCharAt(i,repChar);
        } 
     }

     System.out.println("orignal : "+str);
     System.out.println("result : "+result);
   }
  
}
