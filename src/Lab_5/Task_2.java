package Lab_5;

public class Task_2 {
	private static final char EMPTY = ' ';
	private char[][] board;

	public Task_2() {
		board= new char[3][3];
	}
	
	//
	public boolean checkRows() {
		int size=board.length;
		for (int i = 0; i < size; i++) {
			if (board[i][0] != EMPTY && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
				return true;
			}
		}
		return false;
	}

	//
	public boolean checkColum() {
		for (int i = 0; i < board.length; i++) {
			if (board[0][i] != EMPTY && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
				return true;
			}
		}
		return false;
	}

	
	public boolean checkDiagonals() {
		//CheckDiagonals bottom left to top right 
		if(board[0][2]!=EMPTY&&board[0][2]==board[1][1]&&board[0][2]==board[2][0]) 
			return true;
		if(board[0][0]!=EMPTY&&board[0][0]==board[1][1]&&board[0][2]==board[2][2]) 
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Task_2 task_2 = new Task_2();
		task_2.board[0][0] = '0';
		task_2.board[0][1] = 'X';
		task_2.board[0][2] = 'X';
		task_2.board[1][0] = '0';
		task_2.board[1][1] = 'X';
		task_2.board[1][2] = '0';
		task_2.board[2][0] = 'X';
		task_2.board[2][1] = '0';
		task_2.board[2][2] = 'X';
		boolean result = task_2.checkRows();
		boolean result1 = task_2.checkColum();
		Boolean result2 =task_2.checkDiagonals();
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}
}
