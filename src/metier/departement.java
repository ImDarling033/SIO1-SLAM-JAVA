package metier;

public class departement {
	// Attributs privés
    private String codeInsee;
    private String nom;
    private Region laRegion;

    // Constructeur
    public departement(String codeInsee, String nom, Region laRegion) {
        this.codeInsee = codeInsee;
        this.nom = nom;
        this.laRegion = laRegion;
    }

    // Getters
    public String getCodeInsee() {
        return codeInsee;
    }

    public String getNom() {
        return nom;
    }

    public Region getLaRegion() {
        return laRegion;
    }
}
