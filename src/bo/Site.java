package bo;

public class Site {
    private int id;
    private String nom;

    public Site( String nom) {
        this.nom = nom;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


}
