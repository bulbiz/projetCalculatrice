package com.monProjet.Calculatrice;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class maCalculatrice extends JFrame {
	private JPanel contentPane;

	maCalculatrice() {
		super("Calculatrice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,700);
		JPanel contentPane = new JPanel(new BorderLayout(5, 5));
		
		JPanel chiffres = new JPanel(new GridLayout(3, 3));
		
		// CREATION D'UN TABLEAU CONTENANT LES OPERATEURS
		String[] operateurs = {"+","-","/","x","="};
		JPanel operateursLogiques = new JPanel(new GridLayout(5,1));
		
		// INNITIALISATION D'UNE BOUCLE FOREACH QUI PARCOURT CHAQUE OPERATEUR
		for (String operateur : operateurs)
		{
			operateursLogiques.add(new JButton(operateur));
		}
		contentPane.add(operateursLogiques, BorderLayout.EAST);
		//TODO PLACER LES OPERATEURS EN BAS A DROITE
		for (int i = 1; i <= 9; i++) {
			chiffres.add(new JButton(Integer.toString(i)));
		}
		contentPane.add(chiffres, BorderLayout.SOUTH);
		
		
		
		
		JTextField text = new JTextField();
		contentPane.add(text, BorderLayout.NORTH);
		text.setBounds(20,40,200,28);
		
		setContentPane(contentPane);
		// TODO CHANGER LES CONVENTIONS DE NOMMAGE PAR DES CamelCase
	}
	
}
