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
			tail = newNode;
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
			head = newNode;
		} else {
			newNode.setNext(tail);
			tail = newNode;
		}
		size++;
	}

	public E removeFirst() {
		if (isEmpty()) {
			return null;
		}
		E removeElements = head.getData();
		head = head.getNext();
		size--;
		if (isEmpty()) {
			tail = null;
		}
		return removeElements;
	}

	public E removeLast() {
		E removeElement;
		if (isEmpty()) {
			return null;
		} else if (head == tail) {
			removeElement = head.getData();
			head = null;
			tail = null;
		} else {
			Node<E> checkElement = head;

			while (checkElement.getNext() != null) {

				checkElement = checkElement.getNext();
			}

			removeElement = tail.getData();
			tail = checkElement;

			size--;
           if(isEmpty()) {
        	   head=null;
           }
		}
		
		return removeElement;

	}

	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.adFirst(2);
		list.adFirst(1);
		list.addLast(6);
		list.addLast(5);
		System.out.println("First Element:" + list.first());
		System.out.println("Last Element:" + list.last());
		System.out.println("Size:" + list.size());
		System.out.println("RemovedFirst Element:" + list.removeFirst());
		System.out.println("RemovedLast Element:" + list.removeLast());
		System.out.println("Size after remove:" + list.size());

	}
}
