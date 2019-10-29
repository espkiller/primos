package primos;

import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
        boolean primo = true;
        int divisor;
        int x;
        int resto;
        divisor = 2;

        System.out.println("****************************************************************");

        System.out.println("Introduce un número vamos a averiguar si es un número Primo");

        System.out.println("****************************************************************");

        Scanner entradaTeclado = new Scanner(System.in);
        x = entradaTeclado.nextInt();
        do {
            divisor = 2;
            primo = true;
            do {

                resto = x % divisor;
                if (resto == 0) {
                    primo = false;
                } else {
                    divisor = divisor + 1;
                }
            } while (primo == true && divisor < x);
            if (primo == true) {
                System.out.println("****************************************************************");
                System.out.println("El número " + x + " es un número Primo");
                System.out.println("****************************************************************");
            } else {
                System.out.println("****************************************************************");
                System.out.println("El número " + x + " no es un número Primo");
                System.out.println("****************************************************************");
            }
            System.out.println("Escribe otro número o introduzca 0 para salir");
            System.out.println("****************************************************************");
            x = entradaTeclado.nextInt();
        } while (x != 0);
        System.out.println("************GRACIAS QUE TENGAS UN BUEN DÍA*************************");
    }
}
