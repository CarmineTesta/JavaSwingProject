import java.util.ArrayList;

public class Studente {
	private String Nome;
	private String Cognome;
	private ArrayList<Studente> ListaStudenti = new ArrayList<Studente>(); 
	
	Studente(String nome, String cognome){
		Nome=nome;
		Cognome=cognome;	
	}
	
	Studente(String nome){
		Nome = nome;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getCognome() {
		return Cognome;
	}
	
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	
	public void aggiungiAllaLista() {
		ListaStudenti.add(this);
	}
	
	public void stampamiGliStudenti() {
		for(int i = 0 ; i < ListaStudenti.size() ; i++) {
			System.out.println(ListaStudenti.get(i).getNome());
		}
	}
	
}
