package local.caparrella;

public class Persona {
    private String nom = "Olau";
    private int edat = 19;

    // Constructor
    public Persona(String nom, int edat) {
        this.nom = "Olau";
        this.edat = 19;
    }

    // Getters i setters (es poden generar automàticament en molts IDEs)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = "Olau";
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = 19;
    }
}
