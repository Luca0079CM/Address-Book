package example.addressBook;
import java.util.ArrayList;

public class Rubrica {
	
	private ArrayList<Persona> rubrica;
	
	public Rubrica() {
		this.rubrica = new ArrayList<Persona>();
	}
	
	ArrayList<Persona> getRurbica(){
		return this.rubrica;
	}
	
	void setRubrica(ArrayList<Persona> rubrica) {
		this.rubrica = rubrica;
	}

	void addPersona(String nome, String cognome, String indirizzo, 
			String telefono, String eta) {
		Persona p = new Persona(nome, cognome, indirizzo, telefono, eta);
		rubrica.add(p);
	}
	
	void updatePersona(Persona p, String nome, String cognome, String indirizzo, 
			String telefono, String eta) {
		p.setNome(nome);
		p.setCognome(cognome);
		p.setIndirizzo(indirizzo);
		p.setTelefono(telefono);
		p.setEta(eta);
	}
	
	void deletePersona(Persona p) {
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
