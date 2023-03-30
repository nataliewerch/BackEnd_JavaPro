package homework14.level2.task1;

public class WeightedDirectedGraphTest {
    public static void main(String[] args) {
        WeightedDirectedGraph graph = new WeightedDirectedGraph(new int[10][10]);
        graph.addEdge(1, 4, 0);
        graph.addEdge(3, 5, 1);
        graph.addEdge(6, 2, 0);
        graph.addEdge(2, 4, 1);
        graph.addEdge(7, 4, 1);
        graph.addEdge(4, 8, 1);
        graph.addEdge(9, 8, 0);
        graph.addEdge(8, 2, 1);
        graph.addEdge(5, 2, 1);
        graph.addVertex();
        graph.addVertex();
        graph.print();
        graph.printTopology();

    }
}
