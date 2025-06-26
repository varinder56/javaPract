public class insertionSort {
     public static void main(String args[]) {
       int arr[] = {6,5,4,3,2,1};

      int lc=0;
       //insertion sort
       for(int i=1; i<arr.length; i++)
        {
           int current = arr[i];
           int j = i - 1;
               while(j >= 0 && arr[j] > current)
                {
                   //Keep swapping
                   arr[j+1] = arr[j];
                   j--;
                   lc++;
               }
            arr[j+1] = current;
       }
       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i] + " ");
       } 
       System.out.println("\n"+lc+" loops\"");    
   }

}
