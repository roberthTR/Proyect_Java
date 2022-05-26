package EMC.ejer5;

public class ClienteIMC {
    
    private String nom;

    private int edad;

    public ClienteIMC(String nom, int edad) {
        this.nom = nom;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
