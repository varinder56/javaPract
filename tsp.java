public class tsp {

    static int[][] graph = {
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
        {20, 25, 30, 0}
    };

    static boolean[] visited;
    static int minCost = Integer.MAX_VALUE;

    static void travel(int currentCity, int count, int cost) {

        if (count == graph.length) {
            cost += graph[currentCity][0];  

            if (cost < minCost)
                minCost = cost;
            return;
        }

        for (int i = 0; i < graph.length; i++) {

            if (!visited[i]) {

                visited[i] = true;

                travel(i, count + 1, cost + graph[currentCity][i]);

                visited[i] = false;   // Backtrack
            }
        }
    }

    public static void main(String[] args) {

        visited = new boolean[graph.length];

        visited[0] = true;   // Start from city 0

        travel(0, 1, 0);

        System.out.println("Minimum Cost = " + minCost);
    }
}