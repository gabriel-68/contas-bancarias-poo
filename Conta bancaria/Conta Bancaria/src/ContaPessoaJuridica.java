public class ContaPessoaJuridica extends Conta {
    private static final double TARIFA_MENSAL = 20.00;
    private static final double TAXA_SAQUE = 1.50;

    public ContaPessoaJuridica(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        double valorTotal = valor + TAXA_SAQUE;
        if (valorTotal > saldo) {
            System.out.printf("Saldo insuficiente na conta PJ %s para saque de R$ %.2f (taxa de R$ %.2f incluída).%n",
                    getNumero(), valor, TAXA_SAQUE);
            return false;
        }
        saldo -= valorTotal;
        System.out.printf("Saque de R$ %.2f realizado na conta PJ %s (taxa de R$ %.2f descontada).%n",
                valor, getNumero(), TAXA_SAQUE);
        return true;
    }

    @Override
    public double calcularTarifaMensal() {
        return TARIFA_MENSAL;
    }
}