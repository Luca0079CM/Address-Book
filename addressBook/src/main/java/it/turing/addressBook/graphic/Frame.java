package it.turing.addressBook.graphic;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

import it.turing.addressBook.model.Persona;
import it.turing.addressBook.model.Rubrica;

import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Frame extends JFrame{
	
	    private JTable jTable;
	    private TablePanel tablePanel;
	    private BarraStrumentiPrincipale barraStrumentiPrincipale;

	    private Rubrica rubrica;
	    
	    public Frame(Rubrica rubrica){
	    	// Nuova finestra
	        super("Rubrica");
	        this.rubrica = rubrica;
	        setLayout(new BorderLayout());
	        tablePanel = new TablePanel();
	        tablePanel.setData(rubrica.getRubrica());
	        barraStrumentiPrincipale = new BarraStrumentiPrincipale();
	        
	        // Carica i dati dalla rubica
//	        String[][] data = new String[persone.size()][];
//	        System.out.println("Dimensione:" + persone.size());
//	        int i = 0;
//	        for(Persona p : persone) {
//	        	String[] dataTmp = new String[3];
//	        	dataTmp[0] = p.getNome();
//	        	dataTmp[1] = p.getCognome();
//	        	dataTmp[2] = p.getTelefono();
//	        	data[i] = dataTmp;
//	        	i++;
//	        }
//	        
//	        for(String[] d : data) {
//	        	System.out.println(d[0] + d[1] + d[2]);
//	        }
//	        
//	        String[] columnNames = { "Nome", "Cognome", "Telefono" };
//	        jTable = new JTable(data, columnNames);
//	        jTable.setBounds(30, 40, 200, 300);
	 
	        
	        
	        // Per inserire la tabella in un box a sccorrimento
	        JScrollPane sp = new JScrollPane(jTable);
	        add(sp, BorderLayout.CENTER);
	        add(barraStrumentiPrincipale, BorderLayout.PAGE_END);
	        setSize(500, 200);
	        // Posizionato al centro
	        setLocationRelativeTo(null);
	        
	        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        setVisible(true);
	    }
	    
}
