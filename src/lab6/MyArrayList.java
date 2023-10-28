package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;

	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int capaity) {
		this.elements = (E[]) new Object[capaity];
	}

	//
	public void growSize() {
		int newCapacity = elements.length * 2;
		E[] newElement = (E[]) new Object[newCapacity];
		for (int i = 0; i < elements.length; i++) {
			newElement[i] = elements[i];
		}
		elements = newElement;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public E get(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException();
		} else {
			return elements[i];
		}
	}

	public E set(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException();
		} else {
			E newA = elements[i];
			elements[i] = e;
			return newA;
		}
	}

	public boolean add(E e) {
		if (size == elements.length) {
			growSize();
		} else {
			elements[size] = e;
			size++;
		}
		return true;
	}

	public void add(int i, E e) throws IndexOutOfBoundsException {
		if (size == elements.length) {
			growSize();
		}
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException();

		} else {
			for (int j = i; j < size - 1; j++) {
				elements[j + 1] = elements[j];

			}
			elements[i] = e;
			size++;
		}
	}

	public E remove(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException();
		} else {
			E newB = elements[i];
			for (int j = i; j < size - 1; j++) {
				elements[j] = elements[j + 1];
			}
			elements[size - 1] = null;
			size--;
			return newB;
		}
	}

	public void clear() {
		size = 0;
	}

	public int lastIndexOf(Object o) {
		for (int i = 0; i < size - 1; i++) {
			if (elements[i].equals(o)) {
				return i;
			}

		}
		return -1;
	}

	public E[] toArray() {
		E[] array = (E[]) new Object[size];
		for (int i = 0; i < size; i++) {
			array[i] = elements[i];
		}
		return array;

	}

//	public MyArraylist<E> clone() {
//
//	}

	public boolean contains(E o) {
		for (int i = 0; i < size - 1; i++) {
			if (elements[i].equals(o) && elements[i] != null) {
				return true;
			}
		}
		return false;
	}

	public int indexOf(E o) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	public boolean remove(E e) {
		int index = indexOf(e);
		if (index != -1) {
			remove(index);
			return true;
		}
		return false;

	}

	public void sort(Comparator<E> c) {
		Arrays.sort(elements, 0, size, c);
	}
	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList<>();

        // Test add and size
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Size: " + list.size()); // Expected output: Size: 3

        // Test get
        System.out.println("Element at index 1: " + list.get(1)); // Expected output: Element at index 1: Banana

        // Test set
        list.set(2, "Grapes");
        System.out.println("Updated element at index 2: " + list.get(2)); // Expected output: Updated element at index 2: Grapes

        // Test add at index
        list.add(0, "Mango");
        System.out.println("Element at index 0 after adding: " + list.get(0)); // Expected output: Element at index 0 after adding: Mango

        // Test remove
        String removedElement = list.remove(1);
        System.out.println("Removed element at index 1: " + removedElement); // Expected output: Removed element at index 1: Banana

        // Test contains
        System.out.println("Contains 'Grapes': " + list.contains("Grapes")); // Expected output: Contains 'Grapes': true

        // Test indexOf
        System.out.println("Index of 'Mango': " + list.indexOf("Mango")); // Expected output: Index of 'Mango': 0

        // Test lastIndexOf
        System.out.println("Last index of 'Mango': " + list.lastIndexOf("Mango")); // Expected output: Last index of 'Mango': 0

        // Test clear and isEmpty
        list.clear();
        System.out.println("Size after clear: " + list.size()); // Expected output: Size after clear: 0
        System.out.println("Is list empty: " + list.isEmpty()); // Expected output: Is list empty: true

        // Test sort
        MyArrayList<Integer> numberList = new MyArrayList<>();
        numberList.add(5);
        numberList.add(2);
        numberList.add(8);

        numberList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: " + Arrays.toString(numberList.toArray())); // Expected output: Sorted list: [2, 5, 8]
		
	}
}
