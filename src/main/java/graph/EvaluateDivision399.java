package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class EvaluateDivision399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] res = new double[queries.size()];
        Map<String, Map<String, Double>> graph = new HashMap<>();
        buildGraph(graph, equations, values);
        for (int i = 0; i < queries.size(); ++i)
            res[i] = calculateQuries(graph, queries.get(i).get(0), queries.get(i).get(1), new HashSet<String>());
        return res;
    }

    private double calculateQuries(Map<String, Map<String, Double>> graph, String start, String end, HashSet<String> visited) {
        if (!graph.containsKey(start))
            return -1.0;
        if (graph.get(start).containsKey(end))
            return graph.get(start).get(end);
        visited.add(start);
        for (Map.Entry<String, Double> es : graph.get(start).entrySet()) {
            if (!visited.contains(es.getKey())) {
                double res = calculateQuries(graph, es.getKey(), end, visited);
                if (res != -1.0) {
                    return graph.get(start).get(es.getKey()) * res;
                }
            }
        }
        return -1.0;
    }

    private void buildGraph(Map<String, Map<String, Double>> graph, List<List<String>> equations, double[] values) {
        String u, v;
        for (int i = 0; i < equations.size(); ++i) {
            List<String> edge = equations.get(i);
            u = edge.get(0);
            v = edge.get(1);
            if (!graph.containsKey(u)) {
                graph.put(u, new HashMap<>());
            }
            graph.get(u).put(v, values[i]);
            if (!graph.containsKey(v)) {
                graph.put(v, new HashMap<>());
            }
            graph.get(v).put(u, 1 / values[i]);

        }
    }
}
