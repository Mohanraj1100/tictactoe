package assignment.tictac;

class CheckColoumn extends Check
{
	CheckColoumn(int size,char[][] xo)
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
				if(xo[j][i]=='x')
				{
					player1++;
				}
				else if(xo[j][i]=='o')
				{
					player2++;
				}
			}
			check(player1,player2);
		}
		
		
	}
}