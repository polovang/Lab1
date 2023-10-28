package lab6;

public class SinglyLinkedList<E> {
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size;

	public SinglyLinkedList() {
		super();

	}

//
	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public E first() {
		if (isEmpty()) {
			return null;
		} else {
			return head.getData();
		}
	}

	public E last() {
		if (isEmpty()) {
			return null;
		} else {
			return tail.getData();
		}
	}

	public void adFirst(E e) {
		Node<E> newNode = new Node<>(e);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		size++;
	}

	public void addLast(E e) {
		Node<E> newNode = new Node<>(e);
		if (isEmpty()) {
			tail = newNode;
		} else {
			newNode.setNext(tail);
			tail = newNode;
		}
		size++;
	}
	public E removeFirst() {
		
	}
public E removeLast() {
		
	}
}
