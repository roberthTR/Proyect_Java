package ejercicio10;

/*1. Diseñar y Programar la clase Producto y ProductoControlador. Considerar en la clase Producto las variables código, nombre, precio.
2. Programar la los métodos crear, listar y buscar. Dentro del método listar debe aplicar un forech para la iteración. En el método buscar deberá hacerlo empleando el operador == (igual a)
3. Realizar la búsqueda por el código del producto
*/

public class Producto {
    
    private int codPro;

    private String nombre;

    private double precio;

    public Producto(int codPro, String nombre, double precio) {
        this.codPro = codPro;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodPro() {
        return codPro;
    }

    public void setCodPro(int codPro) {
        this.codPro = codPro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   

    
}
