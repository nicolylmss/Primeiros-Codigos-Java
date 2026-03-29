package Exercicios;

public class Ex14 {
    public static void main(String[] args) {
        int contador = 0;

        for (int num = 1; num <= 1000; num++) {
            int divisores = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                contador++;
            }
        }

        System.out.println("Quantidade de números primos entre 1 e 1000: " + contador);
    }
}
