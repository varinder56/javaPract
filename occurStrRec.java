//87 //Time complexity ::::: O(n)
public class occurStrRec {
  public static void main(String[] args) 
  {
    String str = "FSRSRAAATDFUUGYFDATESXXGHBAC";
    FindOccurence(str,0,'A');
  } 
  
  public static int first = -1;
  public static int last = -1;

  public static void FindOccurence(String str,int idx,char Element)
  {
    if(idx == str.length())
    {   
        System.out.println("First Occurence ::: "+ first);
        System.out.println("last Occurence ::: "+ last);
        return;
    }

    char currentChar = str.charAt(idx);
    if(currentChar == Element)
    {
        if(first == -1)
        {
            first = idx;
        }
        else
        {
            last = idx;
        }
    }

    FindOccurence(str, idx+1, Element);

  }
}

