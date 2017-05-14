package selective_wines;

public class Validation extends Exception  
{
	private String message;

	Validation(String msg)
	{
		message = msg;
	}

	public String toString()
	{
		return message;
	}
}
