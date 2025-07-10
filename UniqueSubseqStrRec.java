import java.util.HashSet;

public class UniqueSubseqStrRec {
    // 95 :::::: O(2ⁿ-1) --> O(2ⁿ)  ::::  Similar Program -> SubsequenceStrRec.java
/* 

Level 0: subSeq("abc", 0, "")                    
│
├── Include 'a' → subSeq("abc", 1, "a")          
│   ├── Include 'b' → subSeq("abc", 2, "ab")     
│   │   ├── Include 'c' → subSeq("abc", 3, "abc") → print "abc"
│   │   └── Exclude 'c' → subSeq("abc", 3, "ab") → print "ab"
│   └── Exclude 'b' → subSeq("abc", 2, "a")      
│       ├── Include 'c' → subSeq("abc", 3, "ac") → print "ac" 
│       └── Exclude 'c' → subSeq("abc", 3, "a")  → print "a"
│
└── Exclude 'a' → subSeq("abc", 1, "")           
    ├── Include 'b' → subSeq("abc", 2, "b")      
    │   ├── Include 'c' → subSeq("abc", 3, "bc") → print "bc"
    │   └── Exclude 'c' → subSeq("abc", 3, "b")  → print "b"
    └── Exclude 'b' → subSeq("abc", 2, "")       
        ├── Include 'c' → subSeq("abc", 3, "c")  → print "c"
        └── Exclude 'c' → subSeq("abc", 3, "")   → print ""

*/


    public static void main(String[] args) {
        String str = "aaa";
        HashSet <String> MySet = new HashSet<>();
        subSeq(str,0,"",MySet);
    }

    public static void subSeq(String str, int idx,String newStr,HashSet <String> MySet)
    {
        if (idx==str.length())
        {
            if(MySet.contains(newStr)) 
            {
                return;
            }
            else
            {
                System.out.println(newStr);
                MySet.add(newStr);
                return;
            }
        }

            char currChar = str.charAt(idx);

            //To Be Included in String 
            subSeq(str, idx + 1, newStr+currChar,MySet);

            //To be Exlude in String
            subSeq(str, idx + 1, newStr,MySet);
            

    }
}
