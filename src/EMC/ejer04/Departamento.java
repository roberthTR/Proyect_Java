package EMC.ejer04;

public class Departamento {

    private  String nomDepart;

    private Provincia provincia;

    

    public Departamento(String nomDepart) {
        this.nomDepart = nomDepart;
    }

    
    public String getNomDepart() {
        return nomDepart;
    }


    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }


    public Provincia mostrarProvincia() {
        return provincia;
    }

    public void agregarProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}



    

   
