import java.util.Scanner;

public class ApresentacaoVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maior = 0;

        System.out.println("\nDigite a quantidade de integrantes da familia");
        int quant = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        String[] nomes = new String[quant];
        int[] idade = new int[quant];
        double[] salario = new double[quant];
        double[] altura = new double[quant];
        boolean[] maiorIdade = new boolean[quant];

        for (int i = 0; i < quant; i++) {
            System.out.println("\nDigite os nomes dos integrantes da familia: ");
            nomes[i] = scanner.nextLine();

            System.out.println("\nDigite a idade dos integrantes da familia");
            idade[i] = scanner.nextInt();

            System.out.println("\nDigite a altura dos integrantes:");
            altura[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer

            if (idade[i] >= 18) {
                maiorIdade[i] = true;

                System.out.println("\nDigite o salario: ");
                salario[i] = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer
            } else {
                maiorIdade[i] = false;
            }

            if (altura[i] > maior) {
                maior = altura[i];
            }
        }

        System.out.println("===== DADOS DOS INTEGRANTES ===");
        for (int i = 0; i < quant; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idade[i]);
            System.out.println("Altura: " + altura[i]);
            System.out.println("Mais Alto da Família: " + maior);
            System.out.println("Maior de idade: " + maiorIdade[i]);

            if (maiorIdade[i]) {
                System.out.println("Salario: " + salario[i]);
            }
        }

        scanner.close();
    }
}