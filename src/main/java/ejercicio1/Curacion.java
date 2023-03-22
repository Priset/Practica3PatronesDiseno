package ejercicio1;

public class Curacion extends Habilidad {
    private String[] armas = {"Espada", "Hacha", "Escopeta"};

    public Curacion(IJuego juego) {
        super(juego);
    }

    @Override
    public void agregarHabilidad(Personaje personaje){
        System.out.println("*** Agregando puntos de curacion ***");
        double nuevaVida = personaje.getPuntosVida() + 80;
        personaje.setPuntosDefensa(nuevaVida);
        personaje.showInfo();
    }
}
