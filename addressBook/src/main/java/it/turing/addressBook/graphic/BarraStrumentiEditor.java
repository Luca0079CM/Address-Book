package it.turing.addressBook.graphic;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BarraStrumentiEditor extends JPanel implements ActionListener{
	
	//  VOLENDO SI PUO FARE UN INTERFACCIA CON LE BARRE STRUMENTI
	
	private JButton salva;
	private JButton annulla;
	
	public BarraStrumentiEditor() {
		salva = new JButton("Salva");
		annulla = new JButton("Annulla");
		
		salva.addActionListener(this);
		annulla.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(salva);
		add(annulla);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();
		
		if(pressed == salva) {
			System.out.println("Salva");
		}else if(pressed == annulla){
			System.out.println("Annulla");
		}
		
	}

}
