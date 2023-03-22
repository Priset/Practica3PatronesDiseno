package ejercicio2;

public class PagoEfectivo implements IPago{
    @Override
    public void consultarFormaPago(Instalacion instalacion) {
        System.out.println("Precio de instalación: " + instalacion.getPrecio() + " Bs.");
        System.out.println("Sin descuento");
    }
}
