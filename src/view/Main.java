package view;

import controller.Controller;

public class Main 
{

	public static void main (String[] args) 
	{
		Controller c = new Controller();
		
		int num = 0;
		
		while (num % 2 == 0)
		{
			num = 7;
		}
		
		int resultado = c.Fat(num);
		
		System.out.println(resultado);
		
	}
	
}
