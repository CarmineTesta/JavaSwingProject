
public class FinestraPrimariaController {
	public void initFinistra() {
		PannelloPrimario finestra = new PannelloPrimario(this);
		finestra.setVisible(true);	
	}

	public void creaStudente(String nome) {
		Studente studente = new Studente(nome);
		studente.aggiungiAllaLista();
		studente.stampamiGliStudenti();
	}
	//CIAO FACCIO UN'ALTRA MODIFICA AL FILE
	
	
}
