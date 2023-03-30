package homework16.level1.task8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GraphGeneric<T> {
        Map<T, List<GraphGeneric.Edge>> nodes = new TreeMap<>();

        public class Node {
            private T value;
            private List<GraphGeneric.Edge> edges;
        }
        public class Edge {
            private T from;
            private T to;

            public Edge(T from, T to) {
                this.from = from;
                this.to = to;

            }
        }

        public void add(T from, T  to) {
            List<GraphGeneric.Edge> connectedNodes = nodes.get(from);
            if (connectedNodes == null) {
                connectedNodes = new ArrayList<>();
                nodes.put(from, connectedNodes);
            }
            connectedNodes.add(new GraphGeneric.Edge(from, to));
        }

        public void print(){
            for (Map.Entry<T, List<GraphGeneric.Edge>> entry : nodes.entrySet()) {
                T node = entry.getKey();
                List<GraphGeneric.Edge> edges = entry.getValue();
                System.out.print(node + " -> ");
                for (GraphGeneric.Edge edge : edges) {
                    System.out.print(edge.to + " ");
                }
                System.out.println();
            }

        }

    }


