public class Node{
	private double x;
	private Node next;
	public Node(double x) {
		this.x = x;
		this.next = null;
	}
	public double getData() {
		return x;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}