package ejercicio1;

public class Habilidad implements IJuego{
    protected IJuego juego;

    public Habilidad(IJuego juego) {
        this.juego = juego;
    }

    @Override
    public void crearPersonaje(Personaje personaje) {
        personaje.showInfo();
    }

    @Override
    public void agregarHabilidad(Personaje personaje) {}
}
