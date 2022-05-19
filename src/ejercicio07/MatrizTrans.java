package ejercicio07;

import javax.swing.*;

public class MatrizTrans{

    private int matriz1[][];
    private int matrizTras[][];

    private int fil, column;

    private int valor;

    public MatrizTrans() {

        fil = Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad de Fila: "));

        column = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Columna: "));

        this.matriz1 = new int[fil][column];
        this.matrizTras= new int[matriz1[0].length][matriz1.length];
    }

    public void agregarMatriz()
    {
        for (int fil=0; fil < this.matriz1.length; fil++)
        {
            for (int column=0; column < this.matriz1[fil].length; column++)
            {
                this.valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores ["+fil+";"+column+"]:"));

                this.matriz1[fil][column] = this.valor;
                
            }
        }
    }

    public void mostMatriz()
    {
        for (int fil=0; fil < this.matriz1.length; fil++)
        {
            for (int column=0; column < this.matriz1[fil].length; column++)
            {
                System.out.print(matriz1[fil][column] + "\t" );
            }
            System.out.println();
        }
    }

    public void remplazar(){

        for (int fil=0; fil < this.matriz1.length; fil++)
        {
            for (int column=0; column < this.matriz1[fil].length; column++)
            {
                this.matrizTras[column][fil] = this.matriz1[fil][column];
            }
        }
        System.out.println("Matriz Traspuesta" + "\n");
    }

    public void mostrasMT(){
        for (int fil=0; fil < this.matriz1.length; fil++)
        {
            for (int column=0; column < this.matriz1[fil].length; column++)
            {
                System.out.print(matrizTras[fil][column] + "\t" );
            }
            System.out.println();
        }
    }
   
    public static void main(String[] args) {
    
    MatrizTrans main = new MatrizTrans();

    main.agregarMatriz();
    main.mostMatriz();
    main.remplazar();
    main.mostrasMT();


    }

}
