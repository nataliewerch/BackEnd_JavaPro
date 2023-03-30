package homework14.level2.task2;

import java.util.*;

public class WaysGraph {
    Map<String, List<String>> graph = new TreeMap<>();
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void add(String from, List<String> neighbor) {
        if (!graph.containsKey(from)) {
            graph.put(from, new ArrayList<>());
        }
        graph.get(from).addAll(neighbor);
    }

    public void findWays(String from, String end, List<String> ways) {
        if (from.equals(end)) {
            count++;
            System.out.println(ways + "->" + from);
            return;
        }
        ways.add(from);
        for (String neighbor : graph.get(from)) {
            if (!ways.contains(neighbor)) {
                findWays(neighbor, end, new ArrayList<>(ways));
            }
        }
        ways.remove(ways.size() - 1);
    }
}


