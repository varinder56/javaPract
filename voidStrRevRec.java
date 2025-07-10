public class voidStrRevRec {
     
    public static void main(String[] args) {
        String str = "ABCD";        //85 //Time complexity :::: O(n)
        int idx=str.length()-1;
        RevStr(idx,str,new StringBuilder());
    }
    public static void RevStr(int idx,String str,StringBuilder Fstr) 
    {   
        
        if(idx==0)
        {
            char c =str.charAt(idx);
            Fstr.append(c);
            System.out.println("Reversed String ::: "+Fstr);
            return;
        }
        char c =str.charAt(idx);
        Fstr.append(c);
        RevStr(idx-1,str,Fstr);
        
    
    }
}

