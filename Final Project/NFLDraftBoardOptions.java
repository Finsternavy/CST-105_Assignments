package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class NFLDraftBoardOptions extends JFrame {

	private JPanel NFLDraftBoardOptions;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NFLDraftBoardOptions frame = new NFLDraftBoardOptions();
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
	public NFLDraftBoardOptions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		NFLDraftBoardOptions = new JPanel();
		NFLDraftBoardOptions.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(NFLDraftBoardOptions);
		NFLDraftBoardOptions.setLayout(null);
		
		JButton btnDraftBoard = new JButton("My Draft Board");
		btnDraftBoard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent myDraftBoard) {
				NFLDraftBoardOptions.setVisible(false);
				NFLDraftBoard draftBoard = new NFLDraftBoard();
				draftBoard.setVisible(true);
			}
		});
		btnDraftBoard.setBounds(187, 171, 150, 50);
		NFLDraftBoardOptions.add(btnDraftBoard);
		
		JButton btnAvailablePlayers = new JButton("Available Players");
		btnAvailablePlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent availablePlayers) {
				NFLDraftBoardOptions.setVisible(false);
				AvailablePlayers availableHome = new AvailablePlayers();
				availableHome.setVisible(true);
			}
		});
		btnAvailablePlayers.setBounds(385, 171, 150, 50);
		NFLDraftBoardOptions.add(btnAvailablePlayers);
		
		JLabel lblWhatWouldYou = new JLabel("What would you like to do Next?");
		lblWhatWouldYou.setBounds(276, 40, 200, 43);
		NFLDraftBoardOptions.add(lblWhatWouldYou);
	}

}
