package ejercicio4;
public class ServidorProxy implements ICluster {

    private ServidorUno servidorUno;
    private ServidorDos servidorDos;

    public ServidorProxy() {
        this.servidorUno = new ServidorUno();
        this.servidorDos = new ServidorDos();
    }

    @Override
    public void servidorUsuario(Usuario usuario) {

        System.out.println("*** AUTENTICANDO USUARIO ***");

        if(!usuario.getNombreUsuario().isEmpty()) {
            if(usuario.getPwd().length() > 8 && !usuario.getPwd().isEmpty()) {
                if(usuario.getId() % 2 != 0) {
                    servidorUno.servidorUsuario(usuario);

                } else {
                    servidorDos.servidorUsuario(usuario);
                }

            } else {
                System.out.println("La contraseña es demasiado debil");
            }

        } else {
            System.out.println("El nombre de usuario no es valido");
        }
    }
}
