package Devices;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VolunteerInfo{

	private static JFrame frmVolunteerinfo;
	private JTextField LastName;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField Minit;
	private JTextField FirstName;
	private JTextField availabilityField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VolunteerInfo window = new VolunteerInfo();
					window.frmVolunteerinfo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VolunteerInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVolunteerinfo = new JFrame();
		frmVolunteerinfo.setTitle("VolunteerInfo");
		frmVolunteerinfo.setBounds(100, 100, 615, 434);
		frmVolunteerinfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVolunteerinfo.getContentPane().setLayout(null);
		
		JLabel Volunteerdetails = new JLabel("Volunteer details");
		Volunteerdetails.setBounds(235, 44, 106, 16);
		frmVolunteerinfo.getContentPane().add(Volunteerdetails);
		
		JLabel LastNameLabel = new JLabel("LastName");
		LastNameLabel.setBounds(62, 91, 62, 16);
		frmVolunteerinfo.getContentPane().add(LastNameLabel);
		
		
		Minit = new JTextField();
		Minit.setBounds(325, 86, 39, 26);
		frmVolunteerinfo.getContentPane().add(Minit);
		Minit.setColumns(10);
		
		JLabel BirthdayLabel_1 = new JLabel("Birthday");
		BirthdayLabel_1.setBounds(62, 134, 61, 16);
		frmVolunteerinfo.getContentPane().add(BirthdayLabel_1);
		
		JLabel EmailLabel_2 = new JLabel("Email");
		EmailLabel_2.setBounds(62, 173, 61, 16);
		frmVolunteerinfo.getContentPane().add(EmailLabel_2);
		
		JLabel PhoneLabel_3 = new JLabel("Phone");
		PhoneLabel_3.setBounds(62, 214, 61, 16);
		frmVolunteerinfo.getContentPane().add(PhoneLabel_3);
		
		JLabel VolunteerIDLabel_4 = new JLabel("VolunteerID");
		VolunteerIDLabel_4.setBounds(62, 256, 77, 16);
		frmVolunteerinfo.getContentPane().add(VolunteerIDLabel_4);
		
		LastName = new JTextField();
		LastName.setBounds(135, 86, 130, 26);
		frmVolunteerinfo.getContentPane().add(LastName);
		LastName.setColumns(10);
		JTextField LastName = new JTextField();
		LastName.addFocusListener(new JTextFieldHintListener(LastName, "why"));
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 129, 130, 26);
		frmVolunteerinfo.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 168, 130, 26);
		frmVolunteerinfo.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(135, 209, 130, 26);
		frmVolunteerinfo.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(135, 251, 130, 26);
		frmVolunteerinfo.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		FirstName = new JTextField();
		FirstName.setBounds(458, 86, 130, 26);
		frmVolunteerinfo.getContentPane().add(FirstName);
		FirstName.setColumns(10);
		
		JLabel MinitLabel = new JLabel("Minit");
		MinitLabel.setBounds(288, 91, 39, 16);
		frmVolunteerinfo.getContentPane().add(MinitLabel);
		
		JLabel FirstNameLabel = new JLabel("FirstName");
		FirstNameLabel.setBounds(390, 91, 77, 16);
		frmVolunteerinfo.getContentPane().add(FirstNameLabel);
		
		JLabel availabilityLabel = new JLabel("availability");
		availabilityLabel.setBounds(62, 298, 77, 16);
		frmVolunteerinfo.getContentPane().add(availabilityLabel);
		
		availabilityField = new JTextField();
		availabilityField.setBounds(135, 293, 130, 26);
		frmVolunteerinfo.getContentPane().add(availabilityField);
		availabilityField.setColumns(10);
		
		JButton GoBackbutton = new JButton("GoBack");
		GoBackbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VolunteerInfo.dispose();
				Consultant nw = new Consultant();
				nw.setVisible(true);
			}
		});
		GoBackbutton.setBounds(148, 347, 117, 29);
		frmVolunteerinfo.getContentPane().add(GoBackbutton);
		
		JButton SubmitButton = new JButton("Submit");
		SubmitButton.setBounds(342, 347, 117, 29);
		frmVolunteerinfo.getContentPane().add(SubmitButton);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frmVolunteerinfo.setVisible(b);
	}
	public static void dispose() {
		// TODO Auto-generated method stub
		frmVolunteerinfo.dispose();
	}
}

