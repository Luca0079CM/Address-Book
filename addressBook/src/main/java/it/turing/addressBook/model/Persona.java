package it.turing.addressBook.model;

public class Persona {
	
	private String nome;
	private String cognome;
	private String indirizzo;
	private String telefono;
	private String eta;
	
	public Persona(String nome, String cognome, String indirizzo, 
			String telefono, String eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.eta = eta;
	}

	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getCognome() {
		return cognome;
	}

	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	
	public String getIndirizzo() {
		return indirizzo;
	}

	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	
	public String getTelefono() {
		return telefono;
	}

	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	public String getEta() {
		return eta;
	}

	
	public void setEta(String eta) {
		this.eta = eta;
	}

}
