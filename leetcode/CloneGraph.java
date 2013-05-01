import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CloneGraph {

	Graph clone(Graph graph) {
		if (graph == null)
			return null;
		Map<Graph, Graph> map = new HashMap<Graph, Graph>();
		Graph graphClone = new Graph();
		map.put(graph, graphClone);
		Queue<Graph> queue = new LinkedList<Graph>();
		queue.offer(graph);

		while (!queue.isEmpty()) {
			Graph node = queue.poll();
			int n = node.neighbors.size();
			for (int i = 0; i < n; i++) {
				Graph neighbor = node.neighbors.get(i);
				if (!map.containsKey(neighbor)) {
					Graph p = new Graph();
					map.get(node).neighbors.add(p);
					map.put(neighbor, p);
				} else {
					map.get(node).neighbors.add(map.get(neighbor));
				}
			}
		}
		return graphClone;
	}

	Graph RClone(Graph graph, Map<Graph, Graph> map) {
		if (graph == null)
			return graph;
		if (map.containsKey(graph))
			return map.get(graph);

		Graph p = new Graph();
		map.put(graph, p);

		for (int i = 0; i <= graph.neighbors.size(); i++) {
			Graph node = RClone(graph.neighbors.get(i), map);
			p.neighbors.add(node);
		}

		return p;
	}

}

class Graph {

	public List<Graph> neighbors;
}