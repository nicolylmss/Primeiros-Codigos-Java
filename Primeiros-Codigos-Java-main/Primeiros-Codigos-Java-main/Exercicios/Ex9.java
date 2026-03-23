package Exercicios;
import java.util.Scanner;

public class Ex9{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado:");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo lado:");
        int b = scanner.nextInt();
        System.out.println("Digite o terceiro lado:");
        int c = scanner.nextInt();
        if (a==b && b==c){
            System.out.println("O triangulo é equilatero.");
        } else if (a==b || a==c || b==c){
            System.out.println("O triangulo é isosceles.");
        } else {
            System.out.println("O triangulo é escaleno.");
        }
    }
}