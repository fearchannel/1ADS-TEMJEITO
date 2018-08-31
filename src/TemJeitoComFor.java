        /**
	 * @author Leonardo Lourenço Gomes
	 * Checkout my repo :) https://github.com/fearchannel
	 * You can contact me via LinkedIn!
	 */
import java.util.Scanner;

public class TemJeitoComFor {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		float nota1 = 0, soma = 0, med = 0, nota = 0;
		int zq = 0;

		System.out.println("Digite as nove notas da atividade, com valores de 0-10");
		for (zq = 0; zq < 9; zq++) {
			nota1 = scan.nextFloat();
			if (nota1 < 0 || nota1 > 10)
				System.out.println("Inválido!");
			else
				soma += nota1;
		}
		med = (soma / 9) * 0.2f;
		System.out.println("O valor da sua média atual é: " + med);
		nota = (5.75f) - med;
		nota = (nota * 2) / 0.8f;
		if (nota >= 10)
			System.out.println("Reprovado automaticamente!");
		else
			System.out.printf("Necessário tirar: %.01f", nota);

	}

}
