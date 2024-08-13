package controller;

public class Controller 
{
	
	public Controller()
	{
		super();
	}
	
	
	public int Fat(int num)
	{
		if (num == 1)
		{
			return num;
		}
		else
		{
			return num * Fat(num - 2);
		}
		
	}
	
}
