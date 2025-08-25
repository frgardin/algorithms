package com.algorithms.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class leetcode133 {

    public Node cloneGraph(Node node) {
        return cloneGraph(node, new HashMap<>());
    }

    public Node cloneGraph(Node node, HashMap<Integer, Node> visited) {
        if (node == null)
            return null;
        Node newNode = new Node(node.val);
        visited.put(node.val, newNode);
        for (Node v : node.neighbors) {
            if (visited.containsKey(v.val)) {
                newNode.neighbors.add(visited.get(v.val));
                continue;
            }
            newNode.neighbors.add(cloneGraph(v, visited));
        }
        return newNode;
    }

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
