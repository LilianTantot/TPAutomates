package process;

public class Heure {
	private int heures;
	private int minutes;
	
	public Heure(String horaire) {
		this.heures = Integer.parseInt(Character.toString(horaire.charAt(0))+Character.toString(horaire.charAt(1)));
		this.minutes = Integer.parseInt(Character.toString(horaire.charAt(2))+Character.toString(horaire.charAt(3)));
	}
	
	
	public Heure(int heures, int minutes) {
		super();
		this.heures = heures;
		this.minutes = minutes;
	}



	public int getHeures() {
		return heures;
	}


	public void setHeures(int heures) {
		this.heures = heures;
	}


	public int getMinutes() {
		return minutes;
	}


	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}


	public void setHorloge() {
		if(this.minutes > 60) {
			this.minutes = this.minutes - 60;
			this.heures++;
		}
		if(this.heures > 24) {
			this.heures = this.heures - 24; 
		}
	}
	
	public int heureToDuree() {
		return this.getMinutes() + this.getHeures()*60;
	}
	
	public Heure addDuree(Heure depart ,int duree) {
		Heure arrivee = new Heure(depart.getHeures(), depart.getMinutes()+duree);
		arrivee.setHorloge();
		return arrivee;
	}
	
	public int getDuree(Heure arrivee) {
		return arrivee.heureToDuree() - this.heureToDuree();
	}
	
	@Override
	public String toString() {
		return heures + ":" + minutes;
	}
	
	
}
