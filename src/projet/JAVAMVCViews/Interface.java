package projet.JAVAMVCViews;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import projet.JavaMVCModels.MVCModel;

public class Interface extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	//Interface joueur
	private JPanel interfaceJ;
	private JPanel interfaceJ1;
	private JPanel interfaceJ2;
	
	private JLabel nomJ1;
	private JLabel nomJ2;
	
	private JLabel BateauxCouleJ1;
	private JLabel BateauxCouleJ2;
	
	//interface plateau
	private JPanel Plateaux;
	private JPanel PlateauxJ1;
	private JPanel PlateauxJ2;
		
	//Bateau
	private MVCModel sousMarins;
	private MVCModel torpilleurs;
	private MVCModel croiseurs;
	private MVCModel cuirassé;
	
	
	
	public Interface() {
		//interface
		interfaceJ = new JPanel();
		interfaceJ1 = new JPanel();
		interfaceJ2 = new JPanel();
		nomJ1 = new JLabel("Joueur 1");
		nomJ2 = new JLabel("Joueur 2");
		BateauxCouleJ1 = new JLabel("1");
		BateauxCouleJ2 = new JLabel("2");
		
		getContentPane().add(interfaceJ, BorderLayout.NORTH);
		interfaceJ.setLayout(new GridLayout( 1, 2, 35, 0));
		interfaceJ.add(interfaceJ1);
		interfaceJ.add(interfaceJ2);
		interfaceJ1.setLayout(new GridLayout(2, 2, 0, 10));
		interfaceJ2.setLayout(new GridLayout(2, 2, 0, 10));
		interfaceJ1.add(nomJ1);		
		interfaceJ1.add(BateauxCouleJ1);
		interfaceJ2.add(nomJ2);		
		interfaceJ2.add(BateauxCouleJ2);
		//plateau
		Plateaux = new JPanel();
		PlateauxJ1 = new JPanel();
		PlateauxJ2 = new JPanel();
		
		getContentPane().add(Plateaux, BorderLayout.CENTER);
		Plateaux.setLayout(new GridLayout(1, 2, 30, 30));
		Plateaux.add(PlateauxJ1);
		Plateaux.add(PlateauxJ2);
		PlateauxJ1.setLayout(new GridLayout(10, 10, 0, 0));
		PlateauxJ2.setLayout(new GridLayout(10, 10, 0, 0));
		
		//Frame
		setSize(1170, 500);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());	
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
