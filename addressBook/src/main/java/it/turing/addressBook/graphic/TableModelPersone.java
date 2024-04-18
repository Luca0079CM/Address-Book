package it.turing.addressBook.graphic;

import javax.swing.table.AbstractTableModel;

import it.turing.addressBook.model.Persona;

import java.util.List;

public class TableModelPersone extends AbstractTableModel{
	
	public List<Persona> listaPersone; 
	
	public TableModelPersone() {
		
	}

	public void setData(List<Persona> listaPersone) {
		this.listaPersone = listaPersone;
	}
	
	@Override
	public int getRowCount() {
		return listaPersone.size();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Persona p = listaPersone.get(rowIndex);
		switch(columnIndex) {
		case 0:
			return p.getNome();
		case 1:
			return p.getCognome();
		case 2:
			return p.getTelefono();
		default:
			return null;
		}
	}
	
	
}
