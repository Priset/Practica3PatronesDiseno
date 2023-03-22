package ejercicio1;

public class Launch {
    public static void main(String[] args) {
        Personaje priset = new Personaje("Priset");

        IJuego warcraft = new Warcraft();
        warcraft.crearPersonaje(priset);

        warcraft = new Escudo(warcraft);
        warcraft.agregarHabilidad(priset);

        warcraft = new Arma(warcraft);
        warcraft.agregarHabilidad(priset);

        warcraft = new Arma(warcraft);
        warcraft.agregarHabilidad(priset);

        warcraft = new Arma(warcraft);
        warcraft.agregarHabilidad(priset);

        warcraft = new Escudo(warcraft);
        warcraft.agregarHabilidad(priset);

        warcraft = new Curacion(warcraft);
        warcraft.agregarHabilidad(priset);

    }
}
