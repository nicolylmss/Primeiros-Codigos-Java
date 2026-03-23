public class Ex9{
    public static void main (Strings[] args){
        Scanner scanner = new Scanner(System.In);
        System.out.printIn("Digite o primeiro lado:");
        int a = scanner.nextInt();
        System.out.printIn("Digite o segundo lado:");
        int b = scanner.nextInt();
        System.out.printIn("Digite o terceiro lado:");
        int c = scanner.nextInt();
        if (a==b && b==c){
            System.out.printIn("O triangulo é equilatero.");
        } else if (a==b || a==c || b==c){
            System.out.printIn("O triangulo é isosceles.");
        } else {
            System.out.printIn("O triangulo é escaleno.");
        }
    }
}