package bancodigitaljv;
import bancodigitaljv.Cliente;

public class Conta implements Iconta {
	protected static final int AGENCIA_PADRAO = 0;
	protected static int SEQUENCIAL = 1;
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected int numero;
	
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public double sacar(double valor) {
		saldo -= valor;
		enviarNotificacaoSaque(valor);
		return saldo;
	}
	@Override
	public double depositar(double valor) {
		saldo += valor;
		enviarNotificacaoDeposito(valor);
		return saldo;
		}
	@Override
	public double transferir(double valor, Conta contaDestino) {
		saldo -= valor;
		contaDestino.saldo += valor;
		enviarNotificacaoTransferencia(valor,contaDestino);
		return valor;
		}
	
	public void mostrarSaldo(){
		System.out.println("O valor do seu saldo é:" + saldo);
		}
	
	public void enviarNotificacaoSaque(double valor) {
		System.out.println("Realizado Saque no valor de: " + valor + " \nSeu saldo atual é de:" + saldo );
	}
	
	public void enviarNotificacaoDeposito(double valor) {
		System.out.println("Realizado Deposito no valor de: " + valor + " \nSeu saldo atual é de:" + saldo );
	}
	
	public void enviarNotificacaoTransferencia(double valor, Conta contaDestino) {
		System.out.println("Realizado transferencia no valor de: " + valor + "para a conta:" + contaDestino);
	}

}
