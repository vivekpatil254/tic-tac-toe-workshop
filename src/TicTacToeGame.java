import java.util.*;
public class TicTacToeGame {
	static char arr[] = new char[20];
	
	
	public static void main(String args[])
	{
		//TicTacToeGame object = new TicTacToeGame();
		//object.
		assign();
		//object.
		display();
		allowInput();
	}
	
	public static void assign()
	{
		for (int i=1;i<=10;i++)
		{
			arr[i]=' ';
		}
	}
	public static void display()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void allowInput() 
	{
		char input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the input 'X' or 'O'");
		do {
		input = scanner.next().charAt(0);
		System.out.println(input);
		}while(input!='X'||input!='O'||input!='x'||input!='o');	
		
	}
}
