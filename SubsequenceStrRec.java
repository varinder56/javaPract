public class SubsequenceStrRec {

// 92 :::::: O(2ⁿ-1) --> O(2ⁿ)  ::::  Similar Program -> UniqueSubseqStrRec.java
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
        String str = "abc";
        subSeq(str,0,"");
    }

    public static void subSeq(String str, int idx,String newStr)
    {
        if (idx==str.length())
        {
            System.out.println(newStr);
            return;   
        }

            char currChar = str.charAt(idx);

            //To Be Included in String 
            subSeq(str, idx + 1, newStr+currChar);

            //To be Exlude in String
            subSeq(str, idx + 1, newStr);
            

    }
}
