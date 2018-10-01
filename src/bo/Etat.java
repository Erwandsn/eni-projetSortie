package bo;

public class Etat {
    private int id;
    private String libelle;

    public Etat( String libelle) {
        this.libelle = libelle;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

    
}
