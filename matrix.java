import java.util.*;
public class matrix {
    public static void main(String[] args) {
        int[][] num = new int[3][5];
        Scanner sc = new Scanner(System.in);
        int c=1;
        for (int i = 0; i<3;i++)
        {
            for (int j = 0; j<5;j++)
            {
                System.out.println("enter "+c+" th element :");
                num[i][j]=sc.nextInt();
                c++;
            }
        }
        sc.close();
        System.out.println();
        for (int i = 0; i<3;i++)
        {
            for (int j = 0; j<5;j++)
            {
                System.out.print(num[i][j]);
    
            }
            System.out.println();
        }
    }
}
