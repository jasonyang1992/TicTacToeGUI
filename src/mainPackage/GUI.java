package mainPackage;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.Border;


public class GUI {

	private JFrame Frame = new JFrame("Tic Tac Toe");
	
	public void FrameGUI() {
		
		JPanel BackGroundPanel = new JPanel();
		Frame.setSize(640,480);
		BackGroundPanel.setLayout(new GridBagLayout());
		GridBagConstraints GBC = new GridBagConstraints();
		BackGroundPanel.setBackground(Color.YELLOW);
		Frame.add(BackGroundPanel);		
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		
		JPanel TitlePanel = new JPanel();
		GBC.gridx = 0;
		GBC.gridy = 0;
		GBC.gridheight = 1;
		GBC.gridwidth = 6;
		GBC.insets = new Insets(15,15,0,15);
		GBC.fill = GridBagConstraints.BOTH;
		TitlePanel.setBorder(blackline);
		TitlePanel.setBackground(Color.WHITE);
		BackGroundPanel.add(TitlePanel, GBC);
		
		JLabel Title = new JLabel("Tic Tac Toe");
		Title.setFont(new Font("Times", Font.BOLD, 22));
		TitlePanel.add(Title);
		
		JPanel GamePanel = new JPanel();
		GBC.gridx = 0;
		GBC.gridy = 1;
		GBC.gridheight = 3;
		GBC.gridwidth = 3;
		GBC.insets = new Insets(15,15,5,5);
		GBC.fill = GridBagConstraints.BOTH;
		GBC.weightx = 1;
		GBC.weighty = 1;
		GamePanel.setBorder(blackline);
		GamePanel.setBackground(Color.RED);
		GamePanel.setLayout(new GridLayout(3,3));
		BackGroundPanel.add(GamePanel, GBC);
		
		JButton Button1 = new JButton("Button 1");
		JButton Button2 = new JButton("Button 2");
		JButton Button3 = new JButton("Button 3");
		JButton Button4 = new JButton("Button 4");
		JButton Button5 = new JButton("Button 5");
		JButton Button6 = new JButton("Button 6");
		JButton Button7 = new JButton("Button 7");
		JButton Button8 = new JButton("Button 8");
		JButton Button9 = new JButton("Button 9");
		
		GamePanel.add(Button1);
		GamePanel.add(Button2);
		GamePanel.add(Button3);
		GamePanel.add(Button4);
		GamePanel.add(Button5);
		GamePanel.add(Button6);
		GamePanel.add(Button7);
		GamePanel.add(Button8);
		GamePanel.add(Button9);
		
		JPanel StatusPanel = new JPanel();
		GBC.gridx = 3;
		GBC.gridy = 1;
		GBC.insets = new Insets(15,15,5,15);		
		GBC.fill = GridBagConstraints.BOTH;
		GBC.weightx = 1;
		GBC.weighty = 1;
		StatusPanel.setBorder(blackline);
		StatusPanel.setBackground(Color.WHITE);
		StatusPanel.setLayout(new GridLayout(3,1));
		BackGroundPanel.add(StatusPanel, GBC);
		
		JLabel StatusWinner = new JLabel("X is the Winner!");
		StatusWinner.setHorizontalAlignment(JLabel.CENTER);
		StatusPanel.add(StatusWinner);
		
		JLabel StatusTurn = new JLabel("It is X" + "'s turn");
		StatusTurn.setHorizontalAlignment(JLabel.CENTER);	
		StatusPanel.add(StatusTurn);
		
		JButton StatusStartGame = new JButton("Start Game");
		StatusPanel.add(StatusStartGame);
		
		Frame.setVisible(true);
		Frame.setResizable(false);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
