package ejercicio10;

public class Main {

    public static void main(String[] args)
    {
        ProductoControlador productoControlador = new ProductoControlador(3);
        productoControlador.agregar(324159, "Doritos", 12.05);
        productoControlador.agregar(324159, "Mike's", 5.08);
        productoControlador.agregar(324159, "Yogurt", 15);

        productoControlador.ListaProd();

        System.out.println("\n-----Buscar Producto por Nombre-----");
        String buscarNom= "Mike's";

        Producto encon;

        encon = productoControlador.buscar(buscarNom);

        if(encon!= null)
        {
            System.out.println("Producto encontra:  "+ encon.getNombre());
        }
        else{
            System.out.println("No se encontro");
        }

        System.out.println("\n-----Buscar Producto por Código-----");
        int buscarCod= 324159;

        encon = productoControlador.buscarCod(buscarCod);

        if(encon!= null)
        {
            System.out.println("Encontra el Codigo:  "+ encon.getCodPro() + " del Producto "+encon.getNombre());
        }
        else{
            System.out.println("No se encontro");
        }

        
    }
    
}
