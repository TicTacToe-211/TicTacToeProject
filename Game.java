
import java.util.*;
public class Game {
	public static  char [][] board = new char[3][3];
	public static int row;
	public static int col;
	public static Scanner scan = new Scanner(System.in);
	public static char turn = 'X';
	public static AI ai;
	public static char[][] getBoard() {
		return board;
	}

	public static void setBoard(char[][] b) {
		board = b;
	}

	public static void main(String[] args){
		
		for(int r = 0;r<3; r++){
			for (int c = 0; c<3; c++){
				board[r][c] = '_';
				
			}
		}
		play();
	}
	
	public static void play(){
		boolean playing = true;
		
		while(playing){
			System.out.println("Please insert row and column\n");
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
		for (int i = 0; i<3; i++ ){
			for (int j = 0; j<3 ; j++){
				System.out.print("| ");
				System.out.print(board[i][j] + " | ");
			}
	    	System.out.println();
		}
	}
	
	public static int gameOver(){

		if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] == 'X'){
			return 0;
		}
		if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] == 'X')
			return 0;
		
		if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] == 'X')
			return 0;
		
		if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] == 'X')
			return 0;
		
		if(board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] == 'X')
			return 0;
		
		if(board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] == 'X')
			return 0;
		
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'X')
			return 0;
		
		if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] == 'X')
			return 0;
		// for player O
		if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] == 'O'){
			return 2;
		}
		if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] == 'O')
			return 2;
		
		if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] == 'O')
			return 2;
		
		if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] == 'O')
			return 2;
		
		if(board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] == 'O')
			return 2;
		
		if(board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] == 'O')
			return 2;
		
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'O')
			return 2;
		
		if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] == 'O')
			return 2;
		int c = 0;
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
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
