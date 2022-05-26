package EMC.ejer5;

public class IMC {
    
    private int peso;

    private double estatura;

    public IMC(int peso, Double estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return  estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    
    public double getIMC(){

        double imc;
        imc = this.peso / Math.pow( this.estatura,2);

        return imc;
    }
}
