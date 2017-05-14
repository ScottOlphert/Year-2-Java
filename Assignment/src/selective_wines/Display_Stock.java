package selective_wines;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.*;

public class Display_Stock  extends JFrame implements ActionListener {

	private Container cn;
	private JLabel title, filter ,buf,buf1,buf2,buf3, buf4, buf5;
	private JPanel north, south, print;
	private JScrollPane jsp;
	private JTextArea stock;
	private JButton btnDisp, btnExit, btnPrint;
	private JComboBox<?> country, colour; 

	Font all = new Font("Arial", Font.BOLD,16); // Create a font to use as default 

	private  HashMap<String, Product> item = new HashMap<String, Product> (50); // local #map created
	File Report = new File("resource/Report.txt");

	public Display_Stock(HashMap<String, Product> stockItems) // constructor initialising components of GUI and adding to container
	{
		item = stockItems; // set local # with contents of SWMenu #map

		cn = getContentPane(); // create container
		cn.setLayout(new GridBagLayout());
		cn.setBackground(Color.decode("#8F0B23"));

		north = new JPanel(new GridBagLayout());  // Create panels
		north.setBackground(Color.decode("#8F0B23"));

		south = new JPanel(new GridBagLayout());
		south.setBackground(Color.decode("#8F0B23"));
		
		print = new JPanel(new GridBagLayout());
		print.setBackground(Color.decode("#8F0B23"));

		title = new JLabel("<html><u>--Stock--</u></html>",JLabel.CENTER); // Create label for title
		title.setFont(new Font("Arial",Font.BOLD,20));
		title.setForeground(Color.white);
		
		filter = new JLabel("Filter:",JLabel.LEFT); // Create label for title
		filter.setFont(all);
		filter.setForeground(Color.white);

		buf = new JLabel(""); // buffer labels for spacing
		buf1 = new JLabel("");
		buf2 = new JLabel("");
		buf3 = new JLabel("");
		buf4 = new JLabel("");
		buf5 = new JLabel("");

		stock = new JTextArea();  //Create display text area
		stock.setEditable(false);
		stock.setFont(new Font("monospaced", Font.PLAIN, 12));
		stock.setBackground(Color.WHITE);
		stock.setText("");

		jsp = new JScrollPane(stock);
		jsp.setBackground(Color.WHITE);     // scroll pane for text area
		
		country = new JComboBox(); // Combo box for country filter
		country.setBackground(Color.WHITE);
		
		String [] wine = {"--Colour--","Red","White","Rose"}; // Combo box for wine colour filter
		colour = new JComboBox(wine);
		colour.setBackground(Color.WHITE);

		btnExit = new JButton("Close");
		btnExit.setBackground(Color.WHITE); // create buttons for GUI
		btnExit.setFont(all);
		btnExit.addActionListener(this);

		btnDisp = new JButton("Display");
		btnDisp.setBackground(Color.WHITE);
		btnDisp.setFont(all);
		btnDisp.addActionListener(this);
		
		btnPrint = new JButton("Create text file");
		btnPrint.setBackground(Color.WHITE);
		btnPrint.setFont(all);
		btnPrint.addActionListener(this);

		addComp(north,title,1,0,1,1,0,0);
		addComp(north,buf,0,0,1,1,1,0);    //construct GUI
		addComp(north,buf1,2,0,1,1,1,0);
		addComp(cn,north,0,0,3,1,0,0);
		addComp(cn,stock,0,1,3,1,1,1);
		addComp(cn,south,0,2,3,1,0,0);
		addComp(south,btnPrint,6,0,1,1,0,0);
		addComp(south,btnDisp,5,0,1,1,0,0);
		addComp(south,filter,0,0,1,1,0,0);
		addComp(south,country,1,0,1,1,2,0);
		addComp(south,colour,3,0,1,1,2,0);
		addComp(south,buf2,2,0,1,1,1,0);
		addComp(south,buf3,4,0,1,1,1,0);
		addComp(cn,print,0,3,3,1,0,0);
		addComp(print,buf4,0,0,1,1,2,0);
		addComp(print,btnExit,1,0,1,1,1,0);
		addComp(print,buf5,2,0,1,1,2,0);
		

	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btnDisp)
		{
			reset();
			display();
		}

		if(e.getSource() == btnExit)
		{
			this.setVisible(false);
			reset();
		}

	}

	

	private void display() //Method to print the Ordered List to the text area
	{

		try
		{
			stock.setText("");
		
		String s;
		// Add a header
		s="Student ID.   Forename             Surname             Subject        Result\n";
		stock.append(s);
		s="-----------------------------------------------------------------------------\n";
		stock.append(s);
		
		// Create an instance of Iterator
		
		PrintWriter create = new PrintWriter(Report);
		
		create.println("Student List");
		create.println("------------");
		create.println("");
		create.println("Student ID.   Forename             Surname             Subject        Result");
		create.println("-----------------------------------------------------------------------------");
	
	
		Iterator i = item.entrySet().iterator();
		// Loop through the items (see notes)
		
		while (i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			
			stock.append(me.getValue().toString());
			create.println(me.getValue().toString());
		}
		create.close();
		}
		catch(FileNotFoundException fEx)
		{
			JOptionPane.showMessageDialog(null, "File not found");
		}
	}

	private void reset() // method to reset the textArea 
	{
		stock.setText("");
	}

	// Method used to add component to the container and declare constraints
	private void addComp(Container Con, Component c, int x, int y, int width, int height, int Weightx, int weighty)
	{


		// Create instance of constraints
		GridBagConstraints gc = new GridBagConstraints();

		//set constraints
		gc.fill = GridBagConstraints.BOTH;
		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(5,5,5,5);// sets the space between components 
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = width;
		gc.gridheight = height;
		gc.weightx = Weightx;
		gc.weighty = weighty;
		//add the component to the container
		Con.add(c, gc);

	} 

}
