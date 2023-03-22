package ejercicio5;

public class Launch {

    public static void main(String[] args) throws InterruptedException {

        IWebEscritorio web = new Web("App SEUPB", 1.0);
        IWebEscritorio escritorio= new Escritorio("AnyDesk", 5.6);
        IWebEscritorio android = new AdapterMoviles(new Android("WildRift", 124.5));
        IWebEscritorio ios = new AdapterMoviles(new IOS("Incredibox", 10.2));
        IWebEscritorio windowsPhone = new AdapterMoviles(new WindowsPhone("Spotify", 352.50));

        web.iniciarSesion();
        web.cerrarSesion();
        web.generacionDatos();
        escritorio.iniciarSesion();
        escritorio.cerrarSesion();
        escritorio.generacionDatos();
        android.iniciarSesion();
        android.cerrarSesion();
        android.generacionDatos();
        ios.iniciarSesion();
        ios.cerrarSesion();
        ios.generacionDatos();
        windowsPhone.iniciarSesion();
        windowsPhone.cerrarSesion();
        windowsPhone.generacionDatos();

    }

}
