package ejercicio3;

public class Launch {

    public static void main(String[] args) {

        Archivo archivo1 = new Archivo("Archivo", 700);
        Archivo archivo2 = new Archivo("Archivo", 3500);
        Archivo archivo3 = new Archivo("Archivo", 2000);
        Archivo archivo4 = new Archivo("Archivo", 1700);

        archivo1.setEspacio("\t\t\t\t");
        archivo2.setEspacio("\t\t\t\t");
        archivo3.setEspacio("\t\t\t\t");
        archivo4.setEspacio("\t\t\t\t");

        CompositeArchivo folder1 = new CompositeArchivo("Folder");
        CompositeArchivo folder2 = new CompositeArchivo("Folder");

        folder1.add(archivo1);
        folder1.add(archivo2);
        folder2.add(archivo3);
        folder2.add(archivo4);

        folder1.setEspacio("\t\t");
        folder2.setEspacio("\t\t");

        CompositeArchivo unidadDisco = new CompositeArchivo("Unidad De Disco");
        unidadDisco.add(folder1);
        unidadDisco.add(folder2);
        unidadDisco.setUltimo(true);
        unidadDisco.setEspacio("");

        unidadDisco.numeroPalabras();

    }

}
