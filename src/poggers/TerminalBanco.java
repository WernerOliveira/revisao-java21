package poggers;

public class TerminalBanco {
    
    public static void main(String[] args){
        
        Conta conta1 = new Conta(1, 123, "Poggo", 500, 2000);
        
        Conta conta2 = new Conta(1, 656, "Pepe", 1000, 5000);
        
//        transferir(conta1, conta2, 200);
        
//        System.out.println("");
        
//        sacar(conta1, 10);
//        sacar(conta2, 12);
        conta1.sacar(100);
        conta1.deposito(300);
        conta1.transferir(conta2, 100);
//        deposito(conta1, 300);
        System.out.println("A " + conta1.toString());
        System.out.println("B " +conta2.toString());
    }
}
