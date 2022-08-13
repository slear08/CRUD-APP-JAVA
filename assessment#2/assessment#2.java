import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class mainPanel extends JFrame {
	
	private Image p1 = new ImageIcon(mainPanel.class.getResource("assets/Milktea.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p2 = new ImageIcon(mainPanel.class.getResource("assets/Softdrinks.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p3 = new ImageIcon(mainPanel.class.getResource("assets/Juice.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p4 = new ImageIcon(mainPanel.class.getResource("assets/Donuts.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p5 = new ImageIcon(mainPanel.class.getResource("assets/Fries.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p6 = new ImageIcon(mainPanel.class.getResource("assets/Pizza.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p7 = new ImageIcon(mainPanel.class.getResource("assets/coffee.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p8 = new ImageIcon(mainPanel.class.getResource("assets/IceCream.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p9 = new ImageIcon(mainPanel.class.getResource("assets/Sandwich.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p10 = new ImageIcon(mainPanel.class.getResource("assets/Cookies.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p11 = new ImageIcon(mainPanel.class.getResource("assets/Chicken.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p12 = new ImageIcon(mainPanel.class.getResource("assets/beer.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTable table;
	private JLabel totalDisplay;
	private JLabel product1;
	private JLabel product2;
	private JLabel product3;
	private JLabel product4;
	private JLabel product5;
	private JLabel product6;
	private JLabel product7;
	private JLabel product8;
	private JLabel product9;
	private JLabel product10;
	private JLabel product11;
	private JLabel product12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPanel frame = new mainPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 629);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 133, 63));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 813, 45);
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel title = new JLabel("INDAY ONLINE SARI-SARI STORE");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setForeground(new Color(255, 255, 255));
		title.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		title.setBounds(259, 11, 277, 23);
		panel.add(title);
		
		JPanel productsPanel = new JPanel();
		productsPanel.setBorder(new LineBorder(Color.DARK_GRAY, 4, true));
		productsPanel.setBounds(10, 56, 379, 480);
		productsPanel.setBackground(Color.GRAY);
		contentPane.add(productsPanel);
		productsPanel.setLayout(null);
		
		product1 = new JLabel("");
		product1.setBounds(10, 11, 108, 107);
		productsPanel.add(product1);
		
		product2 = new JLabel("New label");
		product2.setBounds(135, 11, 108, 107);
		productsPanel.add(product2);
		
		product3 = new JLabel("New label");
		product3.setBounds(262, 11, 108, 107);
		productsPanel.add(product3);
		
		product4 = new JLabel("New label");
		product4.setBounds(10, 129, 108, 107);
		productsPanel.add(product4);
		
		product5 = new JLabel("New label");
		product5.setBounds(135, 129, 108, 107);
		productsPanel.add(product5);
		
		product6 = new JLabel("New label");
		product6.setBounds(262, 129, 108, 107);
		productsPanel.add(product6);
		
		product7 = new JLabel("New label");
		product7.setBounds(10, 249, 108, 107);
		productsPanel.add(product7);
		
		product8 = new JLabel("New label");
		product8.setBounds(135, 249, 108, 107);
		productsPanel.add(product8);
		
		product9 = new JLabel("New label");
		product9.setBounds(262, 249, 108, 107);
		productsPanel.add(product9);
		
		product10 = new JLabel("New label");
		product10.setBounds(10, 367, 108, 107);
		productsPanel.add(product10);
		
		product11 = new JLabel("New label");
		product11.setBounds(135, 367, 108, 107);
		productsPanel.add(product11);
		
		product12 = new JLabel("New label");
		product12.setBounds(262, 367, 108, 107);
		productsPanel.add(product12);
		
		JPanel cartPanel = new JPanel();
		cartPanel.setBorder(new LineBorder(Color.DARK_GRAY, 4, true));
		cartPanel.setBackground(Color.GRAY);
		cartPanel.setBounds(399, 56, 404, 501);
		contentPane.add(cartPanel);
		cartPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 384, 374);
		cartPanel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Product No.", "P. Name", "Quantity", "Price", "Total"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		scrollPane.setViewportView(table);
		
		JButton removeItem = new JButton("CLEAR ORDERS");
		removeItem.setBounds(10, 392, 132, 32);
		cartPanel.add(removeItem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(234, 415, 160, 32);
		cartPanel.add(panel_1);
		panel_1.setLayout(null);
		
		totalDisplay = new JLabel("0");
		totalDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		totalDisplay.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		totalDisplay.setBounds(10, 11, 140, 10);
		panel_1.add(totalDisplay);
		
		JButton pay = new JButton("PAY");
		pay.setBounds(266, 458, 102, 32);
		cartPanel.add(pay);
		
		JLabel lblNewLabel = new JLabel("TOTAL AMOUNT:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel.setBounds(234, 392, 160, 21);
		cartPanel.add(lblNewLabel);
		
		
		setTitle("INDAY SARI-SARI STORE");
		
	
		//ItemEvent Images
		
		product1.setIcon(new ImageIcon(p1));
		product2.setIcon(new ImageIcon(p2));
		product3.setIcon(new ImageIcon(p3));
		product4.setIcon(new ImageIcon(p4));
		product5.setIcon(new ImageIcon(p5));
		product6.setIcon(new ImageIcon(p6)); 
		product7.setIcon(new ImageIcon(p7));
		product8.setIcon(new ImageIcon(p8));
		product9.setIcon(new ImageIcon(p9));
		product10.setIcon(new ImageIcon(p10));
		product11.setIcon(new ImageIcon(p11));
		product12.setIcon(new ImageIcon(p12));
		
		
		//EventListener

		product1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product1.isEnabled()){
					try {
						String data1 = "61613";
					    String data2 = "MILK TEA";
					    
					    int data4 = 65;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					    
					    int data5 = data4 * Integer.parseInt(value);
					    product1.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p1 = new ImageIcon(mainPanel.class.getResource("assets/Milktea.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product1.setIcon(new ImageIcon(p1));
				product1.setBounds(10, 11, 151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p1 = new ImageIcon(mainPanel.class.getResource("assets/Milktea.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product1.setIcon(new ImageIcon(p1));
				product1.setBounds(10, 11, 108, 107);
			}
		});
		product2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product2.isEnabled()){
					try {
						String data1 = "23568";
					    String data2 = "SOFTDRNKS";
					    
					    int data4 = 15;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					    
					    int data5 = data4 * Integer.parseInt(value);
					    product2.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p2 = new ImageIcon(mainPanel.class.getResource("assets/Softdrinks.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product2.setIcon(new ImageIcon(p2));
				product2.setBounds(120, 11, 151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p2 = new ImageIcon(mainPanel.class.getResource("assets/Softdrinks.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product2.setIcon(new ImageIcon(p2));
				product2.setBounds(135, 11, 108, 107);
			}
		});
		product3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product3.isEnabled()){
					try {
						String data1 = "54681";
					    String data2 = "JUICE";
					    
					    int data4 = 25;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					    
					    int data5 = data4 * Integer.parseInt(value);
					    product3.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p3 = new ImageIcon(mainPanel.class.getResource("assets/Juice.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product3.setIcon(new ImageIcon(p3));
				product3.setBounds(230, 11, 151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p3 = new ImageIcon(mainPanel.class.getResource("assets/Juice.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product3.setIcon(new ImageIcon(p3));
				product3.setBounds(262, 11, 108, 107);
			}
		});
		product4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product4.isEnabled()){
					try {
						String data1 = "87495";
					    String data2 = "DONUT";
					    int data4 = 25;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					    
					    int data5 = data4 * Integer.parseInt(value);
					    product4.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
						
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p4 = new ImageIcon(mainPanel.class.getResource("assets/Donuts.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product4.setIcon(new ImageIcon(p4));
				product4.setBounds(10, 129, 151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p4 = new ImageIcon(mainPanel.class.getResource("assets/Donuts.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product4.setIcon(new ImageIcon(p4));
				product4.setBounds(10, 129, 108, 107);
			}
		});
		product5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product5.isEnabled()){
					try {
						String data1 = "16465";
					    String data2 = "FRIES";
					    int data4 = 35;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					    
					    	
					    int data5 = data4 * Integer.parseInt(value);
					    product5.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
						
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p5 = new ImageIcon(mainPanel.class.getResource("assets/Fries.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product5.setIcon(new ImageIcon(p5));
				product5.setBounds(120, 129, 151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p5 = new ImageIcon(mainPanel.class.getResource("assets/Fries.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product5.setIcon(new ImageIcon(p5));
				product5.setBounds(135, 129, 108, 107);
			}
		});
		product6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product6.isEnabled()){
					try {
						String data1 = "19656";
					    String data2 = "PIZZA";
					    int data4 = 45;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					    
					    	
					    int data5 = data4 * Integer.parseInt(value);
					    product6.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
						
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p6 = new ImageIcon(mainPanel.class.getResource("assets/Pizza.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product6.setIcon(new ImageIcon(p6));
				product6.setBounds(225, 129, 151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p6 = new ImageIcon(mainPanel.class.getResource("assets/Pizza.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product6.setIcon(new ImageIcon(p6));
				product6.setBounds(262, 129, 108, 107);
			}
		});	
		product7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product7.isEnabled()){
					try {
						String data1 = "51565";
					    String data2 = "COFFEE";
					    int data4 = 50;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					    
					    	
					    int data5 = data4 * Integer.parseInt(value);
					    product7.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
						
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p7 = new ImageIcon(mainPanel.class.getResource("assets/coffee.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product7.setIcon(new ImageIcon(p7));
				product7.setBounds(10, 250,151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p7 = new ImageIcon(mainPanel.class.getResource("assets/coffee.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product7.setIcon(new ImageIcon(p7));
				product7.setBounds(10, 249, 108, 107);
			}
		});	
		product8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product8.isEnabled()){
					try {
						String data1 = "48467";
					    String data2 = "ICE CREAM";
					    int data4 = 15;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					    
					    	
					    int data5 = data4 * Integer.parseInt(value);
					    product8.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
						
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p8 = new ImageIcon(mainPanel.class.getResource("assets/IceCream.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product8.setIcon(new ImageIcon(p8));
				product8.setBounds(120, 249, 151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p8 = new ImageIcon(mainPanel.class.getResource("assets/IceCream.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product8.setIcon(new ImageIcon(p8));
				product8.setBounds(135, 249, 108, 107);
			}
		});	
		product9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product9.isEnabled()){
					try {
						String data1 = "65416";
					    String data2 = "SANDWICH";
					    int data4 = 30;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					    
					    	
					    int data5 = data4 * Integer.parseInt(value);
					    product9.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
						
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p9 = new ImageIcon(mainPanel.class.getResource("assets/Sandwich.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product9.setIcon(new ImageIcon(p9));
				product9.setBounds(240, 249, 151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p9 = new ImageIcon(mainPanel.class.getResource("assets/Sandwich.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product9.setIcon(new ImageIcon(p9));
				product9.setBounds(262, 249, 108, 107);
			}
		});	
		product10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product10.isEnabled()){
					try {
						String data1 = "78912";
					    String data2 = "COOKIES";
					    int data4 = 50;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					    
					    	
					    int data5 = data4 * Integer.parseInt(value);
					    product10.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
						
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p10 = new ImageIcon(mainPanel.class.getResource("assets/Cookies.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product10.setIcon(new ImageIcon(p10));
				product10.setBounds(10, 355, 151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p10 = new ImageIcon(mainPanel.class.getResource("assets/Cookies.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product10.setIcon(new ImageIcon(p10));
				product10.setBounds(10, 367, 108, 107);
			}
		});	
		product11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product11.isEnabled()){
					try {
						String data1 = "89716";
					    String data2 = "CHICKEN";
					    int data4 = 65;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					    
					    	
					    int data5 = data4 * Integer.parseInt(value);
					    product11.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
						
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p11 = new ImageIcon(mainPanel.class.getResource("assets/Chicken.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product11.setIcon(new ImageIcon(p11));
				product11.setBounds(120, 350,151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p11 = new ImageIcon(mainPanel.class.getResource("assets/Chicken.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product11.setIcon(new ImageIcon(p11));
				product11.setBounds(135, 367, 108, 107);
			}
		});	
		product12.addMouseListener(new MouseAdapter() {

			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(product12.isEnabled()){
					try {
						String data1 = "38456";
					    String data2 = "BEER";
					    int data4 = 85;
					    String value = JOptionPane.showInputDialog("ENTER QUANTITY\n"+"PRODUCT: "+data2+"\n"+"PRICE: "+data4,"Enter Quantity");
					    String data3 = value;
					 
					    int data5 = data4 * Integer.parseInt(value);
					    product12.setEnabled(false);
					    
						Object[] row = { data1, data2, data3, data4,data5 };

					    DefaultTableModel model = (DefaultTableModel) table.getModel();

					    model.addRow(row);
					    getTotal();
					} catch (Exception e2) {
						
					}
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Image p12 = new ImageIcon(mainPanel.class.getResource("assets/beer.png")).getImage().getScaledInstance(151, 150, Image.SCALE_SMOOTH);
				product12.setIcon(new ImageIcon(p12));
				product12.setBounds(240, 330,151, 150);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Image p12 = new ImageIcon(mainPanel.class.getResource("assets/beer.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
				product12.setIcon(new ImageIcon(p12));
				product12.setBounds(262, 367, 108, 107);
			}
		});	
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int index = table.getSelectedRow();
				int prevTotal = Integer.parseInt(totalDisplay.getText());
				
				TableModel model1 = table.getModel();

				
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to remove this to your cart?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					
					int price = Integer.parseInt(model1.getValueAt(index, 4).toString());
					prevTotal -= price;
					
					String uptotal = Integer.toString(prevTotal);
					
					totalDisplay.setText(uptotal);
					
					int row = table.getSelectedRow();
					
					String productID ="";
					for(int i=0; i<table.getRowCount();i++) {
						productID = table.getValueAt(i,0).toString();
						
					}
					switch (productID) {
					case "61613":
						model.removeRow(row);
						product1.setEnabled(true);
						break;
					case "23568":
						model.removeRow(row);
						product2.setEnabled(true);
						break;
					case "54681":
						model.removeRow(row);
						product3.setEnabled(true);
						break;
					case "87495":
						model.removeRow(row);
						product4.setEnabled(true);
						break;
					case "16465":
						model.removeRow(row);
						product5.setEnabled(true);
						break;
					case "19656":
						model.removeRow(row);
						product6.setEnabled(true);
						break;
					case "51565":
						model.removeRow(row);
						product7.setEnabled(true);
						break;
					case "48467":
						model.removeRow(row);
						product8.setEnabled(true);
						break;
					case "65416":
						model.removeRow(row);
						product9.setEnabled(true);
						break;
					case "78912":
						model.removeRow(row);
						product10.setEnabled(true);
						break;
					case "89716":
						model.removeRow(row);
						product11.setEnabled(true);
						break;
					case "38456":
						model.removeRow(row);
						product12.setEnabled(true);
						break;
					default:
						break;
				}
					
				}
				
			}
		});

		removeItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to clear your cart?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) {
					resetTable();
				}
				
			}
		});
		pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(totalDisplay.getText()=="0") {
						JOptionPane.showMessageDialog(null, "NO ORDER");
					}else {
						if(JOptionPane.showConfirmDialog(null,"Are you sure you want to pay your order(s)?", "Confirmation", JOptionPane.YES_NO_OPTION)==0) { 
							String totalAmount = totalDisplay.getText();
							
							String value = JOptionPane.showInputDialog("\tEnter your payment:\n"+"TOTAL AMOUNT: "+totalAmount,"ENTER HERE..");
						   
						 
						    int change =  Integer.parseInt(value) - Integer.parseInt(totalAmount);
						    if(Integer.parseInt(value)>Integer.parseInt(totalAmount)) {
						    	JOptionPane.showConfirmDialog(null,"Your change is " +change+"\n\tTHANK YOU HAVE A GREAT DAY!", "THANK YOU", JOptionPane.CLOSED_OPTION);
						    	resetTable();
						    }else if(change==0) {
						    	JOptionPane.showConfirmDialog(null,"THANK YOU HAVE A GREAT DAY!", "THANK YOU", JOptionPane.CLOSED_OPTION);
						    	resetTable();
						    }else {
						    	JOptionPane.showMessageDialog(null, "PLEASE PAY THE TOTAL AMOUNT","YOU DIDN't PAY ENOUGH!!",JOptionPane.WARNING_MESSAGE);
						    }
					}
				}
			}		
		});
	}
	void resetTable() {
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		product1.setEnabled(true);
		product2.setEnabled(true);
		product3.setEnabled(true);
		product4.setEnabled(true);
		product5.setEnabled(true);
		product6.setEnabled(true);
		product7.setEnabled(true);
		product8.setEnabled(true);
		product9.setEnabled(true);
		product10.setEnabled(true);
		product11.setEnabled(true);
		product12.setEnabled(true);
		model.setRowCount(0);
			
		totalDisplay.setText("0");
			
		
	}
	void getTotal(){
		int sum = 0;
		for(int i=0; i<table.getRowCount();i++) {
			int itemTotal = Integer.parseInt(table.getValueAt(i,4).toString());
	
			sum += itemTotal;
		}
		totalDisplay.setText(Integer.toString(sum));
	}
}
