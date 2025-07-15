public class permutationsRec {
    //100 :::::: O(n!)  ::::Similar Program ->
   public static void main(String[] args)
    {
    String str = "ABC";
    perm(str,"");

    } 

        /*
        
        Level 0: perm("ABC", "")
│
├── Level 1: Choose 'A' → perm("BC", "A")
│   ├── Level 2: Choose 'B' → perm("C", "AB")
│   │   └── Level 3: Choose 'C' → perm("", "ABC")  Base Case → Print: ABC
│   └── Level 2: Choose 'C' → perm("B", "AC")
│       └── Level 3: Choose 'B' → perm("", "ACB")  Base Case → Print: ACB
│
├── Level 1: Choose 'B' → perm("AC", "B")
│   ├── Level 2: Choose 'A' → perm("C", "BA")
│   │   └── Level 3: Choose 'C' → perm("", "BAC")  Base Case → Print: BAC
│   └── Level 2: Choose 'C' → perm("A", "BC")
│       └── Level 3: Choose 'A' → perm("", "BCA")  Base Case → Print: BCA
│
└── Level 1: Choose 'C' → perm("AB", "C")
    ├── Level 2: Choose 'A' → perm("B", "CA")
    │   └── Level 3: Choose 'B' → perm("", "CAB")  Base Case → Print: CAB
    └── Level 2: Choose 'B' → perm("A", "CB")
        └── Level 3: Choose 'A' → perm("", "CBA")  Base Case → Print: CBA



        perm("ABC", "")
 ├─ perm("BC", "A")
 │   ├─ perm("C", "AB") → perm("", "ABC") 
 │   └─ perm("B", "AC") → perm("", "ACB") 
 ├─ perm("AC", "B")
 │   ├─ perm("C", "BA") → perm("", "BAC") 
 │   └─ perm("A", "BC") → perm("", "BCA") 
 └─ perm("AB", "C")
     ├─ perm("B", "CA") → perm("", "CAB") 
     └─ perm("A", "CB") → perm("", "CBA") 


         */

    public static void perm(String str,String permut)
    {
        if(str.length()==0)
        {
            System.out.println(permut);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            perm(newStr,permut+currChar);
            
        }

    }
}
