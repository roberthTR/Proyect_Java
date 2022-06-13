package ejercicio11.Agre;

public class Asistente {

    private String nombreA;

    private Tienda tienda;

    public Asistente(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

}
