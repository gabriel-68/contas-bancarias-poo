Sistema Bancário Simplificado em JavaAplicação desenvolvida em Java para praticar os pilares da Programação Orientada a Objetos (POO) — com foco em Abstração, Herança e Polimorfismo — simulando operações básicas e regras de tarifação de diferentes tipos de contas bancárias. Sobre o ProjetoO sistema modela uma hierarquia de contas a partir de uma superclasse abstrata (Conta), que centraliza os atributos e comportamentos comuns e obriga cada subclasse a implementar sua própria regra de cálculo de tarifa mensal.Regras de Negócio por Tipo de ContaTipo de ContaClasseTarifa MensalRegras EspecíficasConta Corrente (CC)ContaCorrenteR$ 12,00Realiza saques e depósitos normalmente.Conta Poupança (CP)ContaPoupancaIsenta (R$ 0,00)Realiza saques e depósitos sem cobrança de tarifa mensal.Conta Pessoa Jurídica (PJ)ContaPessoaJuridicaR$ 20,00Cobra uma taxa adicional de R$ 1,50 a cada saque realizado.🛠️ Conceitos AplicadosAbstração: Uso da classe abstract class Conta e do método abstrato calcularTarifaMensal().Encapsulamento: Controle de acesso aos atributos (numero, agencia, titular e saldo) e validação de valores em saques e depósitos.Herança: Reaproveitamento de código nas subclasses ContaCorrente, ContaPoupanca e ContaPessoaJuridica utilizando extends e super().Polimorfismo: Sobrescrita de métodos (@Override) para adaptar o comportamento de saque na conta PJ e o cálculo de tarifas em cada subclasse. Estrutura de Arquivos├── Conta.java                 # Superclasse abstrata com atributos e métodos base
├── ContaCorrente.java         # Implementação da Conta Corrente
├── ContaPoupanca.java         # Implementação da Conta Poupança
├── ContaPessoaJuridica.java   # Implementação da Conta PJ com taxa por saque
└── Main.java                  # Classe principal para execução e testes
 Como Executar o ProjetoPré-requisitosJava JDK (versão 11 ou superior) instalado na máquina.Passo a passo via terminalClone este repositório:git clone https://github.com/seu-usuario/sistema-bancario-java.git
Acesse a pasta do projeto:cd sistema-bancario-java
Compile os arquivos Java:javac *.java
Execute a classe principal:java Main
 Exemplo de Saída=== Conta Corrente ===
Depósito de R$ 200,00 realizado na conta 1001-1.
Saque de R$ 150,00 realizado na conta 1001-1.
Titular: Ana Silva | Agência: 001 | Conta: 1001-1 | Saldo: R$ 550,00
Tarifa mensal: R$ 12,00

=== Conta Poupança ===
Depósito de R$ 300,00 realizado na conta 2002-2.
Saque de R$ 100,00 realizado na conta 2002-2.
Titular: Carlos Souza | Agência: 001 | Conta: 2002-2 | Saldo: R$ 1200,00
Tarifa mensal: R$ 0,00

=== Conta Pessoa Jurídica ===
Depósito de R$ 500,00 realizado na conta 3003-3.
Saque de R$ 400,00 realizado na conta PJ 3003-3 (taxa de R$ 1,50 descontada).
Titular: Tech Solutions Ltda | Agência: 002 | Conta: 3003-3 | Saldo: R$ 2598,50
Tarifa mensal: R$ 20,00.
