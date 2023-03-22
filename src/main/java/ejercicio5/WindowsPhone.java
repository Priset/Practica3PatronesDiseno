package ejercicio5;

public class WindowsPhone implements IMoviles {
    private String nombre;
    private double version;
    private boolean isLogged;

    public WindowsPhone(String nombre, double version) {
        this.nombre = nombre;
        this.version = version;
        this.isLogged = false;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getVersion() {
        return version;
    }
    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public void login() {

        if(isLogged) {
            System.out.println("Usted ya se encuentra loggeado!");
        } else {
            System.out.println("Realizando login en la aplicación Windows Phone: " + getNombre());
            isLogged = true;
        }
    }

    @Override
    public void logout() {

        if (isLogged) {
            System.out.println("Realizando logout en la aplicación Windows Phone: " + getNombre());
            isLogged = false;
        } else {
            System.out.println("Usted no está logueado!");
        }
    }

    @Override
    public void reportes() throws InterruptedException {
        System.out.println("*** Generando reportes ***");
        Thread.sleep(1000);
        System.out.println("Reportes generados");
    }
}
