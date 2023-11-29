package lab10;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task_2 {
	public static <E> void stutter(Queue<E> input) {
		int size = input.size();
		for (int i = 0; i < size; i++) {
			E e = input.poll();
			input.offer(e);
			input.offer(e);
		}
	}

	public static <E> void mirror(Queue<E> input) {
		Stack<E> stack = new Stack<>();
		for (E element : input) {
			stack.push(element);
		}
		while (!stack.isEmpty()) {
			input.add(stack.pop());
		}
	}

	public static void main(String[] args) {
		Queue<Integer> re = new LinkedList<>();
		re.offer(1);
		re.offer(2);
		re.offer(3);
		stutter(re);
		System.out.println(re);
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		mirror(queue);
		System.out.println("Queue after mirror: " + queue);
	}
}
