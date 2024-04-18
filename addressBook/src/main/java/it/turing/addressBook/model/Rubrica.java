package it.turing.addressBook.model;
import java.util.ArrayList;

public class Rubrica {
	
	private ArrayList<Persona> rubrica;
	
	public Rubrica() {
		this.rubrica = new ArrayList<Persona>();
	}
	
	public ArrayList<Persona> getRubrica(){
		return this.rubrica;
	}
	
	public void setRubrica(ArrayList<Persona> rubrica) {
		this.rubrica = rubrica;
	}

	public void addPersona(String nome, String cognome, String indirizzo, 
			String telefono, String eta) {
		Persona p = new Persona(nome, cognome, indirizzo, telefono, eta);
		rubrica.add(p);
	}
	
	public void updatePersona(Persona p, String nome, String cognome, String indirizzo, 
			String telefono, String eta) {
		p.setNome(nome);
		p.setCognome(cognome);
		p.setIndirizzo(indirizzo);
		p.setTelefono(telefono);
		p.setEta(eta);
	}
	
	public void deletePersona(Persona p) {
		boolean found = false;
		for(Persona per : rubrica){
			if(per.getNome() == p.getNome() && per.getCognome() == p.getCognome()) {
				rubrica.remove(per);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("L'utente non è stato trovato");
		}else {
			System.out.println("Utente eliminato con successo!");
		}
		
	}

	
}
