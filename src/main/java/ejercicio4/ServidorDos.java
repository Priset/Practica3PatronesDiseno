package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class ServidorDos implements ICluster {

    private List<Usuario> usuarioList;

    public ServidorDos() {
        usuarioList = new ArrayList<>();
    }

    public void showAllUsers() {
        for(Usuario usuario : usuarioList) {
            usuario.showInfo();
        }
    }


    @Override
    public void servidorUsuario(Usuario usuario) {
        System.out.println("Añadiendo usuario: " + usuario.getNombreUsuario() + " al Servidor Dos");
        usuarioList.add(usuario);
        System.out.println("Usuarios totales: ");
        this.showAllUsers();
        System.out.println("***************************************");
    }
}
