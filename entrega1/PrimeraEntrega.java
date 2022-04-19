package entrega1;

public class PrimeraEntrega {

    public static void main(String[] args) {
    
        int DNI = 1234567890;
        long credito = 200000;
        double salario = 7.500;
        boolean comprometido = true;
        String nombre = "Amalio Osá Oye";

        System.out.println(
            "**** Datos personales **** \n"+
            "Nombre: " + nombre + "\n"+
            "DNI: " + DNI + "\n"+
            "Estado civil: " + comprometido + "\n"+
            "Salario: " + salario + "\n"+
            "Crédito: " + credito + "\n"
        );

    }
}
