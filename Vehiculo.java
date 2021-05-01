public class Vehiculo{

    public static Vehiculo[] vehiculos= new Vehiculo[10];
    public static int tamano= 10;
    public static int posAnadir= 0;

    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    public Vehiculo(){
        vehiculos[posAnadir]= this;
        posAnadir++;
    }

    public Vehiculo(int mo, String ma, double va){
        this(mo,ma,va,"verde");
    }

    public Vehiculo(int mo, String ma,  double va, String co){
        this.modelo= mo;
        this.marca= ma;
        this.valorComercial= va;
        this.color= co;
        posAnadir++;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setColor(String co) {
        this.color = co;
    }

    public void setMarca(String ma) {
        this.marca = ma;
    }

    public void setModelo(int mo) {
        this.modelo = mo;
    }

    public void setValorComercial(double va) {
        this.valorComercial = va;
    }

    public String toString(){
        return "MODELO= "+ this.modelo + "\n" +
        "MARCA =" + this.marca + "\n" +
        "VALOR COMERCIAL= " + this.valorComercial  + "\n" +
        "COLOR = "+ this.color + "\n" +
        " " + "\n";
    }

    public static String toStringVehiculos(){
        String info = " ";
        if(posAnadir > 0){
            for(int i= 0; i < Vehiculo.posAnadir;i++ ){
                info = vehiculos[i].toString()+info;
            }
        }
        else{
            System.out.println("NO HAY VEHICULOS ALMACENADOS");
        }
        return info;
    }

    public static int cantidadVehiculos(){
        return posAnadir;
    }

     public static String vehiculosVerdes() {
        String info = " ";
        for (int i = 0; i < Vehiculo.posAnadir; i++) {
            if (vehiculos[i].getColor().equals("verde")) {
                System.out.println(vehiculos[i].toString() + info);
            }
        }
        return info;
    }
}