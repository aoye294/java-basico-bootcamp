package entrega4;

public class SmartDevice{
    
    public static void main(String[] args) {
        
        SmartPhone sm = new SmartPhone("X17", "Samsung", 4, true, true, "5G", "1080p");
        SmartWatch  sw = new SmartWatch("P30", "iPhone", true, true, true);

        System.out.println(
            "Phone: "  + sm + "\n"+
            "Watch: "  + sw + "\n"
        );
    }  
  
}
class SmartPhone extends SmartDevice{
    private String modelo;
    private String fabricante;
    private Integer puertos;
    private boolean bluetooth;
    private boolean wifi;
    private String tipoRed;
    private String resolucion;

    public SmartPhone(){

    }

    public SmartPhone(String model, String fab, Integer nP, boolean bth, boolean wf, String tr, String rs){
        this.modelo = model;
        this.fabricante = fab;
        this.puertos = nP;
        this.bluetooth = bth;
        this.wifi = wf;
        this.tipoRed = tr;
        this.resolucion = rs;
    }

    public String toString(){
        return "\n*** SmartPhone ***\n"+
        "Modelo: "  + modelo + "\n" +
        "Fabricante: "  + fabricante + "\n" +
        "Número de puertos: "  + puertos + "\n" +
        "Bluetooth: "  + this.bluetooth + "\n" +
        "Wifi: "  + this.wifi + "\n" +
        "Tipo de red: "  + this.tipoRed + "\n" +
        "Resolución: "  + this.resolucion+ "\n";
    }
}
class SmartWatch extends SmartDevice{
    private String modelo;
    private String fabricante;
    private boolean bluetooth;
    private boolean wifi;
    private boolean gps;

    SmartWatch(String model, String fab, boolean bth, boolean wf, boolean gps ){
        this.modelo = model;
        this.fabricante = fab;
        this.bluetooth = bth;
        this.wifi = wf;
        this.gps = gps;
    }
    public String toString(){
        return "\n*** Smart Watch ***\n"+
        "Modelo: "  + this.modelo + "\n" +
        "Fabricante: "  + this.fabricante + "\n" +
        "Bluetooth: "  + this.bluetooth + "\n" +
        "Wifi: "  + this.wifi + "\n" +
        "Resolución: "  + this.gps+ "\n";
    }
}






