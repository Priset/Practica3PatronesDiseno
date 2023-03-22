package ejercicio1;

public class Warcraft implements IJuego{
    @Override
    public void crearPersonaje(Personaje personaje) {
        System.out.println("*** Creando personaje ***");
        personaje.setPorcentajeArmadura(1);
        personaje.setArmas("Ninguna");
        personaje.setNivel(1);
        personaje.setPuntosAtaque(1);
        personaje.setPuntosVida(1);
        personaje.setPuntosDefensa(1);
        personaje.showInfo();
    }
    @Override
    public void agregarHabilidad(Personaje personaje) {}
}
