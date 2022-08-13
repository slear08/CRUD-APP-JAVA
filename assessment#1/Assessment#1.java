import java.awt.BorderLayout;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class main extends JFrame {
	
	private Image p1 = new ImageIcon(main.class.getResource("assets/Milktea.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p2 = new ImageIcon(main.class.getResource("assets/Softdrinks.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p3 = new ImageIcon(main.class.getResource("assets/Juice.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p4 = new ImageIcon(main.class.getResource("assets/Donuts.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p5 = new ImageIcon(main.class.getResource("assets/Fries.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p6 = new ImageIcon(main.class.getResource("assets/Pizza.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p7 = new ImageIcon(main.class.getResource("assets/coffee.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p8 = new ImageIcon(main.class.getResource("assets/IceCream.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p9 = new ImageIcon(main.class.getResource("assets/Sandwich.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p10 = new ImageIcon(main.class.getResource("assets/Cookies.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p11 = new ImageIcon(main.class.getResource("assets/Chicken.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);
	private Image p12 = new ImageIcon(main.class.getResource("assets/beer.png")).getImage().getScaledInstance(108, 107, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 629);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 133, 63));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel product1 = new JLabel("");
		product1.setBounds(10, 11, 108, 107);
		productsPanel.add(product1);
		
		JLabel product2 = new JLabel("New label");
		product2.setBounds(135, 11, 108, 107);
		productsPanel.add(product2);
		
		JLabel product3 = new JLabel("New label");
		product3.setBounds(262, 11, 108, 107);
		productsPanel.add(product3);
		
		JLabel product4 = new JLabel("New label");
		product4.setBounds(10, 129, 108, 107);
		productsPanel.add(product4);
		
		JLabel product5 = new JLabel("New label");
		product5.setBounds(135, 129, 108, 107);
		productsPanel.add(product5);
		
		JLabel product6 = new JLabel("New label");
		product6.setBounds(262, 129, 108, 107);
		productsPanel.add(product6);
		
		JLabel product7 = new JLabel("New label");
		product7.setBounds(10, 249, 108, 107);
		productsPanel.add(product7);
		
		JLabel product8 = new JLabel("New label");
		product8.setBounds(135, 249, 108, 107);
		productsPanel.add(product8);
		
		JLabel product9 = new JLabel("New label");
		product9.setBounds(262, 249, 108, 107);
		productsPanel.add(product9);
		
		JLabel product10 = new JLabel("New label");
		product10.setBounds(10, 367, 108, 107);
		productsPanel.add(product10);
		
		JLabel product11 = new JLabel("New label");
		product11.setBounds(135, 367, 108, 107);
		productsPanel.add(product11);
		
		JLabel product12 = new JLabel("New label");
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
				"Product No.", "Product Name", "Quantity", "Price", "Total"
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
		
		JLabel lblNewLabel_1 = new JLabel("--.--");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 11, 140, 10);
		panel_1.add(lblNewLabel_1);
		
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
		
	
	}
}
