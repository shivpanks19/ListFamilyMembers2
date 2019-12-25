package com.example.listfamilymembers;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.listfamilymembers.GraphActivity;
import com.example.listfamilymembers.Person;

import de.blox.graphview.Graph;
import de.blox.graphview.GraphAdapter;
import de.blox.graphview.Node;

import com.example.listfamilymembers.R;
import de.blox.graphview.tree.BuchheimWalkerAlgorithm;
import de.blox.graphview.tree.BuchheimWalkerConfiguration;

public class BuchheimWalkerActivity extends GraphActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_buchheim_walker_orientations, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final BuchheimWalkerConfiguration.Builder builder = new BuchheimWalkerConfiguration.Builder()
                .setSiblingSeparation(100)
                .setLevelSeparation(300)
                .setSubtreeSeparation(300);

        switch (item.getItemId()) {
            case R.id.topToBottom:
                builder.setOrientation(BuchheimWalkerConfiguration.ORIENTATION_TOP_BOTTOM);
                break;
            case R.id.bottomToTop:
                builder.setOrientation(BuchheimWalkerConfiguration.ORIENTATION_BOTTOM_TOP);
                break;
            case R.id.leftToRight:
                builder.setOrientation(BuchheimWalkerConfiguration.ORIENTATION_LEFT_RIGHT);
                break;
            case R.id.rightToLeft:
                builder.setOrientation(BuchheimWalkerConfiguration.ORIENTATION_RIGHT_LEFT);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        adapter.setAlgorithm(new BuchheimWalkerAlgorithm(builder.build()));
        adapter.notifyInvalidated();
        return true;
    }

    @Override
    public Graph createGraph() {
        Person p1 = new Person("pankaj","csdah",5,5,5,"fadgadh");
        Person p2 = new Person("fdg","csdah",5,5,5,"fadgadh");
        Person p3 = new Person("pankhfghdaj","csdah",5,5,5,"fadgadh");
        Person p4 = new Person("pdhhankaj","csdah",5,5,5,"fadgadh");
        Person p5 = new Person("pjfgdjankaj","csdah",5,5,5,"fadgadh");
        Person p6 = new Person("pajfjgnkaj","csdah",5,5,5,"fadgadh");
        Person p7 = new Person("pjfgdjankaj","csdah",5,5,5,"fadgadh");
        Person p8 = new Person("pajfdjnkaj","csdah",5,5,5,"fadgadh");
        Person p9 = new Person("pajfgdjnkaj","csdah",5,5,5,"fadgadh");
        final Graph graph = new Graph();
        final Node node1 = new Node(p1);
        final Node node2 = new Node(p2);
        final Node node3 = new Node(p3);
        final Node node4 = new Node(p4);
        final Node node5 = new Node(p5);
        final Node node6 = new Node(p6);
        final Node node8 = new Node(p7);
        final Node node7 = new Node(p8);
        final Node node9 = new Node(p9);
        final Node node10 = new Node(p9);
        final Node node11 = new Node(p9);
        final Node node12 = new Node(p9);

        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node1, node4);
        graph.addEdge(node2, node5);
        graph.addEdge(node2, node6);
        graph.addEdge(node6, node7);
        graph.addEdge(node6, node8);
        graph.addEdge(node4, node9);
        graph.addEdge(node4, node10);
        graph.addEdge(node4, node11);
        graph.addEdge(node11, node12);

        return graph;
    }

    @Override
    public void setAlgorithm(GraphAdapter adapter) {
        final BuchheimWalkerConfiguration configuration = new BuchheimWalkerConfiguration.Builder()
                .setSiblingSeparation(100)
                .setLevelSeparation(300)
                .setSubtreeSeparation(300)
                .setOrientation(BuchheimWalkerConfiguration.ORIENTATION_TOP_BOTTOM)
                .build();
        adapter.setAlgorithm(new BuchheimWalkerAlgorithm(configuration));
    }
}
