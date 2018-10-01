package bo;

public class Inscrit {
    private Participant participant;
    private Sortie sortie;
    
	public Inscrit(Participant participant, Sortie sortie) {
		super();
		this.participant = participant;
		this.sortie = sortie;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Sortie getSortie() {
		return sortie;
	}

	public void setSortie(Sortie sortie) {
		this.sortie = sortie;
	}
    
	
    
}
