import java.util.Scanner;

public class Apresentacao {
    public static void main(String[] args) {
        String nome;
        int idade;
        int quant;
        double salario = 0;
        double altura;
        boolean maiorIdade;
    
        Scanner scanner = new Scanner(System.in);
        double maior = 0;

        System.out.println("\nDigite a quantidade de integrantes da família:");
        quant = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < quant; i++) {
            System.out.println("\nIntegrante " + (i + 1));

            System.out.println("\nDigite o nome:");
            nome = scanner.nextLine();

            System.out.println("\nDigite a idade:");
            idade = scanner.nextInt();

            System.out.println("\nDigite a altura:");
            altura = scanner.nextDouble();
            scanner.nextLine();

            if (altura > maior) {
                maior = altura;
            }

            if (idade >= 18) {
                maiorIdade = true;

                System.out.println("\nDigite o salário:");
                salario = scanner.nextDouble();
            } else {
                maiorIdade = false;
            }

            System.out.println("\n*** DADOS ***");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
            System.out.println("Maior de idade: " + maiorIdade);

            if (maiorIdade) {
                System.out.println("Salário: " +salario);
            }

            System.out.println("Pessoa mais alta até agora: " + maior);
        }

        scanner.close();
    }
}