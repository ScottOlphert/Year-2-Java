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


public class Edit_Product extends JFrame implements ActionListener{

	private Container cn; 
	private JLabel lblTitle,lblName,lblCountry,lblRegion,lblGrape,lblCost, lblPrice, lblUnits, lblID,
	buf,buf1,buf2,buf3, buf4, buf5, buf6, buf7, buf8, buf9, buf10;
	private JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
	private JTextField name, newCountry, newRegion, newGrape, cost, price, units;
	private JComboBox<?> country, region, grape, productID; 
	private JButton  btnReset, btnEdit, btnExit, btnSearch;
	private JRadioButton red, white, rose;
	private ButtonGroup wineType;
	private TitledBorder title;
	private Border lower = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);

	private  HashMap<String, Product> item = new HashMap<String, Product> (50); // local #map created


	public Edit_Product(HashMap<String, Product> stockItems) // GUI constructor passing in stock #map from SWMenu
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
		p8 = new JPanel(new GridBagLayout());
		p8.setBackground(Color.decode("#8F0B23"));
		p9 = new JPanel(new GridBagLayout());
		p9.setBackground(Color.decode("#8F0B23"));
		p10 = new JPanel(new GridBagLayout());
		p10.setBackground(Color.decode("#8F0B23"));
		p11= new JPanel(new GridBagLayout());
		p11.setBackground(Color.decode("#8F0B23"));
		
		p4.setBorder(lower);
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
		buf4 = new JLabel("    ");
		buf5 = new JLabel("    ");
		//buf5.setVisible(false); // needed only when new country visible
		buf6 = new JLabel("    ");
		//buf6.setVisible(false); // needed only when new region visible
		buf7 = new JLabel("    ");
		buf8 = new JLabel("    ");
		buf9 = new JLabel("    ");
		buf10 = new JLabel("    ");

		name = new JTextField(); // text fields created
		cost = new JTextField();
		price = new JTextField();
		units = new JTextField();
		newCountry = new JTextField();
		newRegion = new JTextField();
		newGrape = new JTextField();
		
		//newCountry.setVisible(false); // fields will only be available when user needs to add a new options to the available combo boxes
		//newRegion.setVisible(false);
		//newGrape.setVisible(false);
		
		red = new JRadioButton("Red");
		red.setFont(new Font("Arial", Font.BOLD,16));  // initialising jRadio Buttons
		red.setBackground(Color.decode("#8F0B23"));
		red.setForeground(Color.WHITE);
		red.addActionListener(this);

		white = new JRadioButton("White");
		white.setFont(new Font("Arial", Font.BOLD,16));
		white.setBackground(Color.decode("#8F0B23"));
		white.setForeground(Color.WHITE);
		white.addActionListener(this);

		rose = new JRadioButton("Rose");
		rose.setFont(new Font("Arial", Font.BOLD,16));
		rose.setBackground(Color.decode("#8F0B23"));
		rose.setForeground(Color.WHITE);
		rose.addActionListener(this);

		// create button group
		wineType = new ButtonGroup();
		wineType.add(red);
		wineType.add(white);
		wineType.add(rose);

		title = BorderFactory.createTitledBorder("Wine Type");  // setting border, title and panel to hold jRadioButtons
		title.setTitleJustification(TitledBorder.LEFT);
		title.setTitleColor(Color.WHITE);
		title.setTitleFont(new Font("Arial", Font.BOLD,16));
		p5.setBorder(title); 
		
		country = new JComboBox(); // Combo box for selection of country
		country.setFont(new Font("Arial", Font.PLAIN,14));
		country.setBackground(Color.WHITE);
		
		region = new JComboBox(); // Combo box for selection of region
		region.setFont(new Font("Arial", Font.PLAIN,14));
		region.setBackground(Color.WHITE);
		
		grape = new JComboBox(); // Combo box for selection of grape
		grape.setFont(new Font("Arial", Font.PLAIN,14));
		grape.setBackground(Color.WHITE);
		
		productID = new JComboBox(); // Combo box for selection of grape
		productID.setFont(new Font("Arial", Font.PLAIN,14));
		productID.setBackground(Color.WHITE);
	
		btnReset = new JButton("Reset");
		btnReset.setBackground(Color.white);
		btnReset.addActionListener(this);
		btnEdit = new JButton("Update");
		btnEdit.setBackground(Color.white);
		btnEdit.addActionListener(this);
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
		addComp(p2,btnEdit,3,2,1,1,2,0);

		addComp(p5,red,0,0,1,1,0,0);
		addComp(p5,white,0,1,1,1,0,0);
		addComp(p5,rose,0,2,1,1,0,0);

		addComp(p6,buf,0,0,2,1,2,0);
		addComp(p6,p7,2,0,2,1,2,0);
		addComp(p6, p8,4,0,1,1,1,0);
		addComp(p6,buf1,5,0,2,1,2,0);
		
		addComp(p9,lblUnits,2,0,1,1,0,0);
		addComp(p9,units,2,1,1,1,0,0);
		addComp(p9,buf8,0,0,2,1,1,0);
		addComp(p9,buf9,3,0,2,1,1,0);
		addComp(p9,buf10,0,2,5,1,1,0);
		
		addComp(p7,lblName,1,0,1,1,0,0);
		addComp(p7,name,1,1,3,1,2,0);
		addComp(p7,lblCountry,1,2,1,1,0,0);
		addComp(p7,country,1,3,3,1,2,0);
		addComp(p7,newCountry,1,4,3,1,2,0);
		addComp(p7,lblRegion,1,5,1,1,0,0);
		addComp(p7,region,1,6,3,1,2,0);
		addComp(p7,newRegion,1,7,3,1,2,0);
		addComp(p7,lblGrape,1,8,1,1,0,0);
		addComp(p7,grape,1,9,3,1,1,0);
		addComp(p7,newGrape,1,10,3,1,2,0);
		
		addComp(p8,p5,0,0,1,4,0,0);
		addComp(p8,buf5,0,4,1,1,1,1);
		addComp(p8,lblCost,0,5,1,1,0,0);
		addComp(p8,cost,0,6,1,1,0,0);
		addComp(p8,buf6,0,7,1,1,1,1);
		addComp(p8,lblPrice,0,8,1,1,0,0);
		addComp(p8,price,0,9,1,1,0,0);
		addComp(p8,buf7,0,10,1,1,1,1);

		addComp(p10,btnExit,0,0,1,1,1,0);
	
		addComp(p4,p6,0,0,1,1,1,1);
		addComp(p4,p9,0,1,1,1,1,1);
		
		addComp(cn,p1,0,0,1,1,1,1); // adding panel 1 to the container - Title
		addComp(cn,p2,0,1,1,1,1,1);// adding panel 2 to the container- Buttons - search reset edit
		addComp(cn,p4,0,2,1,1,1,1);// adding panel 4 to container - all product info
		addComp(cn,p10,0,3,1,1,1,1); // adding panel 3 to container exit button
		addComp(cn,p11,0,4,1,1,1,3); // panel to fix resizing 
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

