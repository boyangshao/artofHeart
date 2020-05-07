package Devices;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class artOfHeart {

	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					artOfHeart window = new artOfHeart();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public artOfHeart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(16, 214, 117, 29);
		frmLogin.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Uers Name");
		lblNewLabel.setBounds(16, 154, 78, 16);
		frmLogin.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(92, 149, 130, 26);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(16, 186, 61, 16);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(92, 182, 130, 26);
		frmLogin.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("ART WITH HEART'");
		lblNewLabel_2.setBounds(170, 24, 136, 16);
		frmLogin.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("VOLUNTEERS MANAGEMENT SYSTEM");
		lblNewLabel_3.setBounds(110, 52, 271, 16);
		frmLogin.getContentPane().add(lblNewLabel_3);
		Image img = new ImageIcon(this.getClass().getResource("/屏幕快照.jpg")).getImage();
		
	}
}
