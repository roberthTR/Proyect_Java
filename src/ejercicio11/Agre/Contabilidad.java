package ejercicio11.Agre;

public class Contabilidad {

    private String nombreC;

    private Tienda tienda;

    public Contabilidad(String nombreC, Tienda tienda) {
        this.nombreC = nombreC;
        this.tienda = tienda;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    
    
}
