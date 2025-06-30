public class logRaisedToRec {
    public static void main(String[] args) {        //79
        int base = 5;
        int exponent = 3;
        System.out.println("result : "+calPower(base,exponent));
    }

    public static int calPower(int x, int n)
    {
        if (n==0) {
            return 1;
            
        }
        if (x==0) {
            return 0;
        }
        if (n%2==0) 
        {
            return calPower(x,n/2)*calPower(x,n/2);
        }
        else
        {
            return x*calPower(x,n/2)*calPower(x,n/2);
        }
    }
}
