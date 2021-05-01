import java.util.Scanner;
public class Principal {
    public static void main (String[] args) {
        Principal.mostrarMenu();
    }

    public static void mostrarMenu(){
        Scanner scan = new Scanner(System.in); 
        Sensor s2 = new Sensor("Temperatura", 0);
        while(true){

            System.out.println("----Ingrese una opcion----");
            System.out.println("----Ingrese 1 para añadir vehiculo.----");
            System.out.println("----Ingrese 2 para mostar informacion de todos los vehiculos.----");
            System.out.println("----Ingrese 3 para mostrar la cantidad de vehiculos almacenados.----");
            System.out.println("----Ingrese 4 para mostrar los vehiculos de color verde.----");
            System.out.println("----Ingrese 5 para añadir un sensor.----");
            System.out.println("----Ingrese 6 para mostrar la informacion de todos los sensores----");
            System.out.println("----Ingrese 7 para mostrar la cantidad de sensores almacenados.----");
            System.out.println("----Ingrese 8 para mostrar la informacion de todos los sensores de temperatura----");
            System.out.println("----Ingrese 666 para mostrar todos los sensores de temperatura ordenados por valor----");

            int num = scan.nextInt();
            switch(num){

                case 0:
                System.out.println("GRACIAS POR SU VISITA");
                break;

                case 1:
                if(Vehiculo.posAnadir < Vehiculo.vehiculos.length){
                    Vehiculo v1 = new Vehiculo();

                    System.out.println("INGRESE EL MODELO= ");
                    int modelo = scan.nextInt();
                    v1.setModelo(modelo);

                    System.out.println("INGRESE LA MARCA= ");
                    String marca = scan.next();
                    v1.setMarca(marca);

                    System.out.println("INGRESE EL VALOR COMERCIAL= ");
                    int valorComercial = scan.nextInt();
                    v1.setValorComercial(valorComercial);

                    System.out.println("INGRESE EL COLOR= ");
                    String color  = scan.next();
                    v1.setColor(color);
                }
                else{
                    System.out.println("ERROR BASE DE DATOS LLENA.");
                }
                continue;

                case 2:
                System.out.println(Vehiculo.toStringVehiculos());
                continue;

                case 3:
                System.out.println("LA CANTIDAD DE VEHICULOS ALMACENADOS ES = " + Vehiculo.cantidadVehiculos());
                continue;

                case 4:
                System.out.println(Vehiculo.vehiculosVerdes());
                continue;

                case 5:
                if(Sensor.posAnadir < Sensor.sensores.length){
                    Sensor s1 = new Sensor();
                    
                    System.out.println("INGRESE EL TIPO DE SENSOR= ");
                    String tipo = scan.next();
                    s1.setTipo(tipo);

                    System.out.println("INGRESE EL VALOR DEL SENSOR= ");
                    int valor = scan.nextInt();
                    s1.setValor(valor);
                }
                else{
                    System.out.println("ERROR BASE DE DATOS LLENA.");
                }
                continue;

                case 6:
                System.out.println(Sensor.toStringSensores());
                continue;

                case 7:
                System.out.println(Sensor.cantidadSensores());
                continue;

                case 8:
                System.out.println(Sensor.sensoresTemperatura());
                continue;

                case 666:
                if(s2.getTipo().equals("Temperatura")){
                    Sensor.ordenarSensor();
                }
                continue;
            }
            break;
        }
    }
}