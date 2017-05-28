package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AvailablePlayers extends JFrame {

	private JPanel availablePlayers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvailablePlayers frame = new AvailablePlayers();
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
	public AvailablePlayers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		availablePlayers = new JPanel();
		availablePlayers.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(availablePlayers);
		availablePlayers.setLayout(null);
		
		JButton btnAllPlayers = new JButton("View All Available");
		btnAllPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent allPlayers) {
				availablePlayers.hide();
				AllAvailablePlayers allAvailablePlayers = new AllAvailablePlayers();
				allAvailablePlayers.setVisible(true);
			}
		});
		btnAllPlayers.setBounds(268, 131, 150, 50);
		availablePlayers.add(btnAllPlayers);
		
		JButton btnOffensive = new JButton("Offensive");
		btnOffensive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent offensivePlayers) {
				availablePlayers.hide();
				OffensivePlayerList offensivePlayersList = new OffensivePlayerList();
				offensivePlayersList.setVisible(true);
			}
		});
		btnOffensive.setBounds(268, 192, 150, 50);
		availablePlayers.add(btnOffensive);
		
		JButton btnDefensive = new JButton("Defensive");
		btnDefensive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent defensivePlayers) {
				availablePlayers.hide();
				DefensivePlayerList defensivePlayersList = new DefensivePlayerList();
				defensivePlayersList.setVisible(true);
			}
		});
		btnDefensive.setBounds(268, 253, 150, 50);
		availablePlayers.add(btnDefensive);
		
		JLabel lblAvailablePlayersHome = new JLabel("Available Players Home");
		lblAvailablePlayersHome.setBounds(285, 22, 133, 62);
		availablePlayers.add(lblAvailablePlayersHome);
	}

}
