package homework16.level1.task8;

public class GraphGenericTest {
    public static void main(String[] args) {
        GraphGeneric<String> graph = new GraphGeneric<>();
        graph.add("A", "B");
        graph.add("A", "C");
        graph.add("B", "C");
        graph.add("B", "D");
        graph.print();

    }
}
