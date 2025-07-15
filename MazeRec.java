public class MazeRec {
    //112  :::::: O()  ::::Similar Program ->
   public static void main(String[] args) {
    int n=3,m=3;
    int TotalPaths = calPaths(0,0,n,m);
    System.out.println("Total number of paths = "+TotalPaths);
   } 

   public static int calPaths(int i, int j, int n, int m)
   {
    if(i==n-1 && j==m-1)
    {
        return 1;
    }
    if(i==n || j==m)
    {
        return 0;
    }

    //move downward
    int downwardPaths = calPaths(i+1, j, n, m);
    //move right
    int rightPaths = calPaths(i, j+1, n, m);

    return downwardPaths+rightPaths;

   }
}
