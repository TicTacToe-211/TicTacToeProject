
public class AI {

	public static void firstMove(){
		if(block()){
			return;
		}
	else{
		if(Game.board[0][0] == '_'){
			Game.board[0][0] = 'O';
		}
		else if(Game.board[0][2] == '_'){
			Game.board[0][2] = 'O';
		}
		else if(Game.board[2][2] == '_')
			Game.board[2][2] = 'O';
		else if(Game.board[2][0] == '_')
			Game.board[2][0] = 'O';
		else if(Game.isFree(1,1)){
				Game.board[1][1] = 'O';
			}
			else{
				if(Game.isFree(1, 0))
					Game.board[1][0] = 'O';
				else if(Game.isFree(1, 2)){
					Game.board[1][2] = 'O';
				}
				else if(Game.isFree(0, 1))
					Game.board[0][1] = 'O';
				else if (Game.isFree(2, 1)){
					Game.board[2][1] = 'O';
				}
			}
		}
	}
	public static boolean block(){
		if(Game.board[0][0] == 'O'||Game.board[0][1] == 'O'||Game.board[0][2] == 'O'){
			return false;
		}
		else{
			if(Game.board[0][0] == Game.board[0][1] && Game.board[0][1]=='X'){
				if(Game.isFree(0, 2)){
				Game.board[0][2] = 'O';
				return true;
				}
			}
			if(Game.board[0][0] == Game.board[0][2] && Game.board[0][0]=='X'){
				if(Game.isFree(0, 1)){
					Game.board[0][1] = 'O';
					return true;
					}
			}
			if(Game.board[0][2] == Game.board[0][1] && Game.board[0][2] == 'X'){
				if(Game.isFree(0, 0)){
					Game.board[0][0] = 'O';
					return true;
					}
			}
		}
		
		if(Game.board[1][0] == 'O' ||Game.board[1][1] == 'O'||Game.board[1][2] == 'O'){
			return false;
		}
		else{
			if(Game.board[1][0] == Game.board[1][1] && Game.board[1][1]=='X'){
				if(Game.isFree(1,2)){
					Game.board[1][2] = 'O';
					return true;
					}
			}
			if(Game.board[1][0] == Game.board[1][2] && Game.board[1][0]=='X'){
				if(Game.isFree(1, 1)){
					Game.board[1][1] = 'O';
					return true;
					}
			}
			if(Game.board[1][2] == Game.board[1][1] && Game.board[1][2] == 'X'){
				if(Game.isFree(1,0)){
					Game.board[1][0] = 'O';
					return true;
					}
			}
		}
		
		if(Game.board[2][0] == 'O' ||Game.board[2][1] == 'O'||Game.board[2][2] == 'O'){
			return false;
		}
		else{
			if(Game.board[2][0] == Game.board[2][1] && Game.board[2][1]=='X'){
				if(Game.isFree(2,2)){
					Game.board[2][2] = 'O';
					return true;
					}
			}
			if(Game.board[2][0] == Game.board[2][2] && Game.board[2][0]=='X'){
				if(Game.board[2][1] == '_'){
					Game.board[2][1] = 'O';
					return true;
				}
			}
			if(Game.board[2][2] == Game.board[2][1] && Game.board[2][2] == 'X'){
				if(Game.board[2][0] == '_'){
					Game.board[2][0] = 'O';
				return true;
				}
			}
		}
		
		if(Game.board[0][0] == 'O'||Game.board[1][1] == 'O'||Game.board[2][2] == 'O'){
			return false;
		}
		else{
			if(Game.board[0][0] == Game.board[1][1] && Game.board[1][1]=='X'){
				if(Game.board[2][2] == '_'){
					Game.board[2][2] = 'O';
					return true;
				}
			}
			if(Game.board[0][0] == Game.board[2][2] && Game.board[2][2]=='X'){
				if(Game.board[1][1] == '_'){
					Game.board[1][1] = 'O';
					return true;
				}
			}
			if(Game.board[1][1] == Game.board[2][2] && Game.board[1][1] == 'X'){
				if(Game.board[0][0] == '_'){
					Game.board[0][0] = 'O';
					return true;
				}
		}
	}
		if(Game.board[0][2] == 'O'||Game.board[1][1] == 'O'||Game.board[2][0] == 'O'){
			return false;
		}
		else{
			if(Game.board[0][2] == Game.board[1][1] && Game.board[1][1]=='X'){
				if(Game.board[2][0] == '_'){
					Game.board[2][0] = 'O';
					return true;
				}
			}
			if(Game.board[0][2] == Game.board[2][0] && Game.board[0][2]=='X'){
				if(Game.board[1][1] == '_'){
					Game.board[1][1] = 'O';
					return true;
				}
			}
			if(Game.board[1][1] == Game.board[2][0] && Game.board[1][1] == 'X'){
				if(Game.board[0][2] == '_'){
					Game.board[0][2] = 'O';
					return true;
				}
		}
	}
		if(Game.board[0][0] == 'O'||Game.board[1][0] == 'O'||Game.board[2][0] == 'O'){
			return false;
		}
		else{
			if(Game.board[0][0] == Game.board[1][0] && Game.board[0][0]=='X'){
				if(Game.board[2][0] == '_'){
					Game.board[2][0] = 'O';
					return true;
				}
			}
			if(Game.board[0][0] == Game.board[2][0] && Game.board[2][0]=='X'){
				if(Game.board[1][0] == '_'){
					Game.board[1][0] = 'O';
					return true;
				}
			}
			if(Game.board[1][0] == Game.board[2][0] && Game.board[1][0] == 'X'){
				if(Game.board[0][0] == '_'){
					Game.board[0][0] = 'O';
					return true;
				}
		}
	}
		return false;
	}
	
	/*public static boolean canWin(){
		
	}*/
}

