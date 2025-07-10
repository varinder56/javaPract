import java.util.*;
public class towerOfHanoi {         //82
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Disks : ");
        int n = sc.nextInt();
            sc.close();
        
        hanoi(n, "A", "B", "C");
    }
    public static void hanoi(int n ,String src,String helper, String dest)
    {
        if(n==1)
        {
            System.out.println("Move disk 1 from rod "+src+" to rod "+dest);
            return;
        }
        hanoi(n-1, src, dest,helper);
        System.out.println("Move disk "+n+" from rod "+src+" to rod "+dest);
        hanoi(n-1, helper, src, dest);
    }

}
