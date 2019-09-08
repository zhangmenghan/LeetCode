package com.simple;

import com.utils.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S_429 {
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null) {
			return result;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> level = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				Node currentNode = queue.poll();
				if (currentNode != null) {
					level.add(currentNode.val);
					for (Node child : currentNode.children) {
						queue.offer(child);
					}
				}
			}
			result.add(level);
		}
		return result;
	}
}
