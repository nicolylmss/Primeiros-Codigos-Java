package Exercicios;

import java.util.Scanner;

public class Desafio{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int data;
        System.out.print("Digite a data no formato ddmmaaaa: ");
        data = sc.nextInt();

        int dia = data / 1000000;
        int mes = (data / 10000) % 100;
        int ano = data % 10000;

        int diasTotal = 0;


        for (int a = 1990; a < ano; a++) {
            if (ehBissexto(a)) {
                diasTotal += 366;
            } else {
                diasTotal += 365;
            }
        }

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (ehBissexto(ano)) {
            diasMes[1] = 29;
        }

        for (int i = 0; i < mes - 1; i++) {
            diasTotal += diasMes[i];
        }

        diasTotal += (dia - 1);

        int diaSemana = diasTotal % 7;

        String[] nomes = {
                "segunda-feira",
                "terça-feira",
                "quarta-feira",
                "quinta-feira",
                "sexta-feira",
                "sábado",
                "domingo"
        };

        System.out.println("Dia da semana: " + nomes[diaSemana]);

        sc.close();
    }

    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
