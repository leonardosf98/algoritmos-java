import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;
        do {
            System.out.println("Digite o número do algoritmo:");
            int algorithm = scanner.nextInt();
            switch (algorithm) {
                case 2 -> somar(scanner);
                case 3 -> dividir(scanner);
                case 4 -> calcularRaizes(scanner);
                case 5 -> fatorar(scanner);
                default -> System.out.println("Opção inválida.");
            }
            System.out.println("Deseja ir para outro algoritmo? Digite 's' para sim ou 'n' para não");
            response = scanner.next();
        } while (response.equals("s"));
    }
    public static void somar(Scanner scanner){
        System.out.println("Digite um valor a ser somado:");
        int a = scanner.nextInt();
        System.out.println("Digite outro valor:");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("O resultado da soma de " + a + " com " + b + " é " + sum + "!");
    }
    public static void dividir(Scanner scanner){
        System.out.println("Digite o dividendo:");
        float aDiv = scanner.nextInt();
        System.out.println("Digite o divisor:");
        float bDiv;
        do {
            bDiv = scanner.nextInt();
            if (bDiv == 0) {
                System.out.println("Digite um valor diferente de 0.");
            }
        } while (bDiv == 0);
        float div = aDiv / bDiv;
        System.out.println("O resultado da divisão de " + aDiv + " por " + bDiv + " é " + div + "!");
    }
    public static void calcularRaizes(Scanner scanner){
        System.out.println("Cálculo das raízes de uma equação de segundo grau");
        System.out.println("Digite o primeiro valor");
        int primeiro = scanner.nextInt();
        while(primeiro == 0){
                System.out.println("Digite um valor diferente de 0");
                primeiro = scanner.nextInt();
        }
        System.out.println("Digite o segundo valor");
        int segundo = scanner.nextInt();
        System.out.println("Digite o terceiro valor");
        int terceiro = scanner.nextInt();
        double delta = pow(segundo,2) - 4 * primeiro * terceiro;
        double raiz = (-segundo + sqrt(delta)) / (2 * primeiro);
        if(delta < 0 ){
            System.out.println("Não tem raízes reais");
        } else if (delta == 0){
            System.out.println("A raiz é " + raiz + "!");
        } else {
            double raizDois =  (-segundo - sqrt(delta)) / (2 * primeiro);
            System.out.println("As raizes são " + raiz + " e " + raizDois + "!");
        }
    }

    public static void fatorar(Scanner scanner) {
        int contador;
        do {
            System.out.println("Digite um número inteiro não negativo a ser fatorado:");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número inteiro válido:");
                scanner.next();
            }
            contador = scanner.nextInt();

            if (contador < 0) {
                System.out.println("Por favor, digite um número inteiro não negativo.");
            }
        } while (contador < 0);

        int numero = contador;
        int fatorial = 1;
        while(contador >= 1) {
            fatorial = contador * fatorial;
            contador--;
        }
        System.out.println("O resultado da fatorial de " + numero + " é " + fatorial + "!");
    }
}
