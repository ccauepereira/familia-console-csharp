# familia-console-csharp
Esse projeto que você construiu é excelente para colocar no portfólio de estudos, porque demonstra que você já domina manipulação de terminal, laços de repetição (`for`), vetores/listas dinâmicas, tratamento de tipos e lógica condicional.

Ter um bom `README.md` no GitHub é o que faz os recrutadores e outros programadores olharem seu perfil com bons olhos.

Crie um arquivo chamado **`README.md`** (exatamente com esse nome e extensão) na raiz do seu repositório no GitHub, clique para editar e cole o seguinte conteúdo em Markdown:

```markdown
# 👨‍👩‍👧‍👦 Cadastro de Integrantes da Família em C#

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
![.NET Version](https://img.shields.io/badge/.NET-8.0-blue.svg)

Um aplicativo interativo de console desenvolvido em **C#** para automatizar o cadastro e análise estatística de integrantes de uma família. Este projeto foi criado com fins de estudo prático para consolidar fundamentos de lógica de programação, manipulação de dados em arrays/vetores e tratamento de fluxo condicional.

---

## 🚀 Funcionalidades

- **Coleta Dinâmica:** Pergunta a quantidade de integrantes e adapta o tamanho do sistema de cadastro de forma dinâmica.
- **Tipagem Forte:** Captura e trata múltiplos tipos de dados essenciais em C#:
  - `string` para nomes.
  - `int` para idades.
  - `double` para alturas.
  - `decimal` para controle de salários/precisão financeira.
  - `bool` para validação automática de maioridade.
- **Lógica de Condicional de Maioridade:** Aplica validações inteligentes baseadas na idade (ex: solicita o preenchimento de salário apenas se o integrante for maior de 18 anos).
- **Análise Estatística:** Monitora e identifica em tempo real quem é a pessoa mais alta cadastrada na família até o momento.
- **Exibição Formatada:** Gera um relatório limpo e organizado de todos os dados salvos ao término do laço de repetição.

---

## 🛠️ Tecnologias e Conceitos Aplicados

- **Linguagem:** C# 12
- **Plataforma:** .NET 8.0 SDK
- **Estruturas de Repetição:** Laços `for` para iteração controlada.
- **Coleções (Vetores):** Uso de Arrays indexados para armazenamento temporário em memória.
- **Conversão de Tipos (Type Parsing):** Implementação de `int.Parse()`, `double.Parse()` e `decimal.Parse()` para conversão segura do buffer de entrada do console.
- **Interpolação de Strings:** Formatação moderna de textos utilizando o padrão `$"{variavel}"`.

---

## 💻 Como Rodar o Projeto

### Pré-requisitos
Certifique-se de ter o [.NET 8 SDK](https://dotnet.microsoft.com/en-us/download/dotnet/8.0) instalado em sua máquina. Se estiver no Ubuntu Linux, você pode instalar rodando:
```bash
sudo snap install dotnet-sdk --classic

```

### Passo a Passo

1. **Clone o repositório:**
```bash
git clone [https://github.com/ccauepereira/familia-console-csharp.git](https://github.com/ccauepereira/familia-console-csharp.git)

```


2. **Navegue até a pasta do projeto:**
```bash
cd familia-console-csharp

```


3. **Execute a aplicação:**
```bash
dotnet run

```



---

## 📖 Exemplo de Execução no Terminal

```text
Digite a quantidade de integrantes da família:
2

Digite os nomes dos integrantes da família:
Caue

Digite a idade dos integrantes da família:
21

Digite a altura dos integrantes:
1.82

Digite o salário:
2500.00

===== DADOS DOS INTEGRANTES ===
Nome: Caue
Idade: 21
Altura: 1.82
Mais Alto da Família: 1.82
Maior de idade: True
Salário: 2500.00

```

---

## ✒️ Autor

* **Caue Pereira** - [Seu Perfil do GitHub](https://www.google.com/search?q=https://github.com/ccauepereira)

```

### 💡 Dicas extras:
1. **Badges:** Deixei no topo do arquivo duas insígnias automáticas (da licença MIT e do .NET 8.0). Elas deixam o visual do repositório bem profissional!
2. **Atualização futura:** Se você quiser atualizar seu código depois usando o `ArrayList` em C# (que na verdade se chama `List<T>`), basta atualizar a seção de tecnologias mudando "Vetores" por "Listas Genéricas (`List<T>`)".

```
