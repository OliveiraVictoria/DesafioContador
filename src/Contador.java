import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		try {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();

			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (InputMismatchException e) {
			System.out.println("Os parâmetros devem ser números inteiros");
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		} finally {
			terminal.close();
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo número " + i);
		}
	}
}

/**
 * CORREÇÕES FEITA PARA EXECUÇÃO DO CÓDIGO
 * Principais Correções:
 * Fechamento extra da chave: Removida a chave extra após o método main.
 * Fechamento do scanner: Corrigido o nome do scanner de scanner.close() para
 * terminal.close().
 * Validação dos parâmetros: Implementada a lógica que verifica se parametroUm é
 * maior que parametroDois e lança uma exceção personalizada.
 * Contagem: Implementada a lógica de contagem no método contar, que imprime os
 * números de 1 até contagem
 **/