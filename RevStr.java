public class RevStr {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 ="";
        for(int i=str.length()-1;i >= 0;i--)
        {
            str2 += str.charAt(i);
        }
        System.out.println("Reversed String : "+str2);
        System.out.println("Orignal  String : "+str);
    }
}
