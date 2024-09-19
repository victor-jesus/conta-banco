public class ContaBanco {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBanco(int numeroConta, String agencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numeroConta+ " e seu saldo " + this.saldo + " já está disponível para saque";
    }
}
