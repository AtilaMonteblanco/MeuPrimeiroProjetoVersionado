
public class Calculadora {

	// private int ValorUm; //private porque s� interessa para esta classe.
	// private int ValorDois;//private porque s� interessa para esta classe.
	private int valor; // Acumulador para quardar valores anteriores para
						// futuras opera��es.
	// public(Metodo) porque vou usar estas informa��es na classe "Principal"

	public void somar(int ValorUm, int ValorDois) { // void � um metodo que n�o
													// retorna nada
		/*
		 * this.ValorUm = ValorUm; // "this" valo de escopo da classe.
		 * this.ValorDois = ValorDois; //No modo Debug clicando "F6" executa o
		 * cmando de atualizar this.total += this.ValorUm + this.ValorDois; //+=
		 * a esquerda recebe a direita + ele mesmo.
		 */
		// int soma = this.ValorUm + this.ValorDois; //this desta
		// classe"Calculadora" e n�o do m�todo.
		// return soma; //por isso mudei de void para int na linha 7 para ter
		// "return" na classe "Principal".
		this.valor = this.valor + (ValorUm + ValorDois);
	}

	public void subtracao() {

	}

	public void dividir() {

	}

	public void multiplicar() {

	}

	public int getValor() {
		return valor;
	}

}
