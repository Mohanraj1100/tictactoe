package assignment.tictac;

class CheckLeadingDiagonal extends Check{
	CheckLeadingDiagonal(int size,char[][] xo)
	{
		super(size,xo);
	}
	
	public void condition()
	{
		int player1=0;
		int player2=0;
		
		for(int i=0;i<size;i++)
		{
			if(xo[i][i]== 'x' )
			{
				player1++;
			}
			else if(xo[i][i]=='o')
			{
				player2++;
			}
		}	
		check(player1,player2);
	}
}

