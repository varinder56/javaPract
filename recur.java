public class recur {
    
    public static void main(String[] args)
    {
        int a=10;
        pN(a);
    }
    public static void pN(int n)
    {
        if(n==0)
        {
            return ;
        }

            System.out.println(n);
            pN(n-1);
    }
}
