package assignment.tictac;

class CheckRow extends Check
{
	CheckRow(int size,char[][] xo)
	{
		super(size,xo);
	}
	
	public void condition()
	{
		for(int i=0;i<size;i++)
		{
			int player1=0;
			int player2=0;
			
			for(int j=0;j<size;j++)
			{
				if(xo[i][j]=='x')
				{
					player1++;
				}
				else if(xo[i][j]=='o')
				{
					player2++;
				}
			}
			check(player1,player2);
		}
		
		
	}
}