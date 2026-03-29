package Exercicios;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        int resultado = 1;

        System.out.print("Digite o valor de x: ");
        x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        y = sc.nextInt();

        for (int i = 0; i < y; i++) {
            resultado *= x;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
