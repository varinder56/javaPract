import java.util.Scanner;

public class Ucreate {
    public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter YOur E-Mail Address :");
     String email = sc.next();
     String userName = "";
        sc.close(); 

     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == '@') {
        break;
       } else {
         userName += email.charAt(i);
       }
     }


     System.out.println("your new Username : "+userName);
   }

}
