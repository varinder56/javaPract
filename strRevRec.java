public class strRevRec {
    public static void main(String[] args) {        //84
        String str = "ABCD";
        int idx=str.length()-1;
        System.out.println("Reversed String ::: "+RevStr(idx,str));
    }
    public static StringBuilder RevStr(int idx,String str) 
    {   
        StringBuilder Fstr = new StringBuilder();
        if(idx==0)
        {
            char c =str.charAt(idx);
            return Fstr.insert(0,c);
        }
        char c =str.charAt(idx);
        Fstr=RevStr(idx-1,str);
         return Fstr.insert(0,c);
    
    }
}
