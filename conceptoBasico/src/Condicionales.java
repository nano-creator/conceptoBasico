import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora de propinas");
        System.out.println("Ingresa la cantidad a pagar");
        double cantidad = entrada.nextDouble();
        System.out.println("Ingresa el % de propinas");
        int porcentaje = entrada.nextInt();
        
        if (porcentaje < 15) {
            System.out.println("El servico no fue muy bueno");
        }  else{
            System.out.println("El servicio fue bueno");
        }
        double total = cantidad * porcentaje / 100;
        System.out.printf("El total es: %f", total);
    }
}