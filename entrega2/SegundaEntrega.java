package entrega2;

public class SegundaEntrega {
    private static double IVA = 0.21;
    public static void main(String[] args) {
        iva(250);
    }
    private static void iva(int precio){
        System.out.println("\nPrecio total con IVA: "  + precio + (precio * IVA)+"$\n");
    }
}
