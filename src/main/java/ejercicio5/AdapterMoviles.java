package ejercicio5;

public class AdapterMoviles implements IWebEscritorio {

    private IMoviles aplicacionAdaptada;

    public AdapterMoviles(IMoviles aplicacionAdaptada) {
        this.aplicacionAdaptada = aplicacionAdaptada;
    }

    @Override
    public void iniciarSesion() {
        aplicacionAdaptada.login();
    }

    @Override
    public void cerrarSesion() {
        aplicacionAdaptada.logout();
    }

    @Override
    public void generacionDatos() throws InterruptedException {
        aplicacionAdaptada.reportes();
    }
}
