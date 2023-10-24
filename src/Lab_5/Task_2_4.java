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
		for (int i = 0; i < board.length; i++) {

			if (board[0][0] != EMPTY) {
				boolean check = true;

				for (int j = 0; j < board.length; j++) {
					if (i - j == 0) {
						if (board[i][j] != board[0][0]) {
							check = false;
							break;

						}

					}

				}
				if (check) {
					return true;
				}

			}
		}
		for (int i = 0; i < board.length; i++) {

			if (board[0][board.length - 1] != EMPTY) {
				boolean check1 = true;

				for (int j = 0; j < board.length; j++) {
					if (i + j == board.length - 1) {
						if (board[i][j] != board[0][board.length - 1]) {
							check1 = false;
							break;

						}

					}

				}
				if (check1) {
					return true;
				}

			}

		}
		return false;
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