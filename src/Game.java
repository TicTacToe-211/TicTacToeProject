
import java.util.*;
public class Game {
	private static  char [][] board = new char[4][4];
	private static int row;
	private static int col;
	private static Scanner scan = new Scanner(System.in);
	private static char turn = 'X';
	private static AI ai;
	
	public Game(){
		for(int i = 0; i<board.length;i++){
			for(int j = 0; j<board[0].length;j++){
				board[i][j] = ' ';
			}
		}
	}
	public Location play(Location location){
		int x = location.getX();
		int y = location.getY();
		board[x][y]='x';
		while(true){
			Random random = new Random();
			 x = random.nextInt(4);
			y = random.nextInt(4);
			if(cellIsEmpty(x,y)){
			board[x][y]='o';
			break;
			}
		}
		return new Location(x,y);
	}
	public boolean cellIsEmpty(int x, int y){
		if(board[x][y]=='x'||board[x][y]=='o'){
			return false;
		}
		else
		return true;
	}
	public static char[][] getBoard() {
		return board;
	}

	public static void setBoard(char[][] b) {
		board = b;
	}

	
	
	public static void main(String[] args){
		
		for(int r = 0;r<4; r++){
			for (int c = 0; c<4; c++){
				board[r][c] = '_';
				
			}
		}
		play();
	}
	
	public static void play(){
		boolean playing = true;
		
		while(playing){
			System.out.println("Please insert row and column\n "
					+ "the number should be less than 4");
			System.out.print("Row: ");
			row = scan.nextInt() - 1;
			
			System.out.print("Column: ");
			col = scan.nextInt() - 1;
			turn = 'X';
			if(isFree(row,col)){
				board[row][col] = 'X';
			}
			else
			{
				System.err.println("Cell taken");
				System.out.print("Row: ");
				row = scan.nextInt() - 1;
				System.out.print("Column: ");
				col = scan.nextInt() - 1;
			    board[row][col] = 'X';
			}
			if(gameOver()==0){
				playing = false;
				printBoard();
				System.out.println("Game Over, player "+ "X"+ " wins!");
				System.exit(0);
			}
			AI.firstMove();
			printBoard();
			turn = 'O';
			
			if(gameOver() == 2){
				playing = false;
				System.out.println("Game Over, player "+ "O"+ " wins!");
				System.exit(0);
			}
			if(gameOver() == -1){
				System.out.println("Tie!!");
				System.exit(0);
			}
			
			}
			
	}
	
	public static void printBoard(){
		for (int i = 0; i<4; i++ ){
			for (int j = 0; j<4 ; j++){
				System.out.print("| ");
				System.out.print(board[i][j] + " | ");
			}
	    	System.out.println();
		}
	}
	
	public static int gameOver(){

		if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] == board[3][0]&& board[0][0]=='X'){
			return 0;
		}
		if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] ==board[3][1] && board[0][1]== 'X')
			return 0;
		
		if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] ==board[3][2] && board[0][2]=='X')
			return 0;
		
		if(board[0][3] == board[1][3] && board[1][3] == board[2][3] && board[2][3] ==board[3][3] && board[0][3]=='X')
			return 0;
		
		if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] ==board[0][3] && board[0][0]=='X')
			return 0;
		
		if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] ==board[1][3] && board[1][0]=='X')
			return 0;
		
		if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] ==board[2][3] && board[2][0]=='X')
			return 0;
		
		if(board[3][0] == board[3][1] && board[3][1] == board[3][2] && board[3][2] ==board[3][3] && board[3][0]=='X')
			return 0;
		
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] ==board[3][3] && board[0][0]=='X')
			return 0;
		
		if(board[0][3] == board[1][2] && board[1][2] == board[2][1] && board[2][1] ==board[3][0] && board[0][3]=='X')
			return 0;
	// for player O 
		if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] == board[3][0]&& board[0][0]=='O'){
			return 0;
		}
		if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] ==board[3][1] && board[0][1]== 'O')
			return 0;
		
		if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] ==board[3][2] && board[0][2]=='O')
			return 0;
		
		if(board[0][3] == board[1][3] && board[1][3] == board[2][3] && board[2][3] ==board[3][3] && board[0][3]=='O')
			return 0;
		
		if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] ==board[0][3] && board[0][0]=='O')
		
		if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] ==board[1][1] && board[1][0]=='O')
			return 0;
		
		if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] ==board[2][3] && board[2][0]=='O')
			return 0;
		
		if(board[3][0] == board[3][1] && board[3][1] == board[3][2] && board[3][2] ==board[3][3] && board[3][0]=='O')
			return 0;
		
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] ==board[3][3] && board[0][0]=='O')
			return 0;
		
		if(board[0][3] == board[1][2] && board[1][2] == board[2][1] && board[2][1] ==board[3][0] && board[0][3]=='O')
			return 0;
		int c = 0;
		for(int i = 0; i<4; i++){
			for(int j = 0; j<4; j++){
				if(board[i][j] != '_'){
					c++;
				}
			}
		}
		 if(c == 9)
			 return -1;
		return 1;
	}
	
	public static boolean isFree(int r, int c){
		if(board[r][c] == '_')
			return true;
		else
			return false;
	}
}
