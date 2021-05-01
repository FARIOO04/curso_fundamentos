 public class Sensor {

    public static Sensor[] sensores = new Sensor[8];
    public static int tamano = 8;
    public static int posAnadir = 0;

    private String tipo;
    private double valor;

    public Sensor() {
        sensores[posAnadir] = this;
        posAnadir++;
    }

    public Sensor(String t, double v) {
        this.tipo = t;
        this.valor = v;
        sensores[posAnadir]= this;
        posAnadir++;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public void setValor(double v) {
        this.valor = v;
    }

    public double getValor() {
        return this.valor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String toString() {
        return "TIPO: " + this.tipo + "\n"
        + "VALOR: " + this.valor + "\n" +
        " " + "\n";
    }

    public static String toStringSensores() {
        String info = " ";
        if(posAnadir > 0){
            for (int i = 0; i < Sensor.posAnadir; i++) {

                info = sensores[i].toString() + info;

            }
        }else{
            System.out.println("NO HAY SENSORES ALMACENADOS");
        }
        return info;
    }

    public static int cantidadSensores() {
        return Sensor.posAnadir;
    }

    public static String sensoresTemperatura() {
        String info = " ";
        for (int i = 0; i < Sensor.posAnadir; i++) {                         
            if (sensores[i].getTipo().equals("temperatura")) {
                System.out.println(sensores[i].toString() + info);
            }                     
        }
        return info;
    }

    public static void ordenarSensor() {
        Sensor temp;
        int n = tamano;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(sensores[i].getTipo().equals("temperatura")){
                    if (sensores[j].getValor() > sensores[j + 1].getValor()) {
                        temp = sensores[j];
                        sensores[j] = sensores[j + 1];
                        sensores[j + 1] = temp;
                    }
                }
            }
            for (i = 0; i < n; i++) {
                System.out.println(sensores[i]);
            }
        }
    }
}
