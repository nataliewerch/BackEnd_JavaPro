package homework14.level1.task7;

public class GraphTest {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.add("A", "Б");
        graph.add("A", "В");
        graph.add("A", "Г");
        graph.add("A", "Д");
        graph.add("Б", "В");
        graph.add("Б", "Е");
        graph.add("В", "Ж");
        graph.add("Г", "В");
        graph.add("Г", "З");
        graph.add("Д", "Г");
        graph.add("Д", "И");
        graph.add("Е", "К");
        graph.add("Ж", "З");
        graph.add("Ж", "К");
        graph.add("З", "К");
        graph.add("И", "К");
        graph.print(graph);
    }
}
