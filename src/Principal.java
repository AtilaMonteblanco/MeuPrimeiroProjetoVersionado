import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args){
		//criando calculadora "Calculadora" � o tipo poderia ser String calculadora.

		Calculadora calculadoraDoPedrinho = new Calculadora(); //"Instancia do objeto Calculadora
		//come�o do construtor(m�todo que tem o mesmo nome da classe) " new esta invocando o constrotur
		//calculadoraDoPedrinho.somar(20,60); //esta calculador esta invocando a propriedade soma da "Calculadora"
		//int retornoCalculo = calculadoraDoPedrinho.somar(10,50);
		//int retornoCalculoSegundaVez = calculadoraDoPedrinho.somar(20,10);
		calculadoraDoPedrinho.somar(10,50);
		calculadoraDoPedrinho.somar(20,10);
		JOptionPane.showMessageDialog(null, "O valor da Some �:" +calculadoraDoPedrinho.getValor()); // mostra painel.com resultado da soma 

	}
}
