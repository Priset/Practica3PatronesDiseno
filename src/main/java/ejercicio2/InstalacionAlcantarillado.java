package ejercicio2;

public class InstalacionAlcantarillado implements Instalacion {

    private int precio;
    private int duracionEnDias;
    private boolean certificada;

    public InstalacionAlcantarillado(int precio, int duracionEnDias, boolean certificada) {
        this.precio = precio;
        this.duracionEnDias = duracionEnDias;
        this.certificada = certificada;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDuracionEnDias() {
        return duracionEnDias;
    }

    public void setDuracionEnDias(int duracionEnDias) {
        this.duracionEnDias = duracionEnDias;
    }

    public boolean isCertificada() {
        return certificada;
    }

    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
    }

    @Override
    public void realizarInstalacion() {
        System.out.println("Instalación de alcantarillado exitosa!");
    }
}
