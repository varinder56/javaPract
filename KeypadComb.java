public class KeypadComb 
{

    //97  :::::: O(4ⁿ)  ::::Similar Program ->
    /*
    
    Level 0: printKeypadCombination("23", 0, "")
│
├── d → printKeypadCombination("23", 1, "d")
│   ├── g → printKeypadCombination("23", 2, "dg") → print: "dg"
│   ├── h → printKeypadCombination("23", 2, "dh") → print: "dh"
│   └── i → printKeypadCombination("23", 2, "di") → print: "di"
│
├── e → printKeypadCombination("23", 1, "e")
│   ├── g → printKeypadCombination("23", 2, "eg") → print: "eg"
│   ├── h → printKeypadCombination("23", 2, "eh") → print: "eh"
│   └── i → printKeypadCombination("23", 2, "ei") → print: "ei"
│
└── f → printKeypadCombination("23", 1, "f")
    ├── g → printKeypadCombination("23", 2, "fg") → print: "fg"
    ├── h → printKeypadCombination("23", 2, "fh") → print: "fh"
    └── i → printKeypadCombination("23", 2, "fi") → print: "fi"

    
     */

    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
"tu", "vwx", "yz"};

public static void printKeypadCombination(String number, int idx, String newString)
{
    if(idx == number.length())
    {
    System.out.println(newString);
    return;
    }

    char currChar = number.charAt(idx);
    String keypadLetters = keypad[currChar-'0'];
        for(int i=0; i<keypadLetters.length(); i++)
        {
        char curr = keypad[currChar-'0'].charAt(i);
        printKeypadCombination(number, idx+1, newString+curr);
        }
}

public static void main(String args[]) {
String number = "23";
printKeypadCombination(number, 0, "");
}
}
