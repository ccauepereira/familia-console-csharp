namespace HelloWorld.Base;
using System;
public class ApresentaoVetor
{
    public void Executa()
    {
        double maior = 0;
        Console.WriteLine("\nDigite a quantidade de integrantes da familia");
        int quant = int.Parse(Console.ReadLine());
        
        string [] nomes = new string[quant];
        int [] idade = new int[quant];
        decimal [] salario = new decimal[quant];
        double [] altura = new double[quant];
        bool [] maiorIdade = new bool[quant];
        
        for (int i = 0; i < quant; i++)
        {
            Console.WriteLine("\nDigite os nomes dos integrantes da familia: ");
            nomes[i] = Console.ReadLine();
            Console.WriteLine("\nDigite a idade dos integrantes da familia");
            idade [i] = int.Parse(Console.ReadLine());
            Console.WriteLine("\nDigite a altura dos integrantes:");
            altura[i] = double.Parse(Console.ReadLine());
            
            if (idade[i] >= 18)
            {
                maiorIdade[i] = true;
                
                Console.WriteLine("\nDigite o salario: ");
                salario[i] = decimal.Parse(Console.ReadLine());
            }
            else
            {
                maiorIdade[i] = false;
            }
            if (altura[i] > maior)
            {
                maior = altura[i];
            }
        }
        Console.WriteLine("===== DADOS DOS INTEGRANTES ===");
        for (int i = 0; i < quant; i++)
        {
            Console.WriteLine("Nome " + nomes[i]);
            Console.WriteLine("Idade" + idade[i]);
            Console.WriteLine("Altura: " +altura[i]);
            Console.WriteLine("Mais Alto: "+maior);
            Console.WriteLine("Maior de idade: " +maiorIdade[i]);

            if (maiorIdade[i])
            {
                Console.WriteLine("Salario: " + salario[i]);
            }
        }
    }
}