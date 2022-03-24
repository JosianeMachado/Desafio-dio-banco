
public class Main {

	public static void main(String[] args) {
		Cliente josiane = new Cliente();
		josiane.setNome("Josiane");
		
		
		Conta cc = new ContaCorrente(josiane);
		Conta poupanca = new ContaPoupanca(josiane);
		
		cc.depositar(100);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	
	}


}
