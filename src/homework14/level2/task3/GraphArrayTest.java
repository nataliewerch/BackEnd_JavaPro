package homework14.level2.task3;

public class GraphArrayTest {
    public static void main(String[] args) {
        GraphArray graphArray = new GraphArray();
        int[][] graph = {{0,1,1,0},
                {1,0,0,1},
                {1,0,0,1},
                {0,1,1,0}};
        System.out.print("BFS: ");
       graphArray.bfs(graph, 0);
        System.out.println();
        System.out.print("DFS: ");
        graphArray.dfs(graph, 0);

    }
}
