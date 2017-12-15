/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayorque;

import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class MayorQue {

    /**
     * @param args the command line arguments Pedir dos números y decir cual es
     * el mayor o si son iguales.
     */
    public static void main(String[] args) {

        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero1 = entrada.nextInt();

        System.out.println("Introduce otro numero");
        numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("Son iguales tus numeros");

        } else {
            if (numero1 > numero2) {
                System.out.println(numero1 + " es mayor que " + numero2);
            } else {
                System.out.println(numero2 + " es mayor que  " + numero1);
            }

        }

    }

}
