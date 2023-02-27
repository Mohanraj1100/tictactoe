package assignment.tictac;

import java.util.logging.Logger;

abstract class Check
{
	Logger l = Logger.getLogger("hi");
	int size;
	char [][]xo;
	Check(int size,char[][] xo)
	{
		this.size = size;
		this.xo = xo;
	}
	public void check(int play1,int play2)
	{
		if(play1 == size)
		{
			l.info("Player 1 wins");
			System.exit(0);
		}
		if(play2 == size)
		{
			l.info("Player 2 wins");
			System.exit(0);
		}
	}
	public abstract void condition();
}
