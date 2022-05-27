package EMC.ejer01;

public class Estudiante {

    private String nombre;

    private Matricula[] matricula;

    private int contador;

    public Estudiante(String nombre) {
        this.nombre = nombre;

        this.contador=0;

        this.matricula = new Matricula[1];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Matricula[] getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula[this.contador] = matricula;
        this.contador = 1;
    }

    

    

}
