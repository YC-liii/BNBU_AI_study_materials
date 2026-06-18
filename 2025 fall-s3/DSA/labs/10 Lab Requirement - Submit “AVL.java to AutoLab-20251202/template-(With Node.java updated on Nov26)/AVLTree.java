public class AVLTree extends BST{
	Node root;

	public AVLTree() {
		super();
	}


	public Node insertNode(Node root, int x) {
		/**
		 * insertNode inserts a key "x" into a subtree whose root is "root" 
		 * input:	root - the root of the subtree
		 * 			x - the key to be inserted
		 * output: the (updated) root of the subtree
		 */
		root = super.insertNode(root, x);
		/*YOUR CODE HERE*/
		return root;
	}

	public Node deleteNode(Node root, int x) {
		/**
		 * deleteNode deletes the node whose key is "x" from a subtree whose root is "root"
		 * input: 	root - the root of the subtree 
		 * 			x - the key of the node to be deleted
		 * output: the (updated) root of the subtree
		 */
		root = super.deleteNode(root, x);
		/*YOUR CODE HERE*/
		return root;
	}

	
	public static void main(String[] args) {
		AVLTree avl = new AVLTree();
		System.out.println("The initial tree is empty:");
		BinaryTreePrinter.printTree(avl);

		System.out.println("After inserting 10, 5:");
		avl.insertNode(10);
		avl.insertNode(5);
		BinaryTreePrinter.printTree(avl);

		System.out.println("\nAfter inserting 3: (case 1)");
		avl.insertNode(3);
		BinaryTreePrinter.printTree(avl);

		System.out.println("\nAfter inserting 13, 18: (case 4)");
		avl.insertNode(13);
		avl.insertNode(18);
		BinaryTreePrinter.printTree(avl);

		System.out.println("\nAfter inserting 12: (case 3)");
		avl.insertNode(12);
		BinaryTreePrinter.printTree(avl);
		System.out.println("\nAfter inserting 4: (case 2)");
		avl.insertNode(4);
		BinaryTreePrinter.printTree(avl);
		
		System.out.println("\nAfter inserting 11, 22, 16:");
		avl.insertNode(11);
		avl.insertNode(22);
		avl.insertNode(16);
		BinaryTreePrinter.printTree(avl);
		
		System.out.println("\nAfter inserting 20: (case 4)");
		avl.insertNode(20);
		BinaryTreePrinter.printTree(avl);

		System.out.println("\nAfter inserting 8:");
		avl.insertNode(8);
		BinaryTreePrinter.printTree(avl);

		System.out.println("\nSearching for 10, 5, 13, 18, 21:");
		System.out.println(avl.findNode(10) != null && avl.findNode(10).getKey() == 10 ? "true" : "false");
		System.out.println(avl.findNode(5) != null && avl.findNode(5).getKey() == 5 ? "true" : "false");
		System.out.println(avl.findNode(13) != null && avl.findNode(13).getKey() == 13 ? "true" : "false");
		System.out.println(avl.findNode(18) != null && avl.findNode(18).getKey() == 18 ? "true" : "false");
		System.out.println(avl.findNode(21) == null ? "true" : "false");

		System.out.println("\nAfter deleting 16 (case 3, case 1):");
		avl.deleteNode(16);
		BinaryTreePrinter.printTree(avl);
		
		System.out.println("\nAfter deleting 3 (case 4):");
		avl.deleteNode(3);
		BinaryTreePrinter.printTree(avl);
		
		System.out.println("\nAfter deleting 5, 8 (case 4):");
		avl.deleteNode(5);
		avl.deleteNode(8);
		BinaryTreePrinter.printTree(avl);
		
		System.out.println("\nAfter deleting 20, 18 (case 2):");
		avl.deleteNode(20);
		avl.deleteNode(18);
		BinaryTreePrinter.printTree(avl);
	}
}
