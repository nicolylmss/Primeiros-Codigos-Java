public class Ex5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Systme.out.printIn("Voce dirigiu a quantos km? ");
        double km = scanner.nextDouble();
        System.out.print("Quantas horas de viagem?");
        double horas = scanner.nextDouble();
        System.out.println("A velocidade media da viagem foi de: " + (km/horas) + " km/h");
    }
}