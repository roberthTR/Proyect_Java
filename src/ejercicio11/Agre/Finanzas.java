package ejercicio11.Agre;

public class Finanzas {

    private String nombreF;
    private Tienda tienda;
    public Finanzas(String nombreF, Tienda tienda) {
        this.nombreF = nombreF;
        this.tienda = tienda;
    }
    public String getNombreF() {
        return nombreF;
    }
    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }
    public Tienda getTienda() {
        return tienda;
    }
    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    
    
}
