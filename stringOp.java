//ALWAYS REMEMBER : Java Strings are Immutable. 

public class stringOp {
    public static void main(String[] args) {
    

//Concatenation (Joining 2 strings)
System.out.println("//Concatenation (Joining 2 strings) : ");
String firstName = "varinder";
String secondName = "singh";

    String fullName = firstName + " " + secondName;
    System.out.println(fullName);

//Print length of a String
System.out.println("//Print length of a String : ");
 System.out.println(fullName.length());
 

 //Access characters of a string (charAt)
 System.out.println("//Access characters of a string (charAt)");
 System.out.println(fullName.charAt(13)); 


 //Access characters of a string using loop (charAt)
 System.out.println("//Access characters of a string using loop (charAt)");
       for(int i=0; i<fullName.length(); i++) {
           System.out.println(fullName.charAt(i));
       }

//Compare 2 strings
System.out.println("//Compare 2 strings using  .equals : ");
 if(firstName.equals(secondName)) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }

System.out.println("//Compare 2 strings using  .compareTo : ");
 if(firstName.compareTo(secondName)==0) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }

//Substring
System.out.println(fullName.substring(0, 4));
System.out.println(fullName.substring(0, 8));
System.out.println(fullName.substring(0, 14));
System.out.println(fullName.substring(9, 14));
System.out.println(fullName.substring(9,fullName.length()));
System.out.println(fullName.substring(9));

//ParseInt Method of Integer class
System.out.println("//ParseInt Method of Integer class");
String str = "123";
int number = Integer.parseInt(str);
System.out.println(number);

//ToString Method of String class
System.out.println("//ToString Method of String class");
String str2 = Integer.toString(number);
System.out.println(str2);
System.out.println(str.length());


}
}