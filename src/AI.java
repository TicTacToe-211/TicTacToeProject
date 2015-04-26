
public class AI {
	private Game game;
	//Add a board and create set method to set this board to Game board
	private char [][] board;
	public void move(){
		board = game.getBoard();
		if(block()){
			
		}
	else{
		if(game.isFree(0,0)){
			board[0][0] = 'o';
		}
		else if(game.isFree(0, 3)){
			board[0][3] = 'o';
		}
		else if(game.isFree(3, 3))
			board[3][3] = 'o';
		else if(game.isFree(3, 0))
			board[3][0] = 'o';
		else if(game.isFree(1,1)){
				board[1][1] = 'o';
			}
			else{
				if(game.isFree(1, 0))
					board[1][0] = 'o';
				else if(game.isFree(1, 3)){
					board[1][3] = 'o';
				}
				else if(game.isFree(0, 1))
					board[0][1] = 'o';
				else if (game.isFree(3,1)){
					board[3][1] = 'o';
				}
			}
		}
		game.setBoard(board);
	}
	//turned method into private because it's not accessed by other classes
	private boolean block(){
		//first row
		if(board[0][0] == 'o'||board[0][1] == 'o'||board[0][2] == 'o' || board[0][3] == 'o'){
			return false;
		}
		else{
			if(board[0][0] == board[0][1] && board[0][1]== board[0][2] && board[0][2] == 'x'){
				if(game.isFree(0, 3)){
				board[0][3] = 'o';
				return true;
				}
			}
			if(board[0][0] == board[0][2] && board[0][0]==board[0][3] && board[0][0] =='x'){
				if(game.isFree(0 ,1)){
					board[0][1] = 'o';
					return true;
					}
			}
			if(board[0][2] == board[0][1] && board[0][2] == board[0][3] && board[0][2]=='x'){
				if(game.isFree(0, 0)){
					board[0][0] = 'o';
					return true;
					}
			}
			if(board[0][0]==board[0][1] && board[0][1] == board[0][3] && board[0][0] == 'x'){
				if(game.isFree(0, 2)){
					board[0][2] = 'o';
					return true;
				}
			}
		}
		
		//Second row	
		if(board[1][0] == 'o' ||board[1][1] == 'o'||board[1][2] == 'o' || board[1][3] == 'o'){
			return false;
		}
		else{
			if(board[1][0] == board[1][1] && board[1][1]==board[1][3] && board[1][0] == 'x'){
				if(game.isFree(1,2)){
					board[1][2] = 'o';
					return true;
					}
			}
			if(board[1][0] == board[1][2] && board[1][0]==board[1][3] && board[1][0] == 'x'){
				if(game.isFree(1, 1)){
					board[1][1] = 'o';
					return true;
					}
			}
			if(board[1][2] == board[1][1] && board[1][2] == board[1][3] && board[1][2] == 'x'){
				if(game.isFree(1,0)){
					board[1][0] = 'o';
					return true;
					}
			}
			if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] == 'x'){
				if(game.isFree(1,3)){
					board[1][3] = 'o';
					return true;
					}
			}
		}
		
		//third row
		if(board[2][0] == 'o' ||board[2][1] == 'o'||board[2][2] == 'o'||board[2][3] == 'o'){
			return false;
		}
		else{
			if(board[2][0] == board[2][1] && board[2][1]==board[2][3] && board[2][0] == 'x') {
				if(game.isFree(2,2)){
					board[2][2] = 'o';
					return true;
					}
			}
			if(board[2][0] == board[2][2] && board[2][0]==board[2][3] && board[2][3] == 'x'){
				if(game.isFree(2, 1)){
					board[2][1] = 'o';
					return true;
				}
			}
			if(board[2][2] == board[2][1] && board[2][2] == board[2][3] && board[2][3] == 'x'){
				if(game.isFree(2, 0)){
					board[2][0] = 'o';
				return true;
				}
			}
			if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] == 'x'){
				if(game.isFree(2, 3)){
					board[2][3] = 'o';
				return true;
				}
			}
		}
		
		//fourth row 
		if(board[3][0] == 'o'||board[3][1] == 'o'||board[3][2] == 'o'||board[3][3] == 'o'){
			return false;
		}
		else{
			if(board[3][0] == board[3][1] && board[3][1]==board[3][2] &&board[3][2]=='x' ){
				if(game.isFree(3 ,3 )){
					board[3][3] = 'o';
					return true;
				}
			}
			if(board[3][0] == board[3][2] && board[3][2]==board[3][3] &&board[3][0]=='x'){
				if(game.isFree(3,1)){
					board[3][1] = 'o';
					return true;
				}
			}
			if(board[3][1] == board[3][2] && board[3][1] == board[3][3] &&board[3][3]=='x'){
				if(game.isFree(3, 0)){
					board[3][0] = 'o';
					return true;
				}
		  }
			if(board[3][1] == board[3][0] && board[3][1] == board[3][3] &&board[3][3]=='x'){
				if(game.isFree(3, 2)){
					board[3][2] = 'o';
					return true;
				}
		  }
	}
		
		//second diagonal
		if(board[0][3] == 'o'||board[1][2] == 'o'||board[2][1] == 'o'||board[3][0] == 'o'){
			return false;
		}
		else{
			if(board[0][3] == board[1][2] && board[1][2]==board[2][1] &&board[0][3]=='x' ){
				if(game.isFree(3,0)){
					board[3][0] = 'o';
					return true;
				}
			}
			if(board[0][3] == board[1][2] && board[1][2]==board[3][0] &&board[0][3]=='x'){
				if(game.isFree(2,1)){
					board[2][1] = 'o';
					return true;
				}
			}
			if(board[0][3] == board[2][1] && board[2][1] == board[3][0] &&board[0][3]=='x'){
				if(game.isFree(1,2)){
					board[1][2] = 'o';
					return true;
				}
		  }
			if(board[1][2] == board[2][1] && board[1][2] == board[3][0] &&board[1][2]=='x'){
				if(game.isFree(0, 3)){
					board[0][3] = 'o';
					return true;
				}
		  }
	}
		//first diagonal
		if(board[0][0] == 'o'||board[1][1] == 'o'||board[2][2] == 'o'||board[3][3] == 'o'){
			return false;
		}
		else{
			if(board[0][0] == board[1][1] && board[1][1]==board[3][3] &&board[3][3]=='x' ){
				if(game.isFree(2, 2)){
					board[2][2] = 'o';
					return true;
				}
			}
			if(board[0][0] == board[2][2] && board[2][2]==board[3][3] &&board[3][3]=='x'){
				if(game.isFree(1, 1)){
					board[1][1] = 'o';
					return true;
				}
			}
			if(board[1][1] == board[2][2] && board[1][1] == board[3][3] &&board[3][3]=='x'){
				if(game.isFree(0, 0)){
					board[0][0] = 'o';
					return true;
				}
		  }
			if(board[0][0] == board[1][1] && board[1][1] == board[2][2] &&board[2][2]=='x'){
				if(game.isFree(3, 3)){
					board[3][3] = 'o';
					return true;
				}
		  }
	}
		//first column
		if(board[0][0] == 'o'||board[1][0] == 'o'||board[2][0] == 'o'||board[3][0] == 'o'){
			return false;
		}
		else{
			if(board[0][0] == board[1][0] && board[1][0]==board[2][0] &&board[0][0]=='x' ){
				if(game.isFree(3, 0)){
					board[3][0] = 'o';
					return true;
				}
			}
			if(board[0][0] == board[1][0] && board[1][0]==board[3][0] &&board[0][0]=='x'){
				if(game.isFree(2, 0)){
					board[2][0] = 'o';
					return true;
				}
			}
			if(board[0][0] == board[2][0] && board[2][0] == board[3][0] &&board[0][0]=='x'){
				if(game.isFree(1, 0)){
					board[1][0] = 'o';
					return true;
				}
		  }
			if(board[1][0] == board[2][0] && board[2][0] == board[3][0] &&board[1][0]=='x'){
				if(game.isFree(0, 0)){
					board[0][0] = 'o';
					return true;
				}
		  }
	}
		//Second column
		if(board[0][1] == 'o'||board[1][1] == 'o'||board[2][1] == 'o'||board[3][1] == 'o'){
			return false;
		}
		else{
			if(board[0][1] == board[1][1] && board[1][1]==board[2][1] &&board[0][1]=='x' ){
				if(game.isFree(3,1)){
					board[3][1] = 'o';
					return true;
				}
			}
			if(board[0][1] == board[1][1] && board[1][1]==board[3][1] &&board[0][1]=='x'){
				if(game.isFree(2, 1)){
					board[2][1] = 'o';
					return true;
				}
			}
			if(board[0][1] == board[2][1] && board[2][1] == board[3][1] &&board[0][1]=='x'){
				if(game.isFree(1,1)){
					board[1][1] = 'o';
					return true;
				}
		  }
			if(board[1][1] == board[2][1] && board[2][1] == board[3][1] &&board[1][1]=='x'){
				if(game.isFree(0,1)){
					board[0][1] = 'o';
					return true;
				}
		  }
	}
		//third column
		if(board[0][1] == 'o'||board[1][1] == 'o'||board[2][1] == 'o'||board[3][1] == 'o'){
			return false;
		}
		else{
			if(board[0][1] == board[1][1] && board[1][1]==board[2][1] &&board[0][1]=='x' ){
				if(game.isFree(3,1)){
					board[3][1] = 'o';
					return true;
				}
			}
			if(board[0][1] == board[1][1] && board[1][1]==board[3][1] &&board[0][1]=='x'){
				if(game.isFree(2, 1)){
					board[2][1] = 'o';
					return true;
				}
			}
			if(board[0][1] == board[2][1] && board[2][1] == board[3][1] &&board[0][1]=='x'){
				if(game.isFree(1,1)){
					board[1][1] = 'o';
					return true;
				}
		  }
			if(board[1][1] == board[2][1] && board[2][1] == board[3][1] &&board[1][1]=='x'){
				if(game.isFree(0,1)){
					board[0][1] = 'o';
					return true;
				}
		  }
	}
		//fourth column
		if(board[0][3] == 'o'||board[1][3] == 'o'||board[2][3] == 'o'||board[3][3] == 'o'){
			return false;
		}
		else{
			if(board[0][3] == board[1][3] && board[1][3]==board[2][3] &&board[0][3]=='x' ){
				if(game.isFree(3,3)){
					board[3][3] = 'o';
					return true;
				}
			}
			if(board[0][3] == board[1][3] && board[1][3]==board[3][3] &&board[0][3]=='x'){
				if(game.isFree(2, 3)){
					board[2][3] = 'o';
					return true;
				}
			}
			if(board[0][3] == board[2][3] && board[2][3] == board[3][3] &&board[0][3]=='x'){
				if(game.isFree(1,3)){
					board[1][3] = 'o';
					return true;
				}
		  }
			if(board[1][3] == board[2][3] && board[2][3] == board[3][3] &&board[1][3]=='x'){
				if(game.isFree(0,3)){
					board[0][3] = 'o';
					return true;
				}
		  }
	}
		
		return false;
 }

}

