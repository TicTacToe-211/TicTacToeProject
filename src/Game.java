public class Game {
	public static char[][] board = new char[4][4];
	private int turnsCounter;
	private char winner;
	private char player;
	private char computer;
	private AI computerAI;

	public Game(char player, char computer) {
		assert (player == 'x') || (player == 'o');
		assert (computer == 'x') || (computer == 'o');
		this.setPlayer(player);
		this.setComputer(computer);
		this.resetBoard();
		this.computerAI = new AI(this);
	}

	private boolean checkColumnsForWinner(int column) {
		if ((Game.board[0][column] == Game.board[1][column])
				&& (Game.board[1][column] == Game.board[2][column])
				&& (Game.board[2][column] == Game.board[3][column])
				&& (Game.board[0][column] != ' ')) {
			// check for cols
			this.winner = Game.board[0][column];
			return true;
		} else {
			return false;
		}
	}

	private boolean checkNegativeSlopeDiagonalForWinner() {
		if ((Game.board[0][3] == Game.board[1][2])
				&& (Game.board[1][2] == Game.board[2][1])
				&& (Game.board[2][1] == Game.board[3][0])
				&& (Game.board[0][3] != ' ')) {
			this.winner = Game.board[0][3];
			return true;
		} else {
			return false;
		}
	}

	private boolean checkPositiveSlopeDiagonalForWinner() {
		if ((Game.board[0][0] == Game.board[1][1])
				&& (Game.board[1][1] == Game.board[2][2])
				&& (Game.board[2][2] == Game.board[3][3])
				&& (Game.board[0][0] != ' ')) {
			this.winner = Game.board[0][0];
			return true;
		} else {
			return false;
		}
	}

	private boolean checkRowsForWinner(int row) {
		if ((Game.board[row][0] == Game.board[row][1])
				&& (Game.board[row][1] == Game.board[row][2])
				&& (Game.board[row][2] == Game.board[row][3])
				&& (Game.board[row][0] != ' ')) {
			// checks for rows
			this.winner = Game.board[row][0];
			return true;
		} else {
			return false;
		}
	}

	public Location generateComputerMove() {
		Location computerMove = this.computerAI.move(this);
		Game.board[computerMove.getX()][computerMove.getY()] = this.computer;
		return computerMove;
	}

	public char[][] getBoard() {
		return Game.board;
	}

	public char getComputer() {
		return this.computer;
	}

	/*
	 * this method checks if there's a winner, and sets the 'winner' variable to
	 * it
	 */

	public char getPlayer() {
		return this.player;
	}

	public char getWinner() {
		return this.winner;
	}

	/* checks the cell at the given points, returns true if empty */
	public boolean isFree(int row, int col) {
		if ((Game.board[row][col] == 'x') || (Game.board[row][col] == 'o')) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * returns -1 when the game is over with no winner, returns 1 when the game
	 * is over and there is a winner, returns 0 when the game is not over yet.
	 */
	public int isGameOver() {
		if (this.isThereAWinner()) {
			return 1;
		} else if (this.turnsCounter == 8) {
			return -1;
		} else {
			return 0;
		}
	}

	private boolean isThereAWinner() {

		for (int iterator = 0; iterator < Game.board.length; iterator++) {
			if (this.checkRowsForWinner(iterator)) {
				return true;
			} else if (this.checkColumnsForWinner(iterator)) {
				return true;
			}
		}
		if (this.checkPositiveSlopeDiagonalForWinner()) {
			return true;
		} else if (this.checkNegativeSlopeDiagonalForWinner()) {
			return true;
		} else {
			return false;
		}
	}

	public Location play(Location location) {
		assert location != null;
		int row = location.getX();
		int col = location.getY();
		Game.board[row][col] = this.player;

		this.turnsCounter++;
		if (this.turnsCounter == 8) {
			return null;
		}
		return this.generateComputerMove();
	}

	/* resets the game board, emptying all cells */
	public void resetBoard() {
		char[][] clearBoard = new char[4][4];
		for (int i = 0; i < clearBoard.length; i++) {
			for (int j = 0; j < clearBoard[0].length; j++) {
				clearBoard[i][j] = ' ';
			}
		}
		this.setBoard(clearBoard);
		this.turnsCounter = 0;
	}

	public void setBoard(char[][] b) {
		Game.board = b;
	}

	public void setComputer(char computer) {
		assert (computer == 'o') || (computer == 'x');
		this.computer = computer;
	}

	public void setPlayer(char player) {
		assert (player == 'x') || (player == 'o');
		this.player = player;
	}
}
