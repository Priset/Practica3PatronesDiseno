package ejercicio5;

public class Web implements IWebEscritorio {

    private String nombre;
    private double lanzamiento;
    private boolean sesion;

    public Web(String nombre, double lanzamiento) {
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
            System.out.println("Ya tiene sesion");
        } else {
            System.out.println("Ejecutando sesion en la Web " + getNombre());
            sesion = true;
        }
    }

    @Override
    public void cerrarSesion() {

        if(sesion) {
            System.out.println("Cerrando sesion en la Web: " + getNombre());
            sesion = false;
        } else {
            System.out.println("No tiene sesion");
        }
    }

    @Override
    public void generacionDatos() throws InterruptedException {
        System.out.println("*** Generando datos ***");
        Thread.sleep(1000);
        System.out.println("Datos generados");

    }
}
