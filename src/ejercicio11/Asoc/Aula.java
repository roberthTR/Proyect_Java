package ejercicio11.Asoc;

public class Aula {

    private String grado;

    private int CantAlumnos;

    public Aula(String grado, int cantAlumnos) {
        this.grado = grado;
        CantAlumnos = cantAlumnos;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getCantAlumnos() {
        return CantAlumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        CantAlumnos = cantAlumnos;
    }
}
