package selective_wines;

import javax.swing.*;

public class Run {
	public static SWMenu menu = new SWMenu();
	
	
	public static void main(String[] args) 
	{     
		menu.setSize(600, 900);
		menu.setLocation(150,100);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setVisible(true);
		menu.setResizable(false);
	}


}
