package ejercicio5;

public class Escritorio implements IWebEscritorio {

    private String nombre;
    private double lanzamiento;
    private boolean sesion;

    public Escritorio(String nombre, double lanzamiento) {
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
        sesion = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(double lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public boolean isSesion() {
        return sesion;
    }

    public void setSesion(boolean sesion) {
        this.sesion = sesion;
    }


    @Override
    public void iniciarSesion() {
        if(sesion) {
            System.out.println("Ya inicio sesion");
        } else {
            System.out.println("Iniciando sesion en la aplicación Escritorio: " + getNombre());
            sesion = true;
        }
    }

    @Override
    public void cerrarSesion() {
        if(sesion) {
            System.out.println("Cerrando sesion en la aplicación Escritorio: " + getNombre());
            sesion = false;
        } else {
            System.out.println("No se inicio sesion");
        }
    }

    @Override
    public void generacionDatos() throws InterruptedException {
        System.out.println("*** Generando datos ***");
        Thread.sleep(1000);
        System.out.println("Datos generados");
    }
}
