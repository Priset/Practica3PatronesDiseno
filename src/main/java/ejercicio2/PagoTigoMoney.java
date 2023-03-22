package ejercicio2;

public class PagoTigoMoney implements IPago{
    @Override
    public void consultarFormaPago(Instalacion instalacion) {
        System.out.println("Precio de instalación: " + instalacion.getPrecio() + " Bs.");
        System.out.println("Descuento del 2%");
        instalacion.setPrecio(instalacion.getPrecio() - instalacion.getPrecio()*2/100);
        System.out.println("Nuevo precio: " + instalacion.getPrecio() + " Bs.");
    }
}
