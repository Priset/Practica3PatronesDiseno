package ejercicio2;

public class PagoAplicacion implements IPago{
    @Override
    public void consultarFormaPago(Instalacion instalacion) {
        System.out.println("Precio de instalación: " + instalacion.getPrecio() + " Bs.");
        System.out.println("Descuento del 10%");
        instalacion.setPrecio(instalacion.getPrecio() - instalacion.getPrecio()*10/100);
        System.out.println("Nuevo Precio: " + instalacion.getPrecio() + " Bs.");
    }
}
