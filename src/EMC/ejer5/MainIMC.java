package EMC.ejer5;

import javax.swing.*;

public class MainIMC {

    public static void main(String args[]){

        int valorPeso;
        double valorEstatura;
        String valorNom;
        int valorEdad;

        valorNom=JOptionPane.showInputDialog("Ingrese el Peso: ");
        valorEdad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Peso: "));
        
        valorPeso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Peso: "));
        valorEstatura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Estatura: "));

        IMC imc = new IMC(valorPeso, valorEstatura);


        ClienteIMC clienteIMC = new ClienteIMC(valorNom,valorEdad);
        System.out.println("------Diagnostico de IMC-----");
        System.out.println();
        System.out.println("Nombre del Cliente: " + clienteIMC.getNom());
        System.out.println("Edad del Cliente: " + clienteIMC.getEdad());
        System.out.println();
        System.out.println("Resultado de IMC: "+imc.getIMC());
        System.out.println();
    }
    
}
