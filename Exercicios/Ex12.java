package Exercicios;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numeo e descubra o fatorial dele:");
        int numero = scanner.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println(numero + "! = " + fatorial);
    }
}
