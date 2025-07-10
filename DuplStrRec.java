public class DuplStrRec {
    //90  :::::: O(n)  ::::Similar Program -> VoidDupStrRec.java | statDuplStrRec.java
  public static void main(String[] args) {
    String str = "ABCCDCEFGGF";
    String r = remDup(str,0);
    System.out.println("Final String After Duplicates Removal :::: "+r);
  }

public static boolean map[] = new boolean[26];

  public static String remDup(String str,int idx)
  {   
        String Fstr ="";
    if(idx==str.length())
    {
        return Fstr ;
    }

        char currChar = str.charAt(idx);
    if(map[currChar-'A'])
    {
         Fstr = remDup(str,idx+1);
         return Fstr;
    }
    else
    {
        map[currChar-'A'] = true;
        Fstr += currChar;
        Fstr += remDup(str,idx+1);
        return Fstr;
        
    }
  }
}
