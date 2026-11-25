public abstract class Conta {
    private String numero;
    private String agencia;
    private String titular;
    protected double saldo;

    public Conta(String numero, String agencia, String titular, double saldoInicial) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = Math.max(0, saldoInicial);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado na conta %s.%n", valor, numero);
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        if (valor > saldo) {
            System.out.printf("Saldo insuficiente na conta %s para saque de R$ %.2f.%n", numero, valor);
            return false;
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado na conta %s.%n", valor, numero);
        return true;
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s | Agência: %s | Conta: %s | Saldo: R$ %.2f%n",
                titular, agencia, numero, saldo);
    }

    public abstract double calcularTarifaMensal();

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}