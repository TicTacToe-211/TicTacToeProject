
public class AI {

	public static void move(){
		if(block()){
			return;
		}
	else{
		if(Game.board[0][0] == '_'){
			Game.board[0][0] = 'O';
		}
		else if(Game.board[0][3] == '_'){
			Game.board[0][3] = 'O';
		}
		else if(Game.board[3][3] == '_')
			Game.board[3][3] = 'O';
		else if(Game.board[3][0] == '_')
			Game.board[3][0] = 'O';
		else if(Game.isFree(1,1)){
				Game.board[1][1] = 'O';
			}
			else{
				if(Game.isFree(1, 0))
					Game.board[1][0] = 'O';
				else if(Game.isFree(1, 3)){
					Game.board[1][3] = 'O';
				}
				else if(Game.isFree(0, 1))
					Game.board[0][1] = 'O';
				else if (Game.isFree(3,1)){
					Game.board[3][1] = 'O';
				}
			}
		}
	}
	public static boolean block(){
		//first row
		if(Game.board[0][0] == 'O'||Game.board[0][1] == 'O'||Game.board[0][2] == 'O' || Game.board[0][3] == 'O'){
			return false;
		}
		else{
			if(Game.board[0][0] == Game.board[0][1] && Game.board[0][1]== Game.board[0][2] && Game.board[0][2] == 'X'){
				if(Game.isFree(0, 3)){
				Game.board[0][3] = 'O';
				return true;
				}
			}
			if(Game.board[0][0] == Game.board[0][2] && Game.board[0][0]==Game.board[0][3] && Game.board[0][0] =='X'){
				if(Game.isFree(0 ,1)){
					Game.board[0][1] = 'O';
					return true;
					}
			}
			if(Game.board[0][2] == Game.board[0][1] && Game.board[0][2] == Game.board[0][3] && Game.board[0][2]=='X'){
				if(Game.isFree(0, 0)){
					Game.board[0][0] = 'O';
					return true;
					}
			}
			if(Game.board[0][0]==Game.board[0][1] && Game.board[0][1] == Game.board[0][3] && Game.board[0][0] == 'X'){
				if(Game.isFree(0, 2)){
					Game.board[0][2] = 'O';
					return true;
				}
			}
		}
		
		//Second row	
		if(Game.board[1][0] == 'O' ||Game.board[1][1] == 'O'||Game.board[1][2] == 'O' || Game.board[1][3] == 'O'){
			return false;
		}
		else{
			if(Game.board[1][0] == Game.board[1][1] && Game.board[1][1]==Game.board[1][3] && Game.board[1][0] == 'X'){
				if(Game.isFree(1,2)){
					Game.board[1][2] = 'O';
					return true;
					}
			}
			if(Game.board[1][0] == Game.board[1][2] && Game.board[1][0]==Game.board[1][3] && Game.board[1][0] == 'X'){
				if(Game.isFree(1, 1)){
					Game.board[1][1] = 'O';
					return true;
					}
			}
			if(Game.board[1][2] == Game.board[1][1] && Game.board[1][2] == Game.board[1][3] && Game.board[1][2] == 'X'){
				if(Game.isFree(1,0)){
					Game.board[1][0] = 'O';
					return true;
					}
			}
			if(Game.board[1][0] == Game.board[1][1] && Game.board[1][1] == Game.board[1][2] && Game.board[1][2] == 'X'){
				if(Game.isFree(1,3)){
					Game.board[1][3] = 'O';
					return true;
					}
			}
		}
		
		//third row
		if(Game.board[2][0] == 'O' ||Game.board[2][1] == 'O'||Game.board[2][2] == 'O'||Game.board[2][3] == 'O'){
			return false;
		}
		else{
			if(Game.board[2][0] == Game.board[2][1] && Game.board[2][1]==Game.board[2][3] && Game.board[2][0] == 'X') {
				if(Game.isFree(2,2)){
					Game.board[2][2] = 'O';
					return true;
					}
			}
			if(Game.board[2][0] == Game.board[2][2] && Game.board[2][0]==Game.board[2][3] && Game.board[2][3] == 'X'){
				if(Game.isFree(2, 1)){
					Game.board[2][1] = 'O';
					return true;
				}
			}
			if(Game.board[2][2] == Game.board[2][1] && Game.board[2][2] == Game.board[2][3] && Game.board[2][3] == 'X'){
				if(Game.isFree(2, 0)){
					Game.board[2][0] = 'O';
				return true;
				}
			}
			if(Game.board[2][0] == Game.board[2][1] && Game.board[2][1] == Game.board[2][2] && Game.board[2][0] == 'X'){
				if(Game.isFree(2, 3)){
					Game.board[2][3] = 'O';
				return true;
				}
			}
		}
		
		//fourth row 
		if(Game.board[3][0] == 'O'||Game.board[3][1] == 'O'||Game.board[3][2] == 'O'||Game.board[3][3] == 'O'){
			return false;
		}
		else{
			if(Game.board[3][0] == Game.board[3][1] && Game.board[3][1]==Game.board[3][2] &&Game.board[3][2]=='X' ){
				if(Game.isFree(3 ,3 )){
					Game.board[3][3] = 'O';
					return true;
				}
			}
			if(Game.board[3][0] == Game.board[3][2] && Game.board[3][2]==Game.board[3][3] &&Game.board[3][0]=='X'){
				if(Game.isFree(3,1)){
					Game.board[3][1] = 'O';
					return true;
				}
			}
			if(Game.board[3][1] == Game.board[3][2] && Game.board[3][1] == Game.board[3][3] &&Game.board[3][3]=='X'){
				if(Game.isFree(3, 0)){
					Game.board[3][0] = 'O';
					return true;
				}
		  }
			if(Game.board[3][1] == Game.board[3][0] && Game.board[3][1] == Game.board[3][3] &&Game.board[3][3]=='X'){
				if(Game.isFree(3, 2)){
					Game.board[3][2] = 'O';
					return true;
				}
		  }
	}
		
		//second diagonal
		if(Game.board[0][3] == 'O'||Game.board[1][2] == 'O'||Game.board[2][1] == 'O'||Game.board[3][0] == 'O'){
			return false;
		}
		else{
			if(Game.board[0][3] == Game.board[1][2] && Game.board[1][2]==Game.board[2][1] &&Game.board[0][3]=='X' ){
				if(Game.isFree(3,0)){
					Game.board[3][0] = 'O';
					return true;
				}
			}
			if(Game.board[0][3] == Game.board[1][2] && Game.board[1][2]==Game.board[3][0] &&Game.board[0][3]=='X'){
				if(Game.isFree(2,1)){
					Game.board[2][1] = 'O';
					return true;
				}
			}
			if(Game.board[0][3] == Game.board[2][1] && Game.board[2][1] == Game.board[3][0] &&Game.board[0][3]=='X'){
				if(Game.isFree(1,2)){
					Game.board[1][2] = 'O';
					return true;
				}
		  }
			if(Game.board[1][2] == Game.board[2][1] && Game.board[1][2] == Game.board[3][0] &&Game.board[1][2]=='X'){
				if(Game.isFree(0, 3)){
					Game.board[0][3] = 'O';
					return true;
				}
		  }
	}
		//first diagonal
		if(Game.board[0][0] == 'O'||Game.board[1][1] == 'O'||Game.board[2][2] == 'O'||Game.board[3][3] == 'O'){
			return false;
		}
		else{
			if(Game.board[0][0] == Game.board[1][1] && Game.board[1][1]==Game.board[3][3] &&Game.board[3][3]=='X' ){
				if(Game.isFree(2, 2)){
					Game.board[2][2] = 'O';
					return true;
				}
			}
			if(Game.board[0][0] == Game.board[2][2] && Game.board[2][2]==Game.board[3][3] &&Game.board[3][3]=='X'){
				if(Game.isFree(1, 1)){
					Game.board[1][1] = 'O';
					return true;
				}
			}
			if(Game.board[1][1] == Game.board[2][2] && Game.board[1][1] == Game.board[3][3] &&Game.board[3][3]=='X'){
				if(Game.isFree(0, 0)){
					Game.board[0][0] = 'O';
					return true;
				}
		  }
			if(Game.board[0][0] == Game.board[1][1] && Game.board[1][1] == Game.board[2][2] &&Game.board[2][2]=='X'){
				if(Game.isFree(3, 3)){
					Game.board[3][3] = 'O';
					return true;
				}
		  }
	}
		//first column
		if(Game.board[0][0] == 'O'||Game.board[1][0] == 'O'||Game.board[2][0] == 'O'||Game.board[3][0] == 'O'){
			return false;
		}
		else{
			if(Game.board[0][0] == Game.board[1][0] && Game.board[1][0]==Game.board[2][0] &&Game.board[0][0]=='X' ){
				if(Game.isFree(3, 0)){
					Game.board[3][0] = 'O';
					return true;
				}
			}
			if(Game.board[0][0] == Game.board[1][0] && Game.board[1][0]==Game.board[3][0] &&Game.board[0][0]=='X'){
				if(Game.isFree(2, 0)){
					Game.board[2][0] = 'O';
					return true;
				}
			}
			if(Game.board[0][0] == Game.board[2][0] && Game.board[2][0] == Game.board[3][0] &&Game.board[0][0]=='X'){
				if(Game.isFree(1, 0)){
					Game.board[1][0] = 'O';
					return true;
				}
		  }
			if(Game.board[1][0] == Game.board[2][0] && Game.board[2][0] == Game.board[3][0] &&Game.board[1][0]=='X'){
				if(Game.isFree(0, 0)){
					Game.board[0][0] = 'O';
					return true;
				}
		  }
	}
		//Second column
		if(Game.board[0][1] == 'O'||Game.board[1][1] == 'O'||Game.board[2][1] == 'O'||Game.board[3][1] == 'O'){
			return false;
		}
		else{
			if(Game.board[0][1] == Game.board[1][1] && Game.board[1][1]==Game.board[2][1] &&Game.board[0][1]=='X' ){
				if(Game.isFree(3,1)){
					Game.board[3][1] = 'O';
					return true;
				}
			}
			if(Game.board[0][1] == Game.board[1][1] && Game.board[1][1]==Game.board[3][1] &&Game.board[0][1]=='X'){
				if(Game.isFree(2, 1)){
					Game.board[2][1] = 'O';
					return true;
				}
			}
			if(Game.board[0][1] == Game.board[2][1] && Game.board[2][1] == Game.board[3][1] &&Game.board[0][1]=='X'){
				if(Game.isFree(1,1)){
					Game.board[1][1] = 'O';
					return true;
				}
		  }
			if(Game.board[1][1] == Game.board[2][1] && Game.board[2][1] == Game.board[3][1] &&Game.board[1][1]=='X'){
				if(Game.isFree(0,1)){
					Game.board[0][1] = 'O';
					return true;
				}
		  }
	}
		//third column
		if(Game.board[0][1] == 'O'||Game.board[1][1] == 'O'||Game.board[2][1] == 'O'||Game.board[3][1] == 'O'){
			return false;
		}
		else{
			if(Game.board[0][1] == Game.board[1][1] && Game.board[1][1]==Game.board[2][1] &&Game.board[0][1]=='X' ){
				if(Game.isFree(3,1)){
					Game.board[3][1] = 'O';
					return true;
				}
			}
			if(Game.board[0][1] == Game.board[1][1] && Game.board[1][1]==Game.board[3][1] &&Game.board[0][1]=='X'){
				if(Game.isFree(2, 1)){
					Game.board[2][1] = 'O';
					return true;
				}
			}
			if(Game.board[0][1] == Game.board[2][1] && Game.board[2][1] == Game.board[3][1] &&Game.board[0][1]=='X'){
				if(Game.isFree(1,1)){
					Game.board[1][1] = 'O';
					return true;
				}
		  }
			if(Game.board[1][1] == Game.board[2][1] && Game.board[2][1] == Game.board[3][1] &&Game.board[1][1]=='X'){
				if(Game.isFree(0,1)){
					Game.board[0][1] = 'O';
					return true;
				}
		  }
	}
		//fourth column
		if(Game.board[0][3] == 'O'||Game.board[1][3] == 'O'||Game.board[2][3] == 'O'||Game.board[3][3] == 'O'){
			return false;
		}
		else{
			if(Game.board[0][3] == Game.board[1][3] && Game.board[1][3]==Game.board[2][3] &&Game.board[0][3]=='X' ){
				if(Game.isFree(3,3)){
					Game.board[3][3] = 'O';
					return true;
				}
			}
			if(Game.board[0][3] == Game.board[1][3] && Game.board[1][3]==Game.board[3][3] &&Game.board[0][3]=='X'){
				if(Game.isFree(2, 3)){
					Game.board[2][3] = 'O';
					return true;
				}
			}
			if(Game.board[0][3] == Game.board[2][3] && Game.board[2][3] == Game.board[3][3] &&Game.board[0][3]=='X'){
				if(Game.isFree(1,3)){
					Game.board[1][3] = 'O';
					return true;
				}
		  }
			if(Game.board[1][3] == Game.board[2][3] && Game.board[2][3] == Game.board[3][3] &&Game.board[1][3]=='X'){
				if(Game.isFree(0,3)){
					Game.board[0][3] = 'O';
					return true;
				}
		  }
	}
		
		return false;
 }

}

