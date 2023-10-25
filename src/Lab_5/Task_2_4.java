package Lab_5;

public class Task_2_4 {
	private static final char EMPTY = ' ';
	private char[][] board;

	public Task_2_4(int n) {
		board = new char[n][n];
	}

	public boolean checkRow() {
		for (int i = 0; i < board.length; i++) {

			if (board[i][0] != EMPTY) {
				boolean check = true;

				for (int j = 1; j < board.length; j++) {
					if (board[i][0] != board[i][j]) {
						check = false;
						break;

					}
				}
				if (check) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkColumn() {
		for (int i = 0; i < board.length; i++) {

			if (board[0][i] != EMPTY) {
				boolean check = true;

				for (int j = 1; j < board.length; j++) {
					if (board[0][i] != board[j][i]) {
						check = false;
						break;

					}
				}
				if (check) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkDiagonals() {
	    boolean checkLeftDiagonal = true;
	    boolean checkRightDiagonal = true;

	    // Check left diagonal
	    for (int i = 1; i < board.length; i++) {
	        if (board[i][i] != board[0][0] || board[0][0] == EMPTY) {
	            checkLeftDiagonal = false;
	            break;
	        }
	    }

	    // Check right diagonal
	    for (int i = 1; i < board.length; i++) {
	        if (board[i][board.length - 1 - i] != board[0][board.length - 1] || board[0][board.length - 1] == EMPTY) {
	            checkRightDiagonal = false;
	            break;
	        }
	    }

	    return checkLeftDiagonal || checkRightDiagonal;
	}

	public static void main(String[] args) {
		Task_2_4 task_2_4 = new Task_2_4(4);
		task_2_4.board[0][0] = '0';
		task_2_4.board[0][1] = 'X';
		task_2_4.board[0][2] = 'X';
		task_2_4.board[0][3] = 'X';
		task_2_4.board[1][0] = '0';
		task_2_4.board[1][1] = 'X';
		task_2_4.board[1][2] = '0';
		task_2_4.board[1][3] = '0';
		task_2_4.board[2][0] = '0';
		task_2_4.board[2][1] = '0';
		task_2_4.board[2][2] = 'X';
		task_2_4.board[2][3] = 'X';
		task_2_4.board[3][0] = 'X';
		task_2_4.board[3][1] = 'X';
		task_2_4.board[3][2] = 'X';
		task_2_4.board[3][3] = 'X';
		Boolean result = task_2_4.checkRow();
		Boolean result1 = task_2_4.checkColumn();
		Boolean result2 = task_2_4.checkDiagonals();
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);

	}
}