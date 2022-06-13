package ejercicio11.Asoc;

public class Escuela {

    private String nombre;
    private Aula aula[];
    private int contador;

    public Escuela(String nombre, int size) {
        this.nombre = nombre;
        this.aula = new Aula[size];
        this.contador=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAula(String grado, int cantAlumnos) {
        this.aula[contador] = new Aula(grado, cantAlumnos);
        this.contador++;
    }

    public void ListAula()
    {
        System.out.println("Escuela, "+nombre+" tiene el: ");
        for(Aula a:aula)
        {
            System.out.println("\nGrado: "+a.getGrado()+", que tiene "+a.getCantAlumnos()+" Alumnos");
        }
    }

    public static void main(String[] args)
    {
        Escuela escAmerica = new Escuela("I.E Las Americas", 4);
        escAmerica.agregarAula("1ro - A", 45);
        escAmerica.agregarAula("2ro - A", 39);
        escAmerica.agregarAula("3ro - A", 28);
        escAmerica.agregarAula("4ro - A", 30);

        escAmerica.ListAula();
    }
    
}
