package EMC.ejer04;

public class Provincia {

    private String nomProv;

    private Distrito distrito;

    
    
    public Provincia(String nomProv) {
        this.nomProv = nomProv;
    }
 
    public String getNomProv() {
        return this.nomProv;
    }

    public Distrito mostrarDistrito() {
        return this.distrito;
    }

    public void agregarDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    

}

