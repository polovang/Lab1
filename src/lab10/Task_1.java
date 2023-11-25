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
	    // Định nghĩa ngăn xếp để lưu trữ toán hạng và toán tử
	    Stack<Integer> operandStack = new Stack<>();
	    Stack<Character> operatorStack = new Stack<>();

	    for (int i = 0; i < expression.length(); i++) {
	        char ch = expression.charAt(i);

	        // Bỏ qua khoảng trắng trong biểu thức
	        if (ch == ' ') {
	            continue;
	        }

	        if (Character.isDigit(ch)) {
	            // Nếu là toán hạng, đẩy vào operandStack
	            int operand = 0;
	            while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
	                operand = operand * 10 + Character.getNumericValue(expression.charAt(i));
	                i++;
	            }
	            i--; // Giảm đếm vì vòng lặp for tăng i lên 1
	            operandStack.push(operand);
	        } else if (ch == '(') {
	            // Nếu là dấu "(" đẩy vào operatorStack
	            operatorStack.push(ch);
	        } else if (ch == ')') {
	            // Nếu là dấu ")", xử lý liên tục các toán tử từ đầu operatorStack cho đến khi gặp dấu "("
	            while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
	                int result = applyOperator(operatorStack.pop(), operandStack.pop(), operandStack.pop());
	                operandStack.push(result);
	            }
	            operatorStack.pop(); // Loại bỏ dấu "("
	        } else if (isOperator(ch)) {
	            // Nếu là toán tử, xử lý các toán tử ở đầu operatorStack trước khi đẩy toán tử hiện tại vào operatorStack
	            while (!operatorStack.isEmpty() && getOperatorPrecedence(ch) <= getOperatorPrecedence(operatorStack.peek())) {
	                int result = applyOperator(operatorStack.pop(), operandStack.pop(), operandStack.pop());
	                operandStack.push(result);
	            }
	            operatorStack.push(ch);
	        }
	    }

	    // Xử lý lại các toán tử còn lại trên ngăn xếp
	    while (!operatorStack.isEmpty()) {
	        int result = applyOperator(operatorStack.pop(), operandStack.pop(), operandStack.pop());
	        operandStack.push(result);
	    }

	    // Kết quả cuối cùng là giá trị trên đỉnh operandStack
	    return operandStack.peek();
	}

	private static boolean isOperator(char ch) {
	    return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	}

	private static int getOperatorPrecedence(char operator) {
	    if (operator == '+' || operator == '-') {
	        return 1;
	    } else if (operator == '*' || operator == '/') {
	        return 2;
	    }
	    return 0;
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


	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 3 };
		reserve(array1);
	    System.out.println("Reversed array: "+ Arrays.toString(array1));
        System.out.println(isCorrect("[(){}]"));
        String expression1 = "2 + 3 * 4";
        int result1 = evaluateExpression(expression1);
        System.out.println("Result 1: " + result1);

        String expression2 = "(5 - 2) * (10 + 4)";
        int result2 = evaluateExpression(expression2);
        System.out.println("Result 2: " + result2);

        String expression3 = "10 / 0";
        try {
            int result3 = evaluateExpression(expression3);
            System.out.println("Result 3: " + result3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
		}
}
    
