package ejercicio2;

public class PagoTransferencia implements IPago{
    @Override
    public void consultarFormaPago(Instalacion instalacion) {
        System.out.println("Precio de instalación: " + instalacion.getPrecio() + " Bs.");
        System.out.println("Descuento del 5%");
        instalacion.setPrecio(instalacion.getPrecio() - instalacion.getPrecio()*5/100);
        System.out.println("Nuevo precio: " + instalacion.getPrecio() + " Bs.");
    }
}
