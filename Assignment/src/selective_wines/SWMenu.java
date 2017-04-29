package selective_wines;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SWMenu extends JFrame implements ActionListener
{
	
	private JMenuBar jmb;
	private JMenu product,stock,report,system;
	private JMenuItem addProd,editProd,delProd,dispStock,sale, stockRep, salesRep, eSystem;
	private Container cn;
	private JLabel pic;
	private ImageIcon logo = new ImageIcon("resource/logo.jpg"); // create logo for program
	
	Font sml = new Font("Arial", Font.BOLD,16); // create fonts used on the menu form
	Font lrg = new Font("Arial", Font.BOLD,18);
	
	public SWMenu() // menu for constructor
	{
		cn= getContentPane();
		cn.setBackground(Color.WHITE);  // container
		
		jmb = new JMenuBar();
		jmb.setBackground(Color.decode("#8F0B23")); //Menu bar
		
		product = new JMenu("Product"); // menu option
		product.setFont(lrg); //
		product.setBackground(Color.decode("#8F0B23"));
		product.setForeground(Color.white);
		
		stock = new JMenu("Stock"); // stock menu option
		stock.setFont(lrg);
		stock.setBackground(Color.decode("#8F0B23"));
		stock.setForeground(Color.white);
		
		report = new JMenu("Reports"); // reports menu option
		report.setFont(lrg);
		report.setBackground(Color.decode("#8F0B23"));
		report.setForeground(Color.white);
		
		system = new JMenu("System"); // system menu option
		system.setFont(lrg);
		system.setBackground(Color.decode("#8F0B23"));
		system.setForeground(Color.white);
		
		addProd = new JMenuItem("Add Product");  // add product menu option
		addProd.setFont(sml);
		addProd.setBackground(Color.decode("#F9F9F9"));
		addProd.setForeground(Color.BLACK);
		addProd.addActionListener(this);
		product.add(addProd);
		
		editProd = new JMenuItem("Edit Product"); // Edit product menu option
		editProd.setFont(sml);
		editProd.setBackground(Color.decode("#F9F9F9"));
		editProd.setForeground(Color.BLACK);
		editProd.addActionListener(this);
		product.add(editProd);
		
		delProd = new JMenuItem("Delete Product"); // Delete product menu option
		delProd.setFont(sml);
		delProd.setBackground(Color.decode("#F9F9F9"));
		delProd.setForeground(Color.BLACK);
		delProd.addActionListener(this);
		product.add(delProd);
		
		dispStock = new JMenuItem("Display Stock"); // Display Stock menu option
		dispStock.setFont(sml);
		dispStock.setBackground(Color.decode("#F9F9F9"));
		dispStock.setForeground(Color.BLACK);
		dispStock.addActionListener(this);
		stock.add(dispStock);
		
		sale = new JMenuItem("Make Sale"); // make sale menu option
		sale.setFont(sml);
		sale.setBackground(Color.decode("#F9F9F9"));
		sale.setForeground(Color.BLACK);
		sale.addActionListener(this);
		stock.add(sale);
		
		stockRep = new JMenuItem("Stock Report"); // stock report menu option
		stockRep.setFont(sml);
		stockRep.setBackground(Color.decode("#F9F9F9"));
		stockRep.setForeground(Color.BLACK);
		stockRep.addActionListener(this);
		report.add(stockRep);
		
		salesRep = new JMenuItem("Sales Report"); // sales menu option
		salesRep.setFont(sml);
		salesRep.setBackground(Color.decode("#F9F9F9"));
		salesRep.setForeground(Color.BLACK);
		salesRep.addActionListener(this);
		report.add(salesRep);
		
		eSystem = new JMenuItem("Exit");  // exit menu option
		eSystem.setFont(sml);
		eSystem.setBackground(Color.decode("#F9F9F9"));
		eSystem.setForeground(Color.BLACK);
		eSystem.addActionListener(this);
		system.add(eSystem); 
		
		pic = new JLabel(logo); // add logo to the JLable 
		
		cn.add(pic); // add JLabale to the panel
		
		jmb.add(product);  // add menu options to the menu bar
		jmb.add(stock);
		jmb.add(report);
		jmb.add(system);
		
		setJMenuBar(jmb); //set the JMenu to the container
	}

	
	public void actionPerformed(ActionEvent e) // set actions for the menu bar option buttons
	{
		// TODO Auto-generated method stub
		
	}

	
}