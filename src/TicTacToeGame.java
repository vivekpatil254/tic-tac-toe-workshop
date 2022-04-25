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
		showBoard();
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
		char user1Input;
		char user2Input;
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the input 'X' or 'O'");
		while(true){
				System.out.println("Enter the input 'X' or 'O'");
				user1Input = scanner.next().charAt(0);
				System.out.println(user1Input);
				if (user1Input=='X'||user1Input=='O'||user1Input=='x'||user1Input=='o')
					break;
		}
		
		if(user1Input=='X'||user1Input=='x')
			user2Input = 'O';
		else 
			user2Input = 'X';
		System.out.println("Player 1 Input : "+user1Input);
		System.out.println("Player 2 Input : "+user2Input);
	}
	
	public static void showBoard()
	{
		
		System.out.println("     |            |      ");
		System.out.println("     |            |      ");
		System.out.println("-----|------------|----- ");
		System.out.println("     |            |      ");
		System.out.println("     |            |      ");
		System.out.println("-----|------------|----- ");
		System.out.println("     |            |      ");
		System.out.println("     |            |      ");
		
	}
	






}
