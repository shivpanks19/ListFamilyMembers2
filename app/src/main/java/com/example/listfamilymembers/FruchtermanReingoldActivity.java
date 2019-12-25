package com.example.listfamilymembers;

import com.example.listfamilymembers.GraphActivity;

import de.blox.graphview.Graph;
import de.blox.graphview.GraphAdapter;
import de.blox.graphview.Node;
import de.blox.graphview.energy.FruchtermanReingoldAlgorithm;


public class FruchtermanReingoldActivity extends GraphActivity {

    @Override
    public Graph createGraph() {
        final Graph graph = new Graph();
        final Node a = new Node(getNodeText());
        final Node b = new Node(getNodeText());
        final Node c = new Node(getNodeText());
        final Node d = new Node(getNodeText());
        final Node e = new Node(getNodeText());
        final Node f = new Node(getNodeText());
        final Node g = new Node(getNodeText());
        final Node h = new Node(getNodeText());

        graph.addEdge(a, b);
        graph.addEdge(a, c);
        graph.addEdge(a, d);
        graph.addEdge(c, e);
        graph.addEdge(d, f);
        graph.addEdge(f, c);
        graph.addEdge(g, c);
        graph.addEdge(h, g);

        return graph;
    }

    @Override
    public void setAlgorithm(GraphAdapter adapter) {
        adapter.setAlgorithm(new FruchtermanReingoldAlgorithm(1000));
    }
}
