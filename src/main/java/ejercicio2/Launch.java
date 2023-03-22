package ejercicio2;

public class Launch {

    public static void main(String[] args) {

        IEmpresa empresa = new Empresa("Dradler SRL", new InstalacionAgua(140, 23, true),new PagoEfectivo());

        empresa.realizarInstalacion();
        empresa.consultarFormaPago();

        System.out.println("****************************************");

        empresa.setInstalacion(new InstalacionElectrica(250, 39, true));
        empresa.setPago(new PagoAplicacion());

        empresa.realizarInstalacion();
        empresa.consultarFormaPago();

        System.out.println("****************************************");

        empresa.setInstalacion(new InstalacionAlcantarillado(450, 45, false));
        empresa.setPago(new PagoTransferencia());

        empresa.realizarInstalacion();
        empresa.consultarFormaPago();

        System.out.println("****************************************");

        empresa.setInstalacion(new InstalacionAgua(320, 11, false));
        empresa.setPago(new PagoTigoMoney());

        empresa.realizarInstalacion();
        empresa.consultarFormaPago();


    }

}
