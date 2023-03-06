package assignment.tictac;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;

class XoBoard
{
	PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
	Logger l = Logger.getLogger("XoBoard.class");
	Scanner is = new Scanner(System.in);
	char [][]xo;
	int s;
	Check ch;
	XoBoard()
	{
		ps.print("Enter the size of game");
		s= is.nextInt();
		
		xo=new char[s][s];
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
				{
					xo[i][j]=' ';
				}
		}
	}
	static int size = s;
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
	
	void checkConditon()
	{
		ch = new CheckLeadingDiagonal(size,xo);
		ch.condition();
		ch = new CheckDiagonal(size,xo);
		ch.condition();
		ch = new CheckRow(size,xo);
		ch.condition();
		ch = new CheckColoumn(size,xo);
		ch.condition();
	}
	
}
