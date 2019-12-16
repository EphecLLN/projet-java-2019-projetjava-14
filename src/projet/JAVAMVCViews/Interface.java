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
	private JButton TerrainJ1[];
	private JButton TerrainJ2[];
		
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
		BateauxCouleJ1 = new JLabel("0");
		BateauxCouleJ2 = new JLabel("0");
		
		//plateau
		Plateaux = new JPanel();
		PlateauxJ1 = new JPanel();
		PlateauxJ2 = new JPanel();
		TerrainJ1 = new JButton[100];
		TerrainJ2 = new JButton[100];
		
		//Frame
		setSize(1170, 500);
		
		setLocationRelativeTo(null);
		
		getContentPane().setLayout(new BorderLayout());
		
		//Contenu interface
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
		
		
		//Contenu plateau
		getContentPane().add(Plateaux, BorderLayout.CENTER);
		Plateaux.setLayout(new GridLayout(1, 2, 30, 30));
		Plateaux.add(PlateauxJ1);
		Plateaux.add(PlateauxJ2);
		PlateauxJ1.setLayout(new GridLayout(10, 10, 0, 0));
		PlateauxJ2.setLayout(new GridLayout(10, 10, 0, 0));
		
		//Cr�ation bouton des Terrains
		for(int i = 0; i <= 99; i++)
		{
			TerrainJ1[i] = new JButton();			
			TerrainJ1[i].setActionCommand("Grille1"+i);
			TerrainJ1[i].addActionListener(this);
			PlateauxJ1.add(TerrainJ1[i]);
		}
		
		for(int i = 0; i <= 99; i++)
		{
			TerrainJ2[i] = new JButton();
			TerrainJ2[i].setActionCommand("Grille2"+i);
			TerrainJ2[i].addActionListener(this);
			PlateauxJ2.add(TerrainJ2[i]);
		}
		setVisible(true);
		setTitle("GamePlay");
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

}





/**
 * Interface inspir�e de https://github.com/bastian-bou/naval-battle-game
 */
