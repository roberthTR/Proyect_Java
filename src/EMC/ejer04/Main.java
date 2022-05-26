package EMC.ejer04;

//import javax.swing.*;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
       
        /*String valorDepartamento;
        String valorProvincia;
        String valorDistrito;
        
        valorDepartamento=JOptionPane.showInputDialog("Ingrese el Peso: ");
        valorProvincia=JOptionPane.showInputDialog("Ingrese el Peso: ");
        valorDistrito=JOptionPane.showInputDialog("Ingrese el Peso: ");
        */
        Departamento departamento = new Departamento("Huanuco");
        System.out.println("El departamento es: "+departamento);
        departamento.agregarProvincia(new Provincia("LeoncioPrado"));
        //departamento.agregarProvincia(new Provincia("Huanuco"));
        //departamento.agregarProvincia(new Provincia("Ambo"));
        System.out.println("Su provincias son: "+departamento);
        
    }
}
