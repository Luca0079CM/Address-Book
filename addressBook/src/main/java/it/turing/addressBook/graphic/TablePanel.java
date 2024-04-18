package it.turing.addressBook.graphic;

import java.awt.BorderLayout;
import java.util.List;

import it.turing.addressBook.model.Persona;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablePanel extends JPanel{
	
	private JTable table;
	private TableModelPersone tableModelPersone;
	
	public TablePanel() {
		
		tableModelPersone = new TableModelPersone();
		
		table = new JTable(tableModelPersone);
		
		setLayout(new BorderLayout());
		add(new JScrollPane(table), BorderLayout.CENTER);
		
	}
	
	public void setData(List<Persona> listaPersone) {
		tableModelPersone.setData(listaPersone);
	}
	
	public void aggiorna() {
		tableModelPersone.fireTableDataChanged();
	}
}
