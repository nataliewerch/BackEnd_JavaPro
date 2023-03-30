package homework14.level1.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Graph {
    Map<String, List<Edge>> nodes = new TreeMap<>();
    public class Node {
        private int value;
        private List<Edge> edges;
    }
    public class Edge {
        private String from;
        private String to;

        public Edge(String from, String to) {
            this.from = from;
            this.to = to;

        }
    }

    public void add(String from, String  to) {
        List<Edge> connectedNodes = nodes.get(from);
        if (connectedNodes == null) {
            connectedNodes = new ArrayList<>();
            nodes.put(from, connectedNodes);
        }
        connectedNodes.add(new Edge(from, to));
    }

    public void print(Graph graph){
        for (Map.Entry<String, List<Edge>> entry : nodes.entrySet()) {
            String node = entry.getKey();
            List<Edge> edges = entry.getValue();
            System.out.print(node + " -> ");
            for (Edge edge : edges) {
                System.out.print(edge.to + " ");
            }
            System.out.println();
        }

    }

}
