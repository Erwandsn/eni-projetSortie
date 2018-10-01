package bo;

public class Lieu {
    private int id;
    private String nom;
    private String rue;
    private float latitude;
    private float longitude;
    private Ville ville;

    public Lieu( String nom, String rue, float latitude, float longitude,Ville ville) {
        this.nom = nom;
        this.rue = rue;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ville = ville;
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

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
    
    
}
