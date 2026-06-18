
public class BST {
	Node root;

	public BST() {
		this.root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void insertNode(int x) {
		root = insertNode(root, x);
	}

	protected Node insertNode(Node root, int x) { //When you change the code, remember to keep the string of the method name "protected Node insertNode("


		if (root == null) { 
			return new Node(x);
		}
		if (x < root.getKey()) 
			root.setLeft(insertNode(root.getLeft(), x));
		else if (x > root.getKey())
			root.setRight(insertNode(root.getRight(), x));
		return root;
	}

	public Node findNode(int x) {
		return findNode(root, x);
	}

	protected Node findNode(Node root, int x) {
		
		if (root == null)
			return null;
		if (x < root.getKey())
			return findNode(root.getLeft(), x);
		if (x > root.getKey())
			return findNode(root.getRight(), x);
		return root;
	}

	public void deleteNode(int x) { //When you change the code, remember to keep the string of the method name "protected Node deleteNode("

		root = deleteNode(root, x);
	}

	protected Node deleteNode(Node root, int x) {
		
		if (root == null)
			return root;
		if (x < root.getKey()) 
			root.setLeft(deleteNode(root.getLeft(), x));
		else if (x > root.getKey()) 
			root.setRight(deleteNode(root.getRight(), x));
		else {
			
			if (root.getLeft() == null) 
				return root.getRight();
			if (root.getRight() == null) 
				return root.getLeft();
			
			root.setkey(minKey(root.getRight()));
			
			root.setRight(deleteNode(root.getRight(), root.getKey()));
		}
		return root;
	}

	public int minKey(Node root) {
		
		while (root.getLeft() != null) {
			root = root.getLeft();
		}
		return root.getKey();
	}
}
