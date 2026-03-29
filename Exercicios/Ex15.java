package Exercicios;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite o tamanho da matriz (n x n): ");
        n = sc.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");

        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        sc.close();
    }
}