package assignment.tictac;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;

public class TicTacToe 
{
    public static void main( String[] args )
    {
 	public int size;
    	Logger l = Logger.getLogger("hi");
    	Scanner sc = new Scanner(System.in);
    	PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
    	XoBoard xb = new XoBoard();
    	int position;
    	int s=xb.size;
    	int i=0;
    	xb.printArray();
    	l.info("Player 1  x");
    	l.info("Player 2  o");
    	while(i<s*s)
    	{
    		if(i%2==0)
    		{
    			l.info("First Player Enter the position");
    			position = sc.nextInt();
    			int val = xb.insert(position,'x');
    			if(val == 1) {
    				i--;
    			}
    			xb.printArray();
    			xb.checkXoLeadDiagonal();
    			xb.checkXoDiagonal();
    			xb.chechColumn();
    			xb.chechRow();
    		}
    		else
    		{
    			l.info("Second Player Enter the position");
    			position = sc.nextInt();
    			int val=xb.insert(position,'o');
    			if(val == 1) {
    				i--;
    			}
    			else
    			{
    			xb.printArray();
    			xb.checkXoLeadDiagonal();
    			xb.checkXoDiagonal();
    			xb.chechColumn();
    			xb.chechRow();
    			}
    		}
    		i++;
    		if(i==9)
    		{
    			l.info("Match has been Drawn");
    		}
    		
    	}   	
    }

	
}
class XoBoard
{
	static PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
	Logger l = Logger.getLogger("hi");
	Scanner is = new Scanner(System.in);
	char [][]xo;
	int size;
	String play1 = "Player 1 wins the Game";
	String play2 = "Player 2 wins the Game";
	XoBoard()
	{
		ps.print("Enter the size of game");
		this.size = is.nextInt();
		xo=new char[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
				{
					xo[i][j]=' ';
				}
		}
	}
	void printArray()
	{
	for(int i=0;i<size;i++)
	{
		ps.print('|');
		for(int j=0;j<size;j++)
			{
				ps.print(xo[i][j]);
				ps.print('|');
			}
		ps.println();
	}
	}
	public int insert(int posi,char m)
	{
		System.out.println(posi);
		int row = (posi-1)/size;
		int col = (posi-1)%size;
		if(xo[row][col] == ' ' )
		{
			xo[row][col]=m;
		}
		else
		{
			l.info("Invalid Choice");
			return 1 ;
		}
		return 0;
	}
	
	public void checkXoLeadDiagonal()
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
		if(player1 == size)
		{
			l.info(play1);
			printArray();
			System.exit(0);
		}
		if(player2 == size)
		{
			l.info(play2);
			printArray();
			System.exit(0);
		}
	}
	public void checkXoDiagonal()
	{
		
		for(int i=0;i<size;i++)
		{
			int player1=0;
			int player2=0;
			for(int j=0;j<size;j++)
			{
				if((i+j) == size-1)
				{
					if(xo[i][j]== 'x' )
					{
						player1++;
					}
					else if(xo[i][j]=='o')
					{
						player2++;
					}
				}
			}
			if(player1 == size)
			{
				l.info(play1);
				printArray();
				System.exit(0);
			}
			if(player2 == size)
			{
				l.info(play2);
				printArray();
				System.exit(0);
			}
		}
		
		
	}
	public void chechColumn()
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
			if(player1 == size)
			{
				l.info(play1);
				printArray();
				System.exit(0);
			}
			if(player2 == size)
			{
				l.info(play2);
				printArray();
				System.exit(0);
			}
		}
		
		
	}
	public void chechRow()
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
			if(player1 == size)
			{
				l.info(play1);
				printArray();
				System.exit(0);
			}
			if(player2 == size)
			{
				l.info(play2);
				printArray();
				System.exit(0);
			}
		}
		
		
	}	
}
