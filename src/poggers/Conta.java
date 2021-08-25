package poggers;

public class Conta {

    private int conta;
    private int agencia;
    private String nomePessoa;
    private double saldo;
    private double chequeEspecial;

    public Conta(int conta, int agencia, String nomePessoa, double saldo, double chequeEspecial) {
        this.conta = conta;
        this.agencia = agencia;
        this.nomePessoa = nomePessoa;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
        
        
    @Override
    public String toString(){
        return "Conta: " + this.conta + "\nSaldo: " + Tools.formataValor(this.saldo, true);
    }
    
     public boolean sacar(double valor){
         try {
//             this.saldo -= valor;
             double resultado = this.saldo - valor;
             if(resultado >= (this.chequeEspecial * -1)) {
                 this.saldo -= valor;
                 return true;
             } else {
                 return false;
             }
         } catch (Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
//        double saldoNovo = this.saldo - valorSaque;
//        this.saldo= saldoNovo;
    }
    
    public boolean deposito(double valor){
//        this.saldo += valor;
        
        try {
//             this.saldo -= valor;
             double resultado = this.saldo + valor;
             if(resultado >= (this.chequeEspecial * -1)) {
                 this.saldo += valor;
                 return true;
             } else {
                 return false;
             }
         } catch (Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
//        double saldoNovo = conta.getSaldo() + valorDeposito;
//        conta.setSaldo(saldoNovo);
    }
    
    public boolean transferir(Conta conta2, double valor){
//        sacar(valor);
//        conta2.deposito(valor);
        
        try {
//             this.saldo -= valor;
             double resultado = this.saldo - valor;
             if(resultado >= (this.chequeEspecial * -1)) {
                sacar(valor);
                conta2.deposito(valor);
                 return true;
             } else {
                 return false;
             }
         } catch (Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
        
//        double saldoConta1 = conta1.getSaldo() - valor;
//        conta1.setSaldo(saldoConta1);
//
//        double saldoConta2 = conta2.getSaldo() + valor;
//        conta1.setSaldo(saldoConta1);
        
        }
}
