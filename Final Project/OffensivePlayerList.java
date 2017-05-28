package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.BoxLayout;
import javax.swing.ListSelectionModel;

public class OffensivePlayerList extends JFrame {

	private JPanel offensivePlayerList;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OffensivePlayerList frame = new OffensivePlayerList();
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
	public OffensivePlayerList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		offensivePlayerList = new JPanel();
		offensivePlayerList.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(offensivePlayerList);
		offensivePlayerList.setLayout(null);
		PlayerManager myPlayerManager = new PlayerManager();
		myPlayerManager.createPlayers();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 178, 1500, 500);
		offensivePlayerList.add(scrollPane);
		
		table = new JTable(myPlayerManager.getModel());
		scrollPane.setViewportView(table);
	


		

		
	}
}
