public class shiftCharInStrEnd {
    public static void main(String[] args) {
        String str = "ABXCDXXEFXGHXIJKX";

        moveAllToEnd(str,'X');   //89 :::: O(n+count)--> O(n+n)--> O(2n)--> O(n)
    }

    public static void moveAllToEnd(String str,char Element)
    {
        moveAllToEnd(str,0, Element,0,new StringBuilder());
    }
    
    public static void moveAllToEnd(String str , int idx,char Element,int count,StringBuilder Fstr)
    {   

        if(idx == str.length())
        {   
            for(int i=0;i<count;i++)
            {
                Fstr.append(Element);
            }
            System.out.println("New Refined String ::: "+Fstr);
            return;
        }

        if (Element==str.charAt(idx))
        {
          count++  ;
          moveAllToEnd(str, idx+1, Element, count, Fstr);
        }
        else
        {
            Fstr.append(str.charAt(idx));
            moveAllToEnd(str, idx+1, Element, count, Fstr);
        }
    }
}
