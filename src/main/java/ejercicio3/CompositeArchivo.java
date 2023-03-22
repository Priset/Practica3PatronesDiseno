package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class CompositeArchivo extends ArchivoComponent {

    private List<ArchivoComponent> archivoComponentList = new ArrayList<>();

    public CompositeArchivo(String tipo) {
        super(tipo);
    }


    @Override
    public String showArchivo() {
        return getEspacio() + getTipo() + ": \n" + getEspacio() + " Numero de Palabras: " + getNumeroPalabras() + "\n";
    }

    @Override
    public void numeroPalabras() {

        for(ArchivoComponent archivoComponent : archivoComponentList) {
            archivoComponent.numeroPalabras();
            this.setNumeroPalabras(this.getNumeroPalabras() + archivoComponent.getNumeroPalabras());
        }

        Help.getInstance().add(showArchivo());

        if(isUltimo()) {
            Help.getInstance().showInfo();
        }
    }

    @Override
    public void add(ArchivoComponent archivoComponent) {
        archivoComponentList.add(archivoComponent);
    }

    @Override
    public void remove(ArchivoComponent archivoComponent) {
        archivoComponentList.remove(archivoComponent);
    }

    @Override
    public ArchivoComponent get(int index) {
        return archivoComponentList.get(index);
    }
}
