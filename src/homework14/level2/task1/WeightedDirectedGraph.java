package homework14.level2.task1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WeightedDirectedGraph {
   private int[][] arrayMatrix;
   private int size;
    private int numVertices;


    public WeightedDirectedGraph(int[][] arrayMatrix) {
        this.arrayMatrix = arrayMatrix;
        this.size = arrayMatrix.length;
        this.numVertices = size;
    }

    public void addEdge(int from, int to, int weight){
        if (from >= 0 && from < size && to >= 0 && to < size){
            arrayMatrix[from][to] = weight;
        }
    }
    public void addVertex() {
        int[][] newMatrix = new int[size+1][size+1];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                newMatrix[i][j] = arrayMatrix[i][j];
            }
        }
        arrayMatrix = newMatrix;
        size++;
        numVertices++;
    }
        public void print(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                System.out.print(arrayMatrix[i][j] + " ");
            }
            System.out.println();
        }
        }

    public void printTopology() {
        ArrayList<Integer> topology = new ArrayList<>();
        int[] inDegree = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arrayMatrix[i][j] != 0) {
                    inDegree[j]++;
                }
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            topology.add(vertex);

            for (int i = 0; i < size; i++) {
                if (arrayMatrix[vertex][i] != 0) {
                    inDegree[i]--;
                    if (inDegree[i] == 0) {
                        queue.add(i);
                    }
                }
            }
        }
        System.out.println("Топологическая сортировка: ");
        for (int i = 0; i < topology.size(); i++) {
            System.out.print(topology.get(i) + " ");
        }
        System.out.println();
    }
}



