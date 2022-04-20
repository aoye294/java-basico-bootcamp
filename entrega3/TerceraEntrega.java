package entrega3;

public class TerceraEntrega {
    public static void main(String[] args) {
        String[] deudores  = {
            "Marcos",
            "Javier",
            "Andrés",
            "Jose Luís"
        };

        System.out.println("**** Lista de Morosos ****");
        for (int i = 0; i < deudores.length; i++) {
            System.out.println(i+1 + ".- " + deudores[i]);
        }
    }
}
