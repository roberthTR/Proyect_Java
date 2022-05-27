package EMC.ejer01;

public class Matricula {
    private int  año;
   
    private Semestre[]  semestre;

    private Curso[] curso;

    private int contador;

    public Matricula(int  año) {

        this.año = año;
        this.semestre = new Semestre[1];
        this.curso = new Curso[3];
        this.contador = 0;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Semestre[] getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre[this.contador] = semestre;
        this.contador++;
    }

    public Curso[] getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso[this.contador] = curso;
        this.contador++;
    }
   
}

