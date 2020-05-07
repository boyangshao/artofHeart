package Devices;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Consultant {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultant window = new Consultant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Consultant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 724, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(75, 82, 586, 374);
		frame.getContentPane().add(tabbedPane);
		
		JPanel Volunteer = new JPanel();
		tabbedPane.addTab("volunteer", null, Volunteer, null);
		Volunteer.setLayout(null);
		
		JButton SelectVolunteer = new JButton("Select Volunteer");
		SelectVolunteer.setBounds(37, 16, 145, 29);
		Volunteer.add(SelectVolunteer);
		
		table = new JTable();
		table.setBounds(194, 33, 336, 258);
		Volunteer.add(table);
		
		JButton AddNewVolunteer = new JButton("Add New Volunteer");
		AddNewVolunteer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VolunteerInfo nw = new VolunteerInfo();
				nw.setVisible(true);	
			}
		});
		AddNewVolunteer.setBounds(37, 69, 145, 29);
		Volunteer.add(AddNewVolunteer);
		
		JButton Works_OnButton = new JButton("Works_On");
		Works_OnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trackTime tt = new trackTime();
				tt.setVisible(true);
			}
		});
		Works_OnButton.setBounds(37, 122, 145, 29);
		Volunteer.add(Works_OnButton);
		
		JButton AvailabilityButton = new JButton("Availability");
		AvailabilityButton.setBounds(37, 176, 145, 29);
		Volunteer.add(AvailabilityButton);
		
		JButton Volunteers_AtButton = new JButton("Volunteers_At");
		Volunteers_AtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Volunteers_AtButton.setBounds(37, 229, 145, 29);
		Volunteer.add(Volunteers_AtButton);
		
		JButton Volunteer_GroupButton = new JButton("Volunteer_Group");
		Volunteer_GroupButton.setBounds(37, 281, 145, 29);
		Volunteer.add(Volunteer_GroupButton);
		
		JPanel Project = new JPanel();
		tabbedPane.addTab("Project", null, Project, null);
		Project.setLayout(null);
		
		JButton ProjectsButton = new JButton("Projects");
		ProjectsButton.setBounds(29, 45, 117, 29);
		Project.add(ProjectsButton);
		
		table_2 = new JTable();
		table_2.setBounds(186, 40, 336, 248);
		Project.add(table_2);
		
		JPanel Location = new JPanel();
		tabbedPane.addTab("Location", null, Location, null);
		Location.setLayout(null);
		
		JButton ClassesButton = new JButton("Classes");
		ClassesButton.setBounds(23, 55, 117, 29);
		Location.add(ClassesButton);
		
		JButton EventsButton_1 = new JButton("Events");
		EventsButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		EventsButton_1.setBounds(23, 115, 117, 29);
		Location.add(EventsButton_1);
		
		JButton PublicArtButton_2 = new JButton("Public Art");
		PublicArtButton_2.setBounds(23, 176, 117, 29);
		Location.add(PublicArtButton_2);
		
		JButton StoresButton_3 = new JButton("Stores");
		StoresButton_3.setBounds(23, 235, 117, 29);
		Location.add(StoresButton_3);
		
		table_1 = new JTable();
		table_1.setBounds(181, 33, 351, 254);
		Location.add(table_1);
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}
}
