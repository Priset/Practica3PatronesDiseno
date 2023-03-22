package ejercicio4;

public class Usuario {
    private int id;
    private String nombreUsuario;
    private String pwd;

    public Usuario(int id, String nombreUsuario, String pwd) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void showInfo() {
        System.out.println("** Usuario **");
        System.out.println("ID: " + id);
        System.out.println("UserName: " + nombreUsuario);
    }
}
