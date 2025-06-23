
import java.util.*;
public class pascaltri {
    public static void main(String[] args) {
        int i,j,n,v=1;
        System.out.println("ENter Number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(v+" ");
                v*=(i-j)/j;
            }
            System.out.println();
        }

    }
}
