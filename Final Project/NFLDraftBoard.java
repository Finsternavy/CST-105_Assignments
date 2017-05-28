package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class NFLDraftBoard extends JFrame {

	private JPanel draftBoard;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NFLDraftBoard frame = new NFLDraftBoard();
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
	public NFLDraftBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		draftBoard = new JPanel();
		draftBoard.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(draftBoard);
		draftBoard.setLayout(null);
		PlayerManager myPlayerManager = new PlayerManager();
		myPlayerManager.createPlayers();
		
		JLabel lblYourDraftBoard = new JLabel("Your Draft Board");
		lblYourDraftBoard.setBounds(293, 38, 131, 27);
		draftBoard.add(lblYourDraftBoard);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(118, 120, 462, 208);
		draftBoard.add(scrollPane);
		
		
		
		table = new JTable(myPlayerManager.getModel4());
		scrollPane.setViewportView(table);
		

	}
}
