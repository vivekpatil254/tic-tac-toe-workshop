
public class TicTacToeGame {
	char arr[] = new char[20];
	
	
	public static void main(String args[])
	{
		TicTacToeGame object = new TicTacToeGame();
		object.assign();
		object.display();
	}
	
	public void assign()
	{
		for (int i=1;i<=10;i++)
		{
			arr[i]=' ';
		}
	}
	public void display()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(arr[i]);
			System.out.println("hi");
		}
	}
	
	
	
	

}
