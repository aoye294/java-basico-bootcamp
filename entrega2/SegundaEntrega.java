package entrega2;

public class SegundaEntrega {
    private static double IVA = 0.21;
    public static void main(String[] args) {
       
        System.out.println("Precio total con IVA: "  + iva(250));
    }
    private static double iva(float precio){
        return precio + (precio * IVA);
    }
}
