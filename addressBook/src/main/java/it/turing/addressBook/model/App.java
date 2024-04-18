package it.turing.addressBook.model;

import it.turing.addressBook.graphic.Frame;

public class App {
	
    public static void main( String[] args ){
        Rubrica rubrica = new Rubrica();
        rubrica.addPersona("Luca", "Leuter", "Via Marzabotto, 1", "3332222555", "27");
        rubrica.addPersona("Mario", "Rossi", "Via Cetino, 2", "38978646346", "50");
        for(Persona p : rubrica.getRubrica()) {
        	System.out.println("\n"+p.getNome());
        	System.out.println(p.getCognome());
        	System.out.println(p.getIndirizzo());
        	System.out.println(p.getTelefono());
        	System.out.println(p.getEta());
        }
        
        Frame f = new Frame(rubrica);
    }
    
}
