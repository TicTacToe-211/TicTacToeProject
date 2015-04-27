
public class AI 
{
	private Game game;
	//Add a board and create set method to set this board to Game board
	private char [][] board;
	public Location move()
	{
		return new Location(0,0);
		board = game.getBoard();
		if(false)
		{
			return block();
		}
		if(game.isFree(0, 0))
		{
			return new Location(0,0);
			 
		}
		if(game.isFree(0, 3))
		{
			return new Location(0,3);
			 
		}
		if(game.isFree(3,0))
		{
			return new Location(3,0);
			 
		}
		if(game.isFree(3,3))
		{
			return new Location(3,3);
			 
		}
		if(game.isFree(2,1))
		{
			return new Location(2,1);
			 
		}
		if(game.isFree(1, 2))
		{
			return new Location(1,2);
			 
		}
		if(game.isFree(2,2))
		{
			return new Location(2,2);
			 
		}
		if(game.isFree(1,1))
		{
			return new Location(1,1);
			 
		}
		if(game.isFree(0, 1))
		{
			return new Location(0,1);
			 
		}
		if(game.isFree(0, 2))
		{
			return new Location(0,2);
			 
		}
		if(game.isFree(3,1))
		{
			return new Location(3,1);
			 
		}
		if(game.isFree(3,2))
		{
			return new Location(3,2);
			 
		}
		if(game.isFree(1,0))
		{
			return new Location(1,0);
			 
		}
		if(game.isFree(1, 3))
		{
			return new Location(1,3);
			 
		}
		if(game.isFree(2, 3))
		{
			return new Location(2,3);
			 
		}
		return new Location(0,0);
	}
	private Location block()
	{
		if(firstRowBlock() != null)
		{
			return firstRowBlock();
		}
		
		if(secondRowBlock() != null)
		{
			return secondRowBlock();
		}
		
		if(thirdRowBlock() != null)
		{
			return thirdRowBlock();
		}
		
		if(fourthRowBlock() != null)
		{
			return fourthRowBlock();
		}
		
		if(firstDiagonalBlock() != null)
		{
			return firstDiagonalBlock();
		}
		
		if(secondDiagonalBlock() != null)
		{
			return secondDiagonalBlock();
		}
		
		if(firstColumnBlock() != null)
		{
			return firstColumnBlock();
		}
		
		if(secondColumnBlock() != null)
		{
			return secondColumnBlock();
		}
		
		if(thirdColumnBlock() != null)
		{
			return thirdColumnBlock();
		}
		
		if(fourthColumnBlock() != null)
		{
			return fourthColumnBlock();
		}
		
		return null;
 }
	private Location firstRowBlock()
	{
		if(board[0][0] == 'o'||board[0][1] == 'o'||board[0][2] == 'o' || board[0][3] == 'o')
		{
			return null;
		}
		else
		{
			if(board[0][0] == board[0][1] && board[0][1]== board[0][2] && board[0][2] == 'x')
			{
				if(game.isFree(0, 3))
				{
				return new Location(0,3);
				 
				}
			}
			if(board[0][0] == board[0][2] && board[0][0]==board[0][3] && board[0][0] =='x')
			{
				if(game.isFree(0 ,1))
				{
					return new Location (0,1);
					 
				}
			}
			if(board[0][2] == board[0][1] && board[0][2] == board[0][3] && board[0][2]=='x')
			{
				if(game.isFree(0, 0))
				{
					return new Location(0,0);
					 
				}
			}
			if(board[0][0]==board[0][1] && board[0][1] == board[0][3] && board[0][0] == 'x')
			{
				if(game.isFree(0, 2))
				{
					return new Location(0,2);
					 
				}
			}
		} 
		return null;
	}
	private Location secondRowBlock()
	{		
		if(board[1][0] == 'o' ||board[1][1] == 'o'||board[1][2] == 'o' || board[1][3] == 'o')
		{
			return null;
		}
		else
		{
			if(board[1][0] == board[1][1] && board[1][1]==board[1][3] && board[1][0] == 'x')
			{
				if(game.isFree(1,2))
				{
					return new Location(1,2);
					 
				}
			}
			if(board[1][0] == board[1][2] && board[1][0]==board[1][3] && board[1][0] == 'x')
			{
				if(game.isFree(1, 1))
				{
					return new Location(1,1);
					 
				}
			}
			if(board[1][2] == board[1][1] && board[1][2] == board[1][3] && board[1][2] == 'x')
			{
				if(game.isFree(1,0))
				{
					return new Location(1,0);
					 
				}
			}
			if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] == 'x')
			{
				if(game.isFree(1,3))
				{
					return new Location(1,3);
					 
				}
			}
		}
		return null;
	}
	private Location thirdRowBlock()
	{
		
		if(board[2][0] == 'o' ||board[2][1] == 'o'||board[2][2] == 'o'||board[2][3] == 'o')
		{
			return null;
		}
		else
		{
			if(board[2][0] == board[2][1] && board[2][1]==board[2][3] && board[2][0] == 'x')
			{
				if(game.isFree(2,2))
				{
					return new Location(2,2);
					 
				}
			}
			if(board[2][0] == board[2][2] && board[2][0]==board[2][3] && board[2][3] == 'x')
			{
				if(game.isFree(2, 1))
				{
					return new Location(2,1);
					 
				}
			}
			if(board[2][2] == board[2][1] && board[2][2] == board[2][3] && board[2][3] == 'x')
			{
				if(game.isFree(2, 0))
				{
					return new Location(2,0);
					 
				}
			}
			if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] == 'x')
			{
				if(game.isFree(2, 3))
				{
					return new Location(2,3);
					 
				}
			}
		}
		
		return null;
	}
	private Location fourthRowBlock()
	{
		if(board[3][0] == 'o'||board[3][1] == 'o'||board[3][2] == 'o'||board[3][3] == 'o')
		{
			return null;
		}
		else
		{
			if(board[3][0] == board[3][1] && board[3][1]==board[3][2] &&board[3][2]=='x' )
			{
				if(game.isFree(3 ,3 ))
				{
					return new Location(3,3);
					 
				}
			}
			if(board[3][0] == board[3][2] && board[3][2]==board[3][3] &&board[3][0]=='x')
			{
				if(game.isFree(3,1))
				{
					return new Location(3,1);
					 
				}
			}
			if(board[3][1] == board[3][2] && board[3][1] == board[3][3] &&board[3][3]=='x')
			{
				if(game.isFree(3, 0))
				{
					return new Location(3,0);
					 
				}
		  }
			if(board[3][1] == board[3][0] && board[3][1] == board[3][3] &&board[3][3]=='x')
			{
				if(game.isFree(3, 2))
				{
					return new Location(3,2);
					 
				}
		  }
	}
		return null;
	}
	private Location firstDiagonalBlock()
	{
		if(board[0][0] == 'o'||board[1][1] == 'o'||board[2][2] == 'o'||board[3][3] == 'o')
		{
			return null;
		}
		else
		{
			if(board[0][0] == board[1][1] && board[1][1]==board[3][3] &&board[3][3]=='x' )
			{
				if(game.isFree(2, 2))
				{
					return new Location(2,2);
					 
				}
			}
			if(board[0][0] == board[2][2] && board[2][2]==board[3][3] &&board[3][3]=='x')
			{
				if(game.isFree(1, 1))
				{
					return new Location(1,1);
					 
				}
			}
			if(board[1][1] == board[2][2] && board[1][1] == board[3][3] &&board[3][3]=='x')
			{
				if(game.isFree(0, 0))
				{
					return new Location(0,0);
					 
				}
		  }
			if(board[0][0] == board[1][1] && board[1][1] == board[2][2] &&board[2][2]=='x')
			{
				if(game.isFree(3, 3))
				{
					return new Location(3,3);
					 
				}
		  }
	}
		return null;
	}
	private Location secondDiagonalBlock()
	{
		if(board[0][3] == 'o'||board[1][2] == 'o'||board[2][1] == 'o'||board[3][0] == 'o')
		{
			return null;
		}
		else
		{
			if(board[0][3] == board[1][2] && board[1][2]==board[2][1] &&board[0][3]=='x' )
			{
				if(game.isFree(3,0))
				{
					return new Location(3,0);
					 
				}
			}
			if(board[0][3] == board[1][2] && board[1][2]==board[3][0] &&board[0][3]=='x')
			{
				if(game.isFree(2,1))
				{
					return new Location(2,1);
					 
				}
			}
			if(board[0][3] == board[2][1] && board[2][1] == board[3][0] &&board[0][3]=='x')
			{
				if(game.isFree(1,2))
				{
					return new Location(1,2);
					 
				}
		  }
			if(board[1][2] == board[2][1] && board[1][2] == board[3][0] &&board[1][2]=='x')
			{
				if(game.isFree(0, 3))
				{
					return new Location(0,3);
					 
				}
		  }
	}
		return null;
	}
	private Location firstColumnBlock()
	{
		if(board[0][0] == 'o'||board[1][0] == 'o'||board[2][0] == 'o'||board[3][0] == 'o')
		{
			return null;
		}
		else
		{
			if(board[0][0] == board[1][0] && board[1][0]==board[2][0] &&board[0][0]=='x' )
			{
				if(game.isFree(3, 0))
				{
					return new Location(3,0);
					 
				}
			}
			if(board[0][0] == board[1][0] && board[1][0]==board[3][0] &&board[0][0]=='x')
			{
				if(game.isFree(2, 0))
				{
					return new Location(2,0);
					 
				}
			}
			if(board[0][0] == board[2][0] && board[2][0] == board[3][0] &&board[0][0]=='x')
			{
				if(game.isFree(1, 0))
				{
					return new Location(1,0);
					 
				}
		  }
			if(board[1][0] == board[2][0] && board[2][0] == board[3][0] &&board[1][0]=='x')
			{
				if(game.isFree(0, 0))
				{
					return new Location(0,0);
					 
				}
		  }
	}
		return null;
	}
	private Location secondColumnBlock()
	{
		if(board[0][1] == 'o'||board[1][1] == 'o'||board[2][1] == 'o'||board[3][1] == 'o')
		{
			return null;
		}
		else
		{
			if(board[0][1] == board[1][1] && board[1][1]==board[2][1] &&board[0][1]=='x' )
			{
				if(game.isFree(3,1))
				{
					return new Location(3,1);
					 
				}
			}
			if(board[0][1] == board[1][1] && board[1][1]==board[3][1] &&board[0][1]=='x')
			{
				if(game.isFree(2, 1))
				{
					return new Location(2,1);
					 
				}
			}
			if(board[0][1] == board[2][1] && board[2][1] == board[3][1] &&board[0][1]=='x')
			{
				if(game.isFree(1,1))
				{
					return new Location(1,1);
					 
				}
		  }
			if(board[1][1] == board[2][1] && board[2][1] == board[3][1] &&board[1][1]=='x')
			{
				if(game.isFree(0,1))
				{
					return new Location(0,1);
					 
				}
		  }
	}
		return null;
	}
	private Location thirdColumnBlock()
	{
		if(board[0][1] == 'o'||board[1][1] == 'o'||board[2][1] == 'o'||board[3][1] == 'o')
		{
			return null;
		}
		else
		{
			if(board[0][1] == board[1][1] && board[1][1]==board[2][1] &&board[0][1]=='x' )
			{
				if(game.isFree(3,1))
				{
					return new Location (3,1);
					 
				}
			}
			if(board[0][1] == board[1][1] && board[1][1]==board[3][1] &&board[0][1]=='x')
			{
				if(game.isFree(2, 1))
				{
					return new Location (2,1);
					 
				}
			}
			if(board[0][1] == board[2][1] && board[2][1] == board[3][1] &&board[0][1]=='x')
			{
				if(game.isFree(1,1))
				{
					return new Location (1,1);
					 
				}
		  }
			if(board[1][1] == board[2][1] && board[2][1] == board[3][1] &&board[1][1]=='x')
			{
				if(game.isFree(0,1))
				{
					return new Location (0,1);
					 
				}
		  }
	}
		return null;
	}
	private Location fourthColumnBlock()
	{
		if(board[0][3] == 'o'||board[1][3] == 'o'||board[2][3] == 'o'||board[3][3] == 'o')
		{
			return null;
		}
		else
		{
			if(board[0][3] == board[1][3] && board[1][3]==board[2][3] &&board[0][3]=='x' )
			{
				if(game.isFree(3,3))
				{
					return new Location (3,3);
					 
				}
			}
			if(board[0][3] == board[1][3] && board[1][3]==board[3][3] &&board[0][3]=='x')
			{
				if(game.isFree(2, 3))
				{
					return new Location (2,3);
					 
				}
			}
			if(board[0][3] == board[2][3] && board[2][3] == board[3][3] &&board[0][3]=='x')
			{
				if(game.isFree(1,3))
				{
					return new Location (1,3);
					 
				}
			}
			if(board[1][3] == board[2][3] && board[2][3] == board[3][3] &&board[1][3]=='x')
			{
				if(game.isFree(0,3))
				{
					return new Location (0,3);
					 
				}
		  }
	}
		return null;
	}
}

