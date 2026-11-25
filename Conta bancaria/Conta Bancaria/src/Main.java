public class Main {
        public static void main(String[] args) {
            // Instanciando cada tipo de conta
            Conta cc = new ContaCorrente("1001-1", "001", "Ana Silva", 500.00);
            Conta cp = new ContaPoupanca("2002-2", "001", "Carlos Souza", 1000.00);
            Conta pj = new ContaPessoaJuridica("3003-3", "002", "Tech Solutions Ltda", 2500.00);

            // Operações na Conta Corrente
            System.out.println("=== Conta Corrente ===");
            cc.depositar(200.00);
            cc.sacar(150.00);
            cc.exibirSaldo();
            System.out.printf("Tarifa mensal: R$ %.2f%n%n", cc.calcularTarifaMensal());

            // Operações na Conta Poupança
            System.out.println("=== Conta Poupança ===");
            cp.depositar(300.00);
            cp.sacar(100.00);
            cp.exibirSaldo();
            System.out.printf("Tarifa mensal: R$ %.2f%n%n", cp.calcularTarifaMensal());

            // Operações na Conta Pessoa Jurídica
            System.out.println("=== Conta Pessoa Jurídica ===");
            pj.depositar(500.00);
            pj.sacar(400.00); // Desconta R$ 400,00 + R$ 1,50 de taxa
            pj.exibirSaldo();
            System.out.printf("Tarifa mensal: R$ %.2f%n", pj.calcularTarifaMensal());

        }
    }

