
public class hollbutter {
    public static void main(String[] args) {
        int i,j; int n=10;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j==1||j==i||i==1)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                if(j==1||j==i||i==1)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                if(j==1||j==i||i==1)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(j=1;j<=2*(n-i);j++)
            {
                System.err.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                if(j==1||j==i||i==1)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
