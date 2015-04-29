import java.util.Random;

public class AI {
	private Game game;
	// Add a board and create set method to set this board to Game board
	private char[][] board;
	Location checkedLocation = new Location();

	public AI(Game game) {
		assert game != null;
		this.game = game;
	}

	// checks columns for proper move.
	private Location checkColumns(int iterator) {
		this.checkedLocation = this.checkSidesOfColumns(iterator);
		if (this.checkedLocation != null) {
			return this.checkedLocation;
		} else {
			this.checkedLocation = this.checkMiddlesOfColumns(iterator);
		}
		if (this.checkedLocation != null) {
			return this.checkedLocation;
		} else {
			return null;
		}

	}

	// this method check the diagonals for a proper move;
	private Location checkDiagonals() {
		Location diagonalBlock;
		diagonalBlock = this.checkPositiveSlopeDiagonal();
		if (diagonalBlock != null) {
			return diagonalBlock;
		}
		diagonalBlock = this.checkNegativeSlopeDiagonal();
		if (diagonalBlock != null) {
			return diagonalBlock;
		} else {
			return null;
		}

	}

	// Check the two cells in the middle of each column;
	private Location checkMiddlesOfColumns(int iterator) {

		if ((this.board[0][iterator] != ' ')
				&& (this.board[0][iterator] == this.board[2][iterator])
				&& (this.board[2][iterator] == this.board[3][iterator])
				&& this.game.isFree(1, iterator)) {
			return new Location(1, iterator);
		} else if ((this.board[0][iterator] != ' ')
				&& (this.board[0][iterator] == this.board[1][iterator])
				&& (this.board[1][iterator] == this.board[3][iterator])
				&& this.game.isFree(2, iterator)) {
			return new Location(2, iterator);
		} else {
			return null;
		}
	}

	// check middle cells of each row
	private Location checkMiddlesOfRows(int iterator) {
		if ((this.board[iterator][0] != ' ')
				&& (this.board[iterator][0] == this.board[iterator][1])
				&& (this.board[iterator][1] == this.board[iterator][3])
				&& this.game.isFree(iterator, 2)) {
			return new Location(iterator, 2);
		} else if ((this.board[iterator][0] != ' ')
				&& (this.board[iterator][0] == this.board[iterator][2])
				&& (this.board[iterator][2] == this.board[iterator][3])
				&& this.game.isFree(iterator, 1)) {
			return new Location(iterator, 1);
		} else {
			return null;
		}
	}

	private Location checkNegativeSlopeDiagonal() {
		if ((this.board[3][0] == this.board[2][1])
				&& (this.board[2][1] == this.board[1][2])
				&& this.game.isFree(0, 3)) {
			return new Location(0, 3);
		} else if ((this.board[0][3] == this.board[2][1])
				&& (this.board[2][1] == this.board[1][2])
				&& this.game.isFree(3, 0)) {
			return new Location(3, 0);
		} else if ((this.board[3][0] == this.board[1][2])
				&& (this.board[1][2] == this.board[0][3])
				&& this.game.isFree(2, 1)) {
			return new Location(2, 1);
		} else if ((this.board[3][0] == this.board[2][1])
				&& (this.board[2][1] == this.board[0][3])
				&& this.game.isFree(1, 2)) {
			return new Location(1, 2);
		} else {
			return null;
		}
	}

	private Location checkPositiveSlopeDiagonal() {
		if ((this.board[0][0] == this.board[1][1])
				&& (this.board[1][1] == this.board[2][2])
				&& this.game.isFree(3, 3)) {
			return new Location(3, 3);
		} else if ((this.board[1][1] == this.board[2][2])
				&& (this.board[2][2] == this.board[3][3])
				&& this.game.isFree(0, 0)) {
			return new Location(3, 3);
		} else if ((this.board[0][0] == this.board[2][2])
				&& (this.board[2][2] == this.board[3][3])
				&& this.game.isFree(1, 1)) {
			return new Location(1, 1);
		} else if ((this.board[0][0] == this.board[1][1])
				&& (this.board[1][1] == this.board[3][3])
				&& this.game.isFree(2, 2)) {
			return new Location(2, 2);
		} else {
			return null;
		}
	}

	// checks the rows for proper move;
	private Location checkRows(int iterator) {
		this.checkedLocation = this.checkSidesOfRows(iterator);
		if (this.checkedLocation != null) {
			return this.checkedLocation;
		} else {
			this.checkedLocation = this.checkMiddlesOfRows(iterator);
		}
		if (this.checkedLocation != null) {
			return this.checkedLocation;
		} else {
			return null;
		}

	}

	// check the two cells on the top and bottom of each column;
	private Location checkSidesOfColumns(int iterator) {
		if ((this.board[0][iterator] != ' ')
				&& (this.board[0][iterator] == this.board[1][iterator])
				&& (this.board[1][iterator] == this.board[2][iterator])
				&& this.game.isFree(3, iterator)) {
			return new Location(3, iterator);
		} else if ((this.board[1][iterator] != ' ')
				&& (this.board[1][iterator] == this.board[2][iterator])
				&& (this.board[2][iterator] == this.board[3][iterator])
				&& this.game.isFree(0, iterator)) {
			return new Location(0, iterator);
		} else {
			return null;
		}
	}

	// checks for the two sides of the row;
	private Location checkSidesOfRows(int iterator) {
		if ((this.board[iterator][0] != ' ')
				&& (this.board[iterator][0] == this.board[iterator][1])
				&& (this.board[iterator][1] == this.board[iterator][2])
				&& this.game.isFree(iterator, 3)) {
			return new Location(iterator, 3);
		} else if ((this.board[iterator][1] != ' ')
				&& (this.board[iterator][1] == this.board[iterator][2])
				&& (this.board[iterator][2] == this.board[iterator][3])
				&& this.game.isFree(iterator, 0)) {
			return new Location(iterator, 0);
		} else {
			return null;
		}
	}

	// called when all algorithems fail to produce a proper move;
	private Location generateRandomLocation() {
		int row, col;
		do {

			Random random = new Random();
			row = random.nextInt(4);
			col = random.nextInt(4);
		} while (!this.game.isFree(row, col));
		return new Location(row, col);
	}

	// calculates the move for the computer.
	public Location move(Game game) {
		assert game != null;
		this.board = game.getBoard();
		if (this.board == null) {
			throw new IllegalArgumentException();
		}
		Location computerMove;
		for (int iterator = 0; iterator < this.board.length; iterator++) {
			computerMove = this.checkRows(iterator);
			if (computerMove != null) {
				return computerMove;
			}
			computerMove = this.checkColumns(iterator);
			if (computerMove != null) {
				return computerMove;
			}
		}

		computerMove = this.checkDiagonals();
		if (computerMove != null) {
			return computerMove;
		}
		return this.generateRandomLocation();
	}

}
