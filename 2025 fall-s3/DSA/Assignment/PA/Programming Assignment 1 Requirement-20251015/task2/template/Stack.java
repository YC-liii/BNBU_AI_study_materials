/*Add some comments by yourself.*/
public class Stack {

	private Double[] values;
	private int top;
	public Stack(int size) {
		this.values = new Double[size];
		top = -1;
	}
	public boolean isEmpty() {
		return this.top < 0;
	}
	public boolean isFull() {
		return this.top == this.values.length - 1;
	}
	public Double top() {
		if(top < 0)
			return null;
		return this.values[top];
	}
	public Double push(double x) {
		if(isFull())
			return null;
		this.values[++top] = Double.valueOf(x);
		return top();
	}
	public Double pop() {
		if(top < 0)
			return null;
		return this.values[top --];
	}
	public void displayStack() {
		System.out.print("top -->");
		for(int i = this.top; i >= 0; i --)
			System.out.println("\t|\t " + String.format("%, .4f", this.values[i].doubleValue()) + "\t|");
		System.out.println("\t+-----------------------+");
	}
	
	public static double solvePost(String str) {
		/*YOUR CODE HERE*/
	}
	public static void main(String[] args) {
		/*YOUR CODE HERE*/
	}

}