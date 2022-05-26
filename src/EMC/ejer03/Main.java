package usuario;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Perfil perfil = new Perfil("James Maxwell", 12345678);
        System.out.println("Perfil: " + perfil.getNombres());
        System.out.println("Perfil: " + perfil.getDni());
        perfil.agregarUsuario(new Usuario("james@udh.edu.pe", "789"));
        System.out.println("Usuario: " + perfil.mostrarUsuario().getEmail());
        System.out.println("Usuario: " + perfil.mostrarUsuario().getPassword());
    }
}

