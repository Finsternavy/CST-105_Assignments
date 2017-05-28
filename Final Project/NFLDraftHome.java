package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class NFLDraftHome {

	private JFrame homeScreen;
	PlayerManager myPlayerManager = new PlayerManager();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NFLDraftHome window = new NFLDraftHome();
					window.homeScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NFLDraftHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		homeScreen = new JFrame();
		homeScreen.setBounds(100, 100, 700, 550);
		homeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeScreen.getContentPane().setLayout(null);
		
		//Starts the draft
		JButton btnStartDraft = new JButton("Start Draft");
		btnStartDraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent createPlayers) {
				myPlayerManager.createPlayers();
				homeScreen.dispose();
				NFLDraftBoardOptions rosterOrAvailable = new NFLDraftBoardOptions();
				rosterOrAvailable.setVisible(true);
			}
		});
		btnStartDraft.setBounds(237, 156, 221, 62);
		homeScreen.getContentPane().add(btnStartDraft);
		
		JLabel lblWelcomeToYour = new JLabel("Welcome to your NFL Draft!");
		lblWelcomeToYour.setBounds(275, 11, 206, 62);
		homeScreen.getContentPane().add(lblWelcomeToYour);
	}
}
