
import java.util.*;
public class Game 
{
	public static char [][] board = new char[4][4];
	private int row;
	private int col;
	private AI ai;
	private int turnsCounter;
	private char winner;
	private char player;
	private char computer;
	public Game(char player, char computer){
		setPlayer(player);
		setComputer(computer);
		resetBoard();
	}
	public void setPlayer(char player){
		this.player = player;
	}
	public void setComputer(char computer){
		this.computer = computer;
	}
	public char getWinner()
	{
		return winner;
	}
	public Location generateComputerMove(){
		while(true)
		{
			//Location computerMove = ai.move();
			//row =computerMove.getX();
			//col = computerMove.getY();
			Random random = new Random();
		 row = random.nextInt(4);
			col = random.nextInt(4);
			if(isFree(row,col))
			{
			board[row][col]=computer;
			break;
			}
		}
		return new Location(row,col);
	}
	public Location play(Location location)
	{
		 row = location.getX();
		 col = location.getY();
		board[row][col]=player;
		
		turnsCounter++;
		return generateComputerMove();
	}
	
	
	
	/* returns -1 when the game is over with no winner,
	 * returns 1 when the game is over and there is a winner,
	 * returns 0 when the game is not over yet.
	 */
	public int isGameOver()
	{
		if(isThereAWinner())
		{
			return 1;
		}
		else if(turnsCounter == 8)
		{
			return -1;
		}
		else
		return 0;
	}
	
	/*resets the game board, emptying all cells*/
	public void resetBoard()
	{
		char[][] clearBoard = new char[4][4];
		for(int i = 0; i<clearBoard.length;i++)
		{
			for(int j = 0; j<clearBoard[0].length;j++)
			{
				clearBoard[i][j] = ' ';
			}
		}
		setBoard(clearBoard);
		turnsCounter = 0;
	}
	
	/*this method checks if there's a winner, and sets the 'winner' variable to it*/
	public boolean isThereAWinner()
	{

		for(int i=0; i<board.length;i++)
		{ 
			if(board[i][0]==board[i][1]
			&& board[i][1]==board[i][2]
			&& board[i][2]==board[i][3]
			&& board[i][0]!=' ')
			{
				//checks for cols
				winner = board[i][0];
			return true;
			}
			if(board[0][i]==board[1][i]
			&& board[1][i]==board[2][i]
			&& board[2][i]==board[3][i]
			&& board[0][i]!=' ')
			{
				//check for cols
				winner = board[0][i];
				return true;
			}	
		}
		if(board[0][0]==board[1][1]
		&& board[1][1]==board[2][2]
		&& board[2][2]==board[3][3]
		&& board[0][0]!=' ')
		{
			winner = board[0][0];
			return true;
		}
		if(board[0][3]==board[1][2]
		&& board[1][2]==board[2][1]
		&& board[2][1]==board[3][0]
		&& board[0][3]!=' '){
			winner = board[0][3];
			return true;
		}
		else return false;
	}
	
	/* checks the cell at the given points, returns true if empty */
	public boolean isFree(int x, int y)
	{
		if(board[x][y]=='x'||board[x][y]=='o')
		{
			return false;
		}
		else
		return true;
	}
	
	public char[][] getBoard() 
	{
		return board;
	}

	public void setBoard(char[][] b)
	{
		board = b;
	}
	public  static void main(String[] args)
	{	
		for(int r = 0;r<4; r++)
		{
			for (int c = 0; c<4; c++)
			{
				board[r][c] = '_';			
			}
		}
	}
}
