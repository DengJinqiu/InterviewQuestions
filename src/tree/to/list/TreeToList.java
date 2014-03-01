package tree.to.list;

public class TreeToList {

	public BiNode find(BiNode root) {
		BiNode res = lrNode(root);
		res.node1 = null;
		return res;
	}

	private BiNode lrNode(BiNode root) {
		if (root == null) {
			return null;
		}
		BiNode res = root;
		BiNode l = lrNode(root.node1);
		BiNode r = lrNode(root.node2);
		if (l != null) {
			l.node1.node2 = root;
			root.node1 = l.node1;
			res = l;
		}
		if (r != null) {
			r.node1 = root;
			root.node2 = r;
			res.node1 = r.node2;
		} else {
			res.node1 = root;
		}
		return res;
	}
}
