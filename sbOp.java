public class sbOp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Varinder Singh");
        System.out.println(sb);

     // Get A Character from Index
        System.out.println(sb.charAt(0));

     //Set a Character at Index
        sb.setCharAt(0, 'S');
        System.out.println(sb);

     //Insert a Character at Some Index
          sb.insert(5, 'P');
          System.out.println(sb);

     //Delete char at some Index
        sb.delete(0, 1);
         System.out.println(sb);
         System.out.println(sb.delete(3, 7));

     //Append a char (Append means to add something at the end.)
        sb.append(" ji");
         System.out.println(sb); 

     //Print Length of String
        System.out.println(sb.length());
    }
}
