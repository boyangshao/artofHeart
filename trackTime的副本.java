package Devices;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class trackTime {

	private static JFrame frmWorks_On;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trackTime window = new trackTime();
					window.frmWorks_On.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public trackTime() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWorks_On = new JFrame();
		frmWorks_On.setTitle("Works_On");
		frmWorks_On.setBounds(100, 100, 452, 349);
		frmWorks_On.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWorks_On.getContentPane().setLayout(null);
		
		JLabel VolunteerNameLabel = new JLabel("Volunteer Name");
		VolunteerNameLabel.setBounds(32, 41, 100, 16);
		frmWorks_On.getContentPane().add(VolunteerNameLabel);
		
		textField = new JTextField();
		textField.setBounds(154, 36, 149, 26);
		frmWorks_On.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel ProjectLabel = new JLabel("Project Work On");
		ProjectLabel.setBounds(32, 84, 105, 16);
		frmWorks_On.getContentPane().add(ProjectLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 79, 149, 26);
		frmWorks_On.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel StartDateLabel = new JLabel("Start Date");
		StartDateLabel.setBounds(32, 124, 69, 16);
		frmWorks_On.getContentPane().add(StartDateLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(154, 119, 149, 26);
		frmWorks_On.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel EndDateLabel = new JLabel("End Date");
		EndDateLabel.setBounds(32, 168, 61, 16);
		frmWorks_On.getContentPane().add(EndDateLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(154, 163, 149, 26);
		frmWorks_On.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel NumberofhoursLabel = new JLabel("Number of hours");
		NumberofhoursLabel.setBounds(32, 209, 110, 21);
		frmWorks_On.getContentPane().add(NumberofhoursLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(154, 204, 149, 26);
		frmWorks_On.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton SubmitButton = new JButton("Submit");
		SubmitButton.setBounds(277, 259, 117, 29);
		frmWorks_On.getContentPane().add(SubmitButton);
		
		JButton goBackButton = new JButton("goBack");
		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trackTime.dispose();
				Consultant nw = new Consultant();
				nw.setVisible(true);
			}
		});
		goBackButton.setBounds(86, 259, 117, 29);
		frmWorks_On.getContentPane().add(goBackButton);
	}
	public static void dispose() {
		// TODO Auto-generated method stub
		frmWorks_On.dispose();
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frmWorks_On.setVisible(b);
	}
}
