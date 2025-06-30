public class raisedToRec {
    public static void main(String[] args) {        //76
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
        int pow =calPower(x, n-1);
        int xpow = x * pow;
        return xpow;
    }
}
