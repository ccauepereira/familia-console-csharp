import java.util.Scanner;
import java.util.ArrayList;

public class ApresentacaoArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maior = 0;

        System.out.println("\nDigite a quantidade de integrantes da familia");
        int quant = scanner.nextInt();
        scanner.nextLine();


        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> idade = new ArrayList<>();
        ArrayList<Double> salario = new ArrayList<>();
        ArrayList<Double> altura = new ArrayList<>();
        ArrayList<Boolean> maiorIdade = new ArrayList<>();

        for (int i = 0; i < quant; i++) {
            System.out.println("\nDigite os nomes dos integrantes da familia: ");
            nomes.add(scanner.nextLine());

            System.out.println("\nDigite a idade dos integrantes da familia");
            idade.add(scanner.nextInt());

            System.out.println("\nDigite a altura dos integrantes:");
            double alturaAtual = scanner.nextDouble();
            altura.add(alturaAtual);
            scanner.nextLine();

            if (idade.get(i) >= 18) {
                maiorIdade.add(true);

                System.out.println("\nDigite o salario: ");
                salario.add(scanner.nextDouble());
                scanner.nextLine();
            } else {
                maiorIdade.add(false);
                salario.add(0.0);
            }

            if (alturaAtual > maior) {
                maior = alturaAtual;
            }
        }

        System.out.println("===== DADOS DOS INTEGRANTES ===");
        for (int i = 0; i < quant; i++) {
            System.out.println("Nome: " + nomes.get(i));
            System.out.println("Idade: " + idade.get(i));
            System.out.println("Altura: " + altura.get(i));
            System.out.println("Mais Alto da Família: " + maior);
            System.out.println("Maior de idade: " + maiorIdade.get(i));

            if (maiorIdade.get(i)) {
                System.out.println("Salario: " + salario.get(i));
            }
        }

        scanner.close();
    }
}