
import java.util.*;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,i;
        int[] marks = new int[3];
        for(i=0;i<3;i++)
        {
            System.out.println("Enter marks of student " + (i+1) + ":");
            x = sc.nextInt();
        
            marks[i] = x; 
        }
        
        
        System.out.println();
        for(i=0;i<3;i++)
        {
            System.out.println("marks of student " + (i+1) + ": "+marks[i]);
        }
    }
}
