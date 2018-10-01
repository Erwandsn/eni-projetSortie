package bo;

public class Ville {
    private int id;
    private String nom;
    private String rue;
    private float latitude;
    private float longitude;

    public Ville(String nom, String rue, float latitude, float longitude) {
        this.nom = nom;
        this.rue = rue;
        this.latitude = latitude;
        this.longitude = longitude;
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


   
}
