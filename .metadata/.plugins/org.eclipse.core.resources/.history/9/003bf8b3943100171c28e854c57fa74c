package selective_wines;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.*;
import javax.swing.border.*;

public class Add_Product extends JFrame implements ActionListener, MouseListener {

	private Container cn; 
	private JLabel lblTitle,lblName,lblCountry,lblRegion,lblGrape,lblCost, lblPrice, lblUnits,
	buf,buf1,buf2,buf3, buf4;
	private JPanel p1, p2, p3, p4, p5;
	private JTextField name, cost, price, units;
	private JComboBox<?> country, region, grape; 
	private JButton btnReset, btnAdd, btnExit;
	private JRadioButton red, white, rose;
	private ButtonGroup wineType;
	private TitledBorder title;

	private  HashMap<String, Product> item = new HashMap<String, Product> (50); // local #map created


	public Add_Product(HashMap<String, Product> stockItems) // GUI constructor passing in stock #map from SWMenu
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

		
		/*this.productID = productID;
		this.name = name;
		this.colour = colour;
		this.reigon = reigon;
		this.country = country;
		this.grape = grape;
		this.noSold = noSold;.
		this.stockLevel = stockLevel;
		this.cost = cost;
		this.sellingPrice = sellingPrice;*/


		lblTitle = new JLabel("<html><u>--Add Product--</u></html>",JLabel.CENTER); // create labels used throughout the addRequest GUI
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
		lblPrice.setForeground(Color.WHITE);
		lblPrice = new JLabel("Price:", JLabel.LEFT);
		lblUnits.setForeground(Color.WHITE);
		lblUnits = new JLabel("Number of bottles:", JLabel.LEFT);
		
		buf = new JLabel("    ");		// empty labels to help with spacing on GridBag
		buf1 = new JLabel("    ");
		buf2 = new JLabel("    ");
		buf3 = new JLabel("    ");
		buf4 = new JLabel("    ");

		name = new JTextField(); // text fields created
		cost = new JTextField();
		price = new JTextField();
		units = new JTextField();
		
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
		
		country = new JComboBox();
		country.setFont(new Font("Arial", Font.PLAIN,14));
		country.setBackground(Color.WHITE);
		
		region = new JComboBox();
		region.setFont(new Font("Arial", Font.PLAIN,14));
		region.setBackground(Color.WHITE);
		
		grape = new JComboBox();
		grape.setFont(new Font("Arial", Font.PLAIN,14));
		grape.setBackground(Color.WHITE);
		

		btnReset = new JButton("Clear");  // create buttons for GUI
		btnReset.setBackground(Color.white);
		btnReset.addActionListener(this);
		btnAdd = new JButton("Submit");
		btnAdd.setBackground(Color.white);
		btnAdd.addActionListener(this);
		btnExit = new JButton("Close");
		btnExit.setBackground(Color.white);
		btnExit.addActionListener(this);

		addComp(p1,lblTitle,1,0,1,1,1,0); // Adding components to their panels

		addComp(p5,red,0,0,1,1,0,1);
		addComp(p5,white,0,1,1,1,0,1);
		addComp(p5,rose,0,2,1,1,0,1);

		addComp(p2,buf,0,0,1,1,1,0);
		addComp(p2,lblName,1,0,1,1,0,0);
		addComp(p2, p5,4,1,1,5,0,0);
		addComp(p2,buf1,5,0,1,1,1,0);
		addComp(p2,name,1,1,3,1,2,0);
		addComp(p2,lblEmail,1,2,1,1,0,0);
		addComp(p2,email,1,3,3,1,2,0);
		addComp(p2,lblTelNo,1,4,1,1,0,0);
		addComp(p2,telNo,1,5,3,1,2,0);
		addComp(p2,lblDate,1,6,1,1,0,0);
		addComp(p2,month,1,7,2,1,1,0);
		addComp(p2,day,3,7,1,1,1,0);
		addComp(p2,year,4,7,1,1,1,0);
		addComp(p2,lblReq,1,8,1,1,0,0);
		addComp(p2,ticketNo,1,9,2,1,1,0);
		addComp(p2,btnReset,1,10,1,1,1,0);
		addComp(p2,btnAdd,4,10,1,1,1,0);

		addComp(p3,buf2,0,0,1,1,1,0);
		addComp(p3,btnExit,1,0,3,1,2,0);
		addComp(p3,buf3,4,0,1,1,1,0);
		addComp(p3,buf4,0,1,5,1,2,1);

		addComp(cn,p1,0,0,1,1,1,1); // adding panels to the container
		addComp(cn,p2,0,1,1,1,1,1);
		addComp(cn,p3,0,2,1,1,1,1);
		addComp(cn,p4,0,3,1,1,1,3);
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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