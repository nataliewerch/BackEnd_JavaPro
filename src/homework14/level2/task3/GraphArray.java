package homework14.level2.task3;

import java.util.*;

public class GraphArray {
    int[][] graph;

    public GraphArray() {
    }

    public static void bfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int i = 0; i < graph[node].length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void dfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<Integer>();
        visited[start] = true;
        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.print(node + " ");
            for (int i = graph[node].length - 1; i >= 0; i--) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }
    }


