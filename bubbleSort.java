public class bubbleSort {
    
//63
   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 2};
       //bubble sort //w.Time Complexity = O(n^2)
       Boolean swaped ; int lc=0;
       for(int i=0; i<arr.length-1; i++) {
            swaped =false;
           for(int j=0; j<arr.length-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                   
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swaped = true;
               }
               lc++;
           }

            if (!swaped)
            {
                 break;
            }
       }

       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i]+" ");
       }
       System.out.println("\n"+lc+" loops");
    }
}