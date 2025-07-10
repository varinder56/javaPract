public class VoidDupStrRec {
  //90  :::::: O(n)  ::::Similar Program -> statDuplStrRec.java | DuplStrRec.java 
  public static void main(String[] args) {
    String str = "AESYRFCTRTCSRDVYYTYD";
    remDup(str,0,"");
  }

public static boolean map[] = new boolean[26];

  public static void remDup(String str,int idx,String Fstr)
  {
    if(idx==str.length())
    {
        System.out.println(Fstr);
        return;
    }

        char currChar = str.charAt(idx);
    if(map[currChar-'A'])
    {
        remDup(str,idx+1,Fstr);
    }
    else
    {
        map[currChar-'A'] = true;
         Fstr += currChar;
        remDup(str,idx+1,Fstr);
       
    }
  }

}
