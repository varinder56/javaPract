
import java.util.*;
public class funca {
    
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        myName(name);
    }
    public static void myName(String x)
    {
        System.out.println("Hello" + x);
        return;
    }
}
