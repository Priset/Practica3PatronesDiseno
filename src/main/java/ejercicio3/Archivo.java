package ejercicio3;

public class Archivo extends ArchivoComponent{

    public Archivo(String type, int numeroPalabras) {
        super(type);
        setNumeroPalabras(numeroPalabras);
    }

    @Override
    public String showArchivo() {
        return getEspacio() + getTipo() + ": \n" + getEspacio() + " Numero de Palabras: " + getNumeroPalabras() + "\n";
    }

    @Override
    public void numeroPalabras() {
        Help.getInstance().add(showArchivo());
    }

    @Override
    public void add(ArchivoComponent archivoComponent) {}

    @Override
    public void remove(ArchivoComponent archivoComponent) {}

    @Override
    public ArchivoComponent get(int index) {return null;}
}
