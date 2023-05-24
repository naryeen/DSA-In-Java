public class LinkedList{
	Node head;
	Node tail;
	int size;

	public LinkedList(){
		head = null;
		tail = null;
		size = 0;
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if (size == 0) {
			return true;
		}
		return false;
	}
	// 
	public int first(){
		return head.getElement();
	}
	// 
	public int last(){
		return tail.getElement();
	}

	// 
	public void addFirst(int n){
		Node newest = new Node(n, null);

		if (size == 0) {
			 head = newest;
			 tail = newest;
		}

		else{
			newest.setNext(head);
			head = newest;
		}
		size = size + 1;
	}

	// 
	public void addLast(int n){
		Node newest = new Node(n, null);
		if (size == 0) {
			head = newest;
			tail = newest;
		}
		else{
			tail.setNext(newest);
			tail =newest;
		}
		size += 1;
	}

	// 
	public int removeFirst(){
		int deletedElement = head.getElement();
		if (size == 0) {
			return 0;
		}
		else{
			head = head.getNext();
			size = size -1;
		}
		return deletedElement;
	}



}

class Node{
	private int element;//private variable is accessible within the same class, 
	//but we can access to them with the set and get methods
	private Node next;
	// constructor is used to initialize the object of the class
	public Node(int element, Node next ){
	    this.element = element;
		this.next = next;
	}

	// getElement meyhod with the return value
	public int getElement(){
		return element;
	}

	// getNext() is a method with the returning the integer value 
	public Node getNext(){
		return next;
	}

	// 
	public void setElement(int n){
		element = n;
	}

	// this setNext method used to replace any particular element in the linked list
	public void setNext(Node n){
		next = n;
	}
}