import java.util.*;

public class strRep {
    public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter String : ");
     String str = sc.next();
     String result = "";

     System.out.print("Enter Character to Replace with : ");
     String replace = sc.next();
     System.out.print("Enter Character to Remove : ");
     String remove = sc.next();
    //char remove = sc.next().charAt(0);
        sc.close();

     char removeChar = remove.charAt(0);
     

     for(int i=0; i<str.length(); i++) {
       if(str.charAt(i)==(removeChar)) {
         result += replace;
       } else {
         result += str.charAt(i);
       }
     }

     System.out.println("orignal : "+str);
     System.out.println("result : "+result);
   }

}
