package com.monProjet.Calculatrice;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class maCalculatrice extends JFrame {
	private JPanel ContentPane;

	maCalculatrice() {
	    super("Calculatrice");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(400, 700);
	    String[] boutons = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", ".", "0", "C", "/"};

	   
	    ContentPane = new JPanel(new GridBagLayout());
	    GridBagConstraints gbc = new GridBagConstraints();

	    // Configuration pour le champ de texte
	    JTextField textField = new JTextField();
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.gridwidth = 4;
	    gbc.gridheight = 1; // Réduit la hauteur pour ne prendre que l'espace nécessaire
	    gbc.fill = GridBagConstraints.BOTH;
	    gbc.insets = new Insets(0, 0, 0, 0);// espace entre les boutons de 0
	    ContentPane.add(textField, gbc);

	    
	    for (int i = 0; i < boutons.length; i++) {
	        JButton bouton = new JButton(boutons[i]);
	        gbc.gridx = i % 4;
	        gbc.gridy = (i / 4) + 1; // Commence à ajouter les boutons en dessous du champ de texte
	        gbc.gridwidth = 1; // Chaque bouton prend une seule cellule
	        gbc.gridheight = 1;
	        
	        gbc.fill = GridBagConstraints.BOTH;
	        ContentPane.add(bouton, gbc);
	    }

	    setContentPane(ContentPane);
	}

	public static void main(String[] args) {
		maCalculatrice maCalculatrice = new maCalculatrice();
		maCalculatrice.setVisible(true);
	}
}
