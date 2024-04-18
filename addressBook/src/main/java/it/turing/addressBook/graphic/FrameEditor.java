package it.turing.addressBook.graphic;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FrameEditor extends JFrame{
	
	private BarraStrumentiEditor barraStrumentiEditor;
	
	public FrameEditor() {
		super("Editor-Persona");
		setLayout(new BorderLayout());
		barraStrumentiEditor = new BarraStrumentiEditor();
		add(barraStrumentiEditor, BorderLayout.PAGE_END);
        setSize(500, 200);
        // Posizionato al centro
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
	}
}
