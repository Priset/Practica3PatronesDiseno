package ejercicio4;

public class Launch {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(12, "Priset", "awdadawdawd");
        Usuario usuario2 = new Usuario(25, "Didtux", "dawdawdad");
        Usuario usuario3 = new Usuario(36, "DSasd", "");
        Usuario usuario4 = new Usuario(70, "Zabitar", "sadsdsdwa");

        ServidorProxy servidorProxy = new ServidorProxy();

        servidorProxy.servidorUsuario(usuario1);
        servidorProxy.servidorUsuario(usuario2);
        servidorProxy.servidorUsuario(usuario3);
        servidorProxy.servidorUsuario(usuario4);


    }

}
