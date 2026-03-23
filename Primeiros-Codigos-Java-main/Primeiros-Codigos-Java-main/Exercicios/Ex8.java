package Exercicios;
import java.util.Scanner;

public class Ex8{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o primeiro valor:");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        int b = scanner.nextInt(); 
        System.out.println(a>b ? "O maior valor é o primeiro digitado:" + a : "O maior valor é o segundo digitado:" + b);
    }
}