
public class strdiam {
    public static void main(String[] args) {
        int n = 7;int i,j;

        
        for(i=1;i<=n/2;i++)
        {
            for(j=1;j<=n-i;j++)
            {
            System.out.print(" ");
            }  
     
        for(j=1;j<=(2*i)-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
        }

        for(i=n/2;i>=1;i--)
        {
            for(j=1;j<=n-i;j++)
            {
            System.out.print(" ");
            }  
     
        for(j=1;j<=(2*i)-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
        }

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
            System.out.print(" ");
            }  
     
        for(j=1;j<=(2*i)-1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
