package Exercicios;
import java.util.Scanner;

    public class Ex7{
        public static void main (String[] args){
            Scanner scanner = new Scanner (System.in);
            System.out.println("Digite o primeiro valor da primeira coordenada:");
            int x1 = scanner .nextInt();
            System.out.println("Digite o segundo valor da primeira coordenada:");
            int y1 = scanner.nextInt();
            System.out.println("Digite o primeiro valor da segunda coordenada:");
            int x2 = scanner.nextInt();
            System.out.println("Digite o segundo valor da segunda coordenada:");
            int y2 = scanner .nextInt();
            System.out.println("A distancia entre as coordenadas é de:" + ((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2)));
        }
    }

