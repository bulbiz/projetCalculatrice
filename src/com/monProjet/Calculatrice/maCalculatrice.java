package com.monProjet.Calculatrice;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class maCalculatrice extends JFrame {
	private JPanel contentPane;

	maCalculatrice() {
		super("Calculatrice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 300, 300);
		JPanel contentPane = new JPanel(new BorderLayout(5, 5)); 
		
		JPanel button = new JPanel(new GridLayout(3, 3));

		for (int i = 1; i <= 9; i++) {
			button.add(new JButton(Integer.toString(i)));
		}
		contentPane.add(button, BorderLayout.SOUTH);
		setContentPane(contentPane);
		
		JTextField text = new JTextField();
		contentPane.add(text, BorderLayout.NORTH);
		text.setBounds(20,40,200,28);
	}
}
