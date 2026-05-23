using System;
namespace HelloWorld.Base;

public class Apresentacao
{
    string nome;
    int idade;
    int quant;
    decimal salario;
    double altura;
    bool maiorIdade;

    public void Executa()
    {
        double maior = 0;

        Console.WriteLine("\nDigite a quantidade de integrantes da família:");
        quant = int.Parse(Console.ReadLine());

        for (int i = 0; i < quant; i++)
        {
            Console.WriteLine($"\nIntegrante {i + 1}");

            Console.WriteLine("\nDigite o nome:");
            nome = Console.ReadLine();

            Console.WriteLine("\nDigite a idade:");
            idade = int.Parse(Console.ReadLine());

            Console.WriteLine("\nDigite a altura:");
            altura = double.Parse(Console.ReadLine());

            if (altura > maior)
            {
                maior = altura;
            }

            if (idade >= 18)
            {
                maiorIdade = true;

                Console.WriteLine("\nDigite o salário:");
                salario = decimal.Parse(Console.ReadLine());
            }
            else
            {
                maiorIdade = false;
            }

            Console.WriteLine("\n*** DADOS ***");
            Console.WriteLine("Nome: " + nome);
            Console.WriteLine("Idade: " + idade);
            Console.WriteLine("Altura: " + altura);
            Console.WriteLine("Maior de idade: " + maiorIdade);

            if (maiorIdade)
            {
                Console.WriteLine("Salário: " + salario);
            }

            Console.WriteLine("Pessoa mais alta até agora: " + maior);
        }
    }
}