package projet.JAVAMVCViews;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projet.JAVAMVCViews.GamePlay;

import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JButton StartC;
	private JButton StartG;
	private JButton Exit;
	
	public Menu() {
		Exit = new JButton("Exit");
		Exit.setAlignmentX(Component.CENTER_ALIGNMENT);
		StartC = new JButton("Start Console mode");
		StartC.setAlignmentX(Component.CENTER_ALIGNMENT);
		StartG = new JButton("Start Graphic mode");
		StartG.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		setLocationRelativeTo(null);
		setTitle("Menu");
		setSize(370, 155);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout boxLayout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		setLayout(boxLayout);
		add(StartC);
		StartC.addActionListener(this);
		add(StartG);
		StartG.addActionListener(this);
		add(Exit);
		Exit.addActionListener(this);
		
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Exit) System.exit(0);
		
		if(e.getSource() == StartC){
			setVisible(false);
			new GamePlay(null);
			//new Interface();
		}
		if(e.getSource() == StartG){
			setVisible(false);
			new Interface();
		}
	}
}
