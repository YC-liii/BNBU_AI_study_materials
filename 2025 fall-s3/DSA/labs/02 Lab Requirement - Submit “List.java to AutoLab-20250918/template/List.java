
public class List {
	/*YOUR CODE HERE*/
	
	
	
	public static void main(String[] args) {
		List myList  = new List();
		System.out.println(myList.isEmpty());
		myList.insertNode(0, 1);
		System.out.println("Data of head: " + myList.head.getData());
		myList.displayList();
		myList.insertNode(1, 2);
		myList.displayList();
		myList.insertNode(0, 3);
		myList.displayList();
		myList.insertNode(4, 4);
		myList.displayList();
		myList.insertNode(-4, 5);
		myList.displayList();
		System.out.println(myList.findNode(2).getData());
		myList.removeNode(1);
		myList.displayList();
		myList.removeNode(4);
		myList.displayList();
	}

}
