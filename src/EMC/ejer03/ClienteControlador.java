package EMC.ejer03;

public class ClienteControlador{

    private  int [] cliente;
    private int contador;


   


    public ClienteControlador(int[] cliente, int contador) {
        this.cliente = cliente;
        this.contador = contador;
    }


    public int[] getCliente() {
        return cliente;
    }


    public void setCliente(int[] cliente) {
        this.cliente = cliente;
    }


    public int getContador() {
        return contador;
    }


    public void setContador(int contador) {
        this.contador = contador;
    }


    public void agregarCliente(Cliente cliente){
        this.cliente[this.contador] = cliente;
        this.contador++;
    }

    public Cliente[] listarCliente()
    {
        return this.cliente;
    }
    public void buscarCLiente()
    {

    }
    public void editarCliente()
    {

    }
    public void eliminarCliente()
    {

    }

   


    
    
    
}


