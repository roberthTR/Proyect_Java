package usuario;

public class Perfil {
    private String nombres;
    private int dni;
    private Usuario usuario;

    public Perfil(String nombres, int dni) {
        this.nombres = nombres;
        this.dni = dni;
    }

    public String getNombres() {
        return this.nombres;
    }

    public int getDni() {
        return this.dni;
    }

    public void agregarUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario mostrarUsuario() {
        return this.usuario;
    }
}
