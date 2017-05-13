package selective_wines;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class Delete_Product extends JFrame implements ActionListener{

	private Container cn; 
	private JLabel lblTitle,lblName,lblCountry,lblRegion,lblGrape,lblCost, lblPrice, lblUnits, lblColour, lblID, name, country, region, grape, cost, price, units, colour,
	buf,buf1,buf2,buf3;
	private JPanel p1, p2, p3, p4, p5, p6, p7;
	private JComboBox<?>  productID; 
	private JButton  btnReset, btnDelete, btnExit, btnSearch;
	private Border lower = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

	private  HashMap<String, Product> item = new HashMap<String, Product> (50); // local #map created


	public Delete_Product(HashMap<String, Product> stockItems) // GUI constructor passing in stock #map from SWMenu
	{
		item = stockItems; // set local # with contents of SWMenu #map

		cn = getContentPane(); // create container
		cn.setLayout(new GridBagLayout());
		cn.setBackground(Color.decode("#8F0B23"));
		cn.setForeground(Color.WHITE);

		p1 = new JPanel(new GridBagLayout());
		p1.setBackground(Color.decode("#8F0B23"));
		p2 = new JPanel(new GridBagLayout());
		p2.setBackground(Color.decode("#8F0B23"));
		p3 = new JPanel(new GridBagLayout());
		p3.setBackground(Color.decode("#8F0B23"));
		p4 = new JPanel(new GridBagLayout());
		p4.setBackground(Color.decode("#8F0B23"));
		p5 = new JPanel(new GridBagLayout());
		p5.setBackground(Color.decode("#8F0B23"));
		p6 = new JPanel(new GridBagLayout());
		p6.setBackground(Color.decode("#8F0B23"));
		p7 = new JPanel(new GridBagLayout());
		p7.setBackground(Color.decode("#8F0B23"));
	
		
		p5.setBorder(lower);
		//p4.setVisible(false);

		lblTitle = new JLabel("<html><u>--Edit Product--</u></html>",JLabel.CENTER); // create labels used throughout the addRequest GUI
		lblTitle.setFont(new Font("Arial",Font.BOLD,20));
		lblTitle.setForeground(Color.white);
		lblName = new JLabel("Name:",JLabel.LEFT);
		lblName.setForeground(Color.WHITE);
		lblCountry = new JLabel("Country:", JLabel.LEFT);
		lblCountry.setForeground(Color.WHITE);
		lblRegion = new JLabel("Region:", JLabel.LEFT);
		lblRegion.setForeground(Color.WHITE);
		lblGrape = new JLabel("Grape:", JLabel.LEFT);
		lblGrape.setForeground(Color.WHITE);
		lblCost = new JLabel("Cost:", JLabel.LEFT);
		lblCost.setForeground(Color.WHITE);
		lblPrice = new JLabel("Price:", JLabel.LEFT);
		lblPrice.setForeground(Color.WHITE);
		lblUnits = new JLabel("Number of bottles:", JLabel.CENTER);
		lblUnits.setForeground(Color.WHITE);
		lblID = new JLabel("Product ID:", JLabel.LEFT);
		lblID.setForeground(Color.WHITE);
		
		buf = new JLabel("    ");		// empty labels to help with spacing on GridBag
		buf1 = new JLabel("    ");
		buf2 = new JLabel("    ");
		buf3 = new JLabel("    ");
	
		name = new JLabel(); // text fields created
		cost = new JLabel();
		price = new JLabel();
		units = new JLabel();

		
		country = new JLabel(); // Combo box for selection of country
		
		
		region = new JLabel(); // Combo box for selection of region
		
		
		grape = new JLabel(); // Combo box for selection of grape
		
		
		productID = new JComboBox(); // Combo box for selection of grape
		productID.setFont(new Font("Arial", Font.PLAIN,14));
		productID.setBackground(Color.WHITE);
	
		btnReset = new JButton("Reset");
		btnReset.setBackground(Color.white);
		btnReset.addActionListener(this);
		btnDelete = new JButton("Update");
		btnDelete.setBackground(Color.white);
		btnDelete.addActionListener(this);
		btnExit = new JButton("Close");
		btnExit.setBackground(Color.white);
		btnExit.addActionListener(this);
		btnSearch = new JButton("Search");
		btnSearch.setBackground(Color.white);
		btnSearch.addActionListener(this);

		addComp(p1,lblTitle,1,0,1,1,1,0); // Adding components to their panels
		
		addComp(p3,lblID,0,0,1,1,0,0);
		addComp(p3,productID,1,0,3,1,1,0);

		addComp(p2,buf,0,0,1,1,1,0);
		addComp(p2,p3,1,0,4,1,0,0);
		addComp(p2,buf1,5,0,1,1,1,0);
		addComp(p2,btnSearch,1,2,1,1,2,0);
		addComp(p2,btnReset,2,2,1,1,2,0);
		addComp(p2,btnDelete,3,2,1,1,2,0);

		addComp(p5,buf2,0,0,2,1,2,0);
		addComp(p5,p4,2,0,2,1,2,0);
		addComp(p5,buf3,5,0,2,1,2,0);

		addComp(p4,lblName,1,0,1,1,0,0);
		addComp(p4,name,2,0,1,1,0,0);
		
		addComp(p4,lblCountry,1,1,1,1,0,0);
		addComp(p4,country,2,1,1,1,0,0);
		
		addComp(p4,lblRegion,1,2,1,1,0,0);
		addComp(p4,region,2,2,1,1,0,0);
		
		addComp(p4,lblGrape,1,3,1,1,0,0);
		addComp(p4,grape,2,3,1,1,0,0);

		addComp(p6,btnExit,0,0,1,1,1,0);
		
		addComp(cn,p1,0,0,1,1,1,1); // adding panel 1 to the container - Title
		addComp(cn,p2,0,1,1,1,1,1);// adding panel 2 to the container- Buttons - search reset edit
		addComp(cn,p5,0,2,1,1,1,1);// adding panel 4 to container - all product info
		addComp(cn,p6,0,3,1,1,1,1); // adding panel 3 to container exit button
		addComp(cn,p7,0,4,1,1,1,3); // panel to fix resizing 
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// Method used to add component to the container and declare constraints
		private void addComp(Container Con, Component c, int x, int y, int width, int height, int Weightx, int weighty)
		{
			Font all = new Font("Arial", Font.BOLD,16); // Create a font to use as default

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

			// set the font using the default created above
			c.setFont(all); 

			//add the component to the container
			Con.add(c, gc);

		}
}

