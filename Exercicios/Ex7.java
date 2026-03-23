public class Ex7{
    public static void main(Strings[] args){
        Scanner scanner = new Scanner (System.In);
        System.out.printIn("Digite o primeiro valor:");
        int a = scanner.nextInt();
        System.out.printIn("Digite o segundo valor:");
        int b = scanner.nextInt();
        if (a>b){
            System.out.printIn("O maior valor é o primeiro digitado:" + a);
        } else if (b>a){
            System.out.printIn("O maior valor é o segundo digitado:" + b);
        } else {
            System.out.printIn("Os valores são iguais.");
        }

    }
}