package example.addressBook;

public class App {
	
    public static void main( String[] args ){
        Rubrica rubrica = new Rubrica();
        rubrica.addPersona("Luca", "Leuter", "Via Marzabotto", "3332222555", "27");
        for(Persona p : rubrica.getRurbica()) {
        	System.out.println("\n"+p.getNome());
        	System.out.println(p.getCognome());
        	System.out.println(p.getIndirizzo());
        	System.out.println(p.getTelefono());
        	System.out.println(p.getEta());
        }
        
        rubrica.updatePersona(rubrica.getRurbica().get(0), 
        		"LucaL", "Ltr", "Via Marzzzz", "332121354", "26");
        
        for(Persona p : rubrica.getRurbica()) {
        	System.out.println("\n"+p.getNome());
        	System.out.println(p.getCognome());
        	System.out.println(p.getIndirizzo());
        	System.out.println(p.getTelefono());
        	System.out.println(p.getEta());
        }
        
        rubrica.deletePersona(rubrica.getRurbica().get(0));
        if(rubrica.getRurbica().size()==0) {
        	System.out.println("DGN");
        }
        for(Persona p : rubrica.getRurbica()) {
        	System.out.println("\n"+p.getNome());
        	System.out.println(p.getCognome());
        	System.out.println(p.getIndirizzo());
        	System.out.println(p.getTelefono());
        	System.out.println(p.getEta());
        }
    }
}
