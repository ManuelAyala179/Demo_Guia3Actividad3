package areas;

import java.util.Scanner;

public class Areas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        double ladoc;
        double aCirculo;
        double aCuadrado;
        double aSombra;
        System.out.print("Digite el valor del radio: ");
        radio = sc.nextDouble();

        aCirculo = Math.PI * Math.pow(radio, 2);
        System.out.printf("El area del circulo es: %.3f\n", aCirculo);
        ladoc = Math.sqrt(2 * Math.pow(radio, 2));
        System.out.printf("El lado del cuadrado es: %.3f\n", ladoc);
        aCuadrado = 2 * Math.pow(radio, 2);
        System.out.println("El area del cuadrado es: " + aCuadrado);
        aSombra = aCirculo - aCuadrado;
        System.out.printf("El valor del area sombreada es: %.3f\n", aSombra);
    }

}
