package lab10;

import java.util.Arrays;
import java.util.Stack;

public class Task_1 {
	public static <E> void reserve(E[] array) {
		Stack<E> stack = new Stack<>();
		for (E e : array) {
			stack.push(e);
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = stack.pop();
		}
	}

	public static boolean isCorrect(String input) {
		Stack<Character> stack = new Stack<>();
		for (char ch : input.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty() || !check(stack.peek(), ch)) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	public static boolean check(char a, char b) {
		if (a == '(' && b == ')')
			return true;
		else if (a == '{' && b == '}')
			return true;
		else if (a == '[' && b == ']')
			return true;
		else
			return false;
	}

	public static int evaluateExpression(String expression) {
		Stack<Integer> operandStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

			// Ignore whitespace
			if (ch == ' ') {
				continue;
			}

			if (Character.isDigit(ch)) {

				int operand = 0;
				while (i < expression.length() && Character.isDigit(ch)) {
					operand = operand * 10 + (ch - '0');
					i++;
					if (i < expression.length()) {
						ch = expression.charAt(i);
					}
				}
				i--;

				operandStack.push(operand);
			} else if (ch == '(') {

				operatorStack.push(ch);
			} else if (ch == ')') {

				while (operatorStack.peek() != '(') {
					int result = applyOperator(operatorStack.pop(), operandStack.pop(), operandStack.pop());
					operandStack.push(result);
				}
				operatorStack.pop();
			} else if (isOperator(ch)) {

				while (!operatorStack.empty() && operatorPrecedence(operatorStack.peek()) >= operatorPrecedence(ch)) {
					int result = applyOperator(operatorStack.pop(), operandStack.pop(), operandStack.pop());
					operandStack.push(result);
				}
				operatorStack.push(ch);
			}
		}

		while (!operatorStack.empty()) {
			int result = applyOperator(operatorStack.pop(), operandStack.pop(), operandStack.pop());
			operandStack.push(result);
		}

		return operandStack.pop();
	}

	private static int applyOperator(char operator, int operand2, int operand1) {
		switch (operator) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			return operand1 / operand2;
		}
		throw new IllegalArgumentException("Invalid operator: " + operator);
	}

	private static boolean isOperator(char ch) {
		return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	}

	private static int operatorPrecedence(char operator) {
		if (operator == '+' || operator == '-') {
			return 1;
		} else if (operator == '*' || operator == '/') {
			return 2;
		}
		return 0;
	}

	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 3 };
		System.out.println("Original array: " + Arrays.toString(array1));
		reserve(array1);
		System.out.println("Reversed array: " + Arrays.toString(array1));

		System.out.println("Is correct: " + isCorrect("[(){}]"));
		String expression = "51 + (54 * (3+2))";
		int result = evaluateExpression(expression);
		System.out.println(expression + " = " + result);
	}
}
