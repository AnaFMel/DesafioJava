public class Conta {
    private String conta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    public int sacar(double saque){
        if (saque > saldo){
            return 0;
        }
        this.saldo-=saque;
        return 1;
    }

    public void depositar(double deposito){
        this.saldo+=deposito;
    }

    public void imprimir(){
        System.out.println("Conta = " + getConta());
        System.out.println("Agência = " + getAgencia());
        System.out.println("Saldo = " + getSaldo());
        System.out.println("Nome do cliente = " + getNomeCliente());
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
