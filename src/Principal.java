public class Principal {
    public static void main(String[] args) {
        Cliente claydson = new Cliente();
        claydson.setNome("Claydson");

        Conta cc = new ContaCorrente(claydson);
        Conta poupanca = new ContaPoupanca(claydson);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
