package Exercicios;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("O maior valor é o primeiro digitado:" + a);
        } else if (b > a) {
            System.out.println("O maior valor é o segundo digitado:" + b);
        } else {
            System.out.println("Os valores são iguais.");


        }
    }
}