package it.turing.addressBook.graphic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BarraStrumentiPrincipale extends JPanel implements ActionListener{
	
	private JButton addPersonaButton;
	private JButton updatePersonaButton;
	private JButton deletePersonaButton;
	
	BarraStrumentiPrincipale(){
		addPersonaButton = new JButton("Aggiungi Persona");
		updatePersonaButton = new JButton("Modifica Persona");
		deletePersonaButton = new JButton("Cancella Persona");
		
		addPersonaButton.addActionListener(this);
		updatePersonaButton.addActionListener(this);
		deletePersonaButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(addPersonaButton);
		add(updatePersonaButton);
		add(deletePersonaButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
		
		if(pressed == addPersonaButton) {
			FrameEditor f = new FrameEditor();
		}else if(pressed == deletePersonaButton){
			System.out.println("Delete");
		}else if(pressed == updatePersonaButton) {
			System.out.println("Update");
		}
	}
}
