package test;

import static org.junit.Assert.*;

import org.junit.Test;

import tree.to.list.BiNode;
import tree.to.list.TreeToList;

public class TreeToListTest {

	@Test
	public void test() {
		TreeToList t = new TreeToList();
		
		BiNode root = new BiNode(3);
		root.node1 = new BiNode(2);
		root.node1.node1 = new BiNode(1);
		root.node2 = new BiNode(5);
		root.node2.node1 = new BiNode(4);
		root.node2.node2 = new BiNode(6);
		
		BiNode head = t.find(root);
		int i = 1;
		while (head.node2 != null) {
			assertEquals(head.data, i);
			i++;
			head = head.node2;
		}
		while (head.node2 != null) {
			assertEquals(head.data, i);
			i--;
			head = head.node1;
		}
	}

}
