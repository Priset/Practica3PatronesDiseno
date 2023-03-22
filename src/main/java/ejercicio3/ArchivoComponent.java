package ejercicio3;

public abstract class ArchivoComponent {
    private String tipo;
    private int numeroPalabras;
    private String espacio;
    private boolean ultimo = false;

    public ArchivoComponent(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroPalabras() {
        return numeroPalabras;
    }

    public void setNumeroPalabras(int numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public boolean isUltimo() {
        return ultimo;
    }

    public void setUltimo(boolean ultimo) {
        this.ultimo = ultimo;
    }

    public abstract String showArchivo();
    public abstract void numeroPalabras();
    public abstract void add(ArchivoComponent archivoComponent);
    public abstract void remove(ArchivoComponent archivoComponent);
    public abstract ArchivoComponent get(int index);
}
