public class search {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "elder"};
        int size = words.length;
        for(int i=0;i<size;i++)
        {
            if(words[i].equals("banana"))
            {
                System.out.println(" banana Found at :"+i);
            }
        }
    
    }
}
