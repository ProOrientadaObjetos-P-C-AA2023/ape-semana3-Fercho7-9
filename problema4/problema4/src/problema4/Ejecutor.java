package problema4;

public class Ejecutor {
    public static void main(String[] args) {
        Sistema sistema=new Sistema();
        Sistema sistema1 = new Sistema("Andriod"
                ,6.5,250.8,12.0,"d2:5c:dd:8d","4567 890123 4");
        /* Es para darle valores de parametros al objeto terreno
            String sistema_operativo = "Andriod;
            double tamanio_pantalla = 6.5;
            double costos_iniciales = 250.8;
            double iva_porcentaje = 12.0;
            String direccion_mac = "d2:5c:dd:8d";
            String informacion_IMEI = "4567 890123 4";
            sistema1.CalcularIvaCostoInicial();
            sistema1.CalcularCostoFinal();
             */
        sistema1.CalcularIvaCostoInicial();
        sistema1.CalcularCostoFinal();
        System.out.println(sistema1);
        /* Otra manera de Presentarlos
            System.out.print("SISTEMAS DE EQUIPO CELULARES");
            System.out.print("El Sistema Operativo:\t"+sistema1.getSistema_Operativo()+"\n");
            System.out.print("El Tamaño del Dispositivo:\t"+sistema1.getTamanio_Pantalla()+"\n");
            System.out.print("Costo Inicial:\t"+sistema1.getCosto_Inicial()+"$"+"\n");
            System.out.print("Iva:\t"+sistema1.getIva_Porcentaje()+"%"+"\n");
            System.out.print("Costo Final:\t"+sistema1.getCalcularCosFinal()+"$"+"\n");
            System.out.print("Direccion Mac:\t"+sistema1.getDireccion_Mac()+"\n");
            System.out.print("Informacion_IMEI:\t"+sistema1.getInformacion_IMEI()+"\n");
            */
    }
}
