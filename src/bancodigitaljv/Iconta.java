package bancodigitaljv;

public interface Iconta {
	
	double sacar(double valor);
	double depositar(double valor);
	double transferir(double valor,Conta contaDestino);

}
