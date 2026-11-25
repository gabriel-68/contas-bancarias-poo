import java.util.ArrayList;
import java.util.List;

public class Banco {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("1001-1", "001", "Ana Silva", 500.00);
        Conta cp = new ContaPoupanca("2002-2", "001", "Carlos Souza", 1000.00);
        Conta pj = new ContaPessoaJuridica("3003-3", "002", "Tech Solutions Ltda", 2500.00);

        System.out.println("=== Operações Bancárias ===");
        cc.depositar(200.00);
        cc.sacar(150.00);

        cp.depositar(300.00);
        cp.sacar(100.00);

        pj.depositar(500.00);
        pj.sacar(400.00); // Desconta R$ 400,00 + R$ 1,50 de taxa

        System.out.println("\n=== Saldos e Tarifas Mensais ===");
        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);
        contas.add(pj);

        for (Conta conta : contas) {
            conta.exibirSaldo();
            System.out.printf("Tarifa mensal (%s): R$ %.2f%n%n",
                    conta.getClass().getSimpleName(), conta.calcularTarifaMensal());
        }
    }
}
