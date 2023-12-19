package local.caparrella;

public class Persona {
    private String nom = "joel";
    private int edat = 18;

    // Constructor
    public Persona(String nom, int edat) {
        this.nom = "joel";
        this.edat = 18;
    }

    // Getters i setters (es poden generar automàticament en molts IDEs)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = "joel";
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = 19;
    }
}

