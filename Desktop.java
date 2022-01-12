package week3.day1.Assignment1.org.system;

public class Desktop extends Computer
{
	public void desktopSize()
	{
		System.out.println("desktopSize method");
	}

	public static void main(String[] args)
	{
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}

}
