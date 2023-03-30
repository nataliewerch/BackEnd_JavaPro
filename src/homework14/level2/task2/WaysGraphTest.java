package homework14.level2.task2;

import homework14.level1.task7.Graph;

import java.util.*;

public class WaysGraphTest {
    public static void main(String[] args) {
        WaysGraph graph = new WaysGraph();
        graph.add("А", Arrays.asList("Б", "В"));
        graph.add("Б", Arrays.asList("Г", "Е"));
        graph.add("В", Arrays.asList("Г", "Д"));
        graph.add("Г", Arrays.asList("Д", "Ж"));
        graph.add("Д", Arrays.asList("Ж"));
        graph.add("Е", Arrays.asList("Г", "Ж"));

        graph.findWays("А", "Ж", new ArrayList<>());
        System.out.println("Количество различных путей от города А до города Ж: " + graph.getCount());
    }

}
