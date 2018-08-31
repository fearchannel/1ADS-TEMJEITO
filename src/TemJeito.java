        /**
	 * @author Leonardo Lourenço Gomes
	 * Checkout my repo :) https://github.com/fearchannel
	 * You can contact me via LinkedIn!
	 */
import java.util.Scanner;

public class TemJeito {

	private static Scanner scan;

	public static void main(String[] args) {
		float v1, v2, v3, v4, v5, v6, v7, v8, v9, medatv = 0, nota;
		scan = new Scanner(System.in);

		System.out.println("Digite a nota da Atividade 1");
		v1 = scan.nextFloat();
		if (v1 < 0 || v1 > 10)
			System.out.println("Inválido!");
		else
			System.out.println("Digite a nota da Atividade 2");
		v2 = scan.nextFloat();
		if (v2 < 0 || v2 > 10)
			System.out.println("Inválido!");
		else
			System.out.println("Digite a nota da Atividade 3");
		v3 = scan.nextFloat();
		if (v3 < 0 || v3 > 10)
			System.out.println("Inválido!");
		else
			System.out.println("Digite a nota da Atividade 4");
		v4 = scan.nextFloat();
		if (v4 < 0 || v4 > 10)
			System.out.println("Inválido!");
		else
			System.out.println("Digite a nota da Atividade 5");
		v5 = scan.nextFloat();
		if (v5 < 0 || v5 > 10)
			System.out.println("Inválido!");
		else
			System.out.println("Digite a nota da Atividade 6");
		v6 = scan.nextFloat();
		if (v6 < 0 || v6 > 10)
			System.out.println("Inválido!");
		else
			System.out.println("Digite a nota da Atividade 7");
		v7 = scan.nextFloat();
		if (v7 < 0 || v7 > 10)
			System.out.println("Inválido!");
		else
			System.out.println("Digite a nota da Atividade 8");
		v8 = scan.nextFloat();
		if (v8 < 0 || v8 > 10)
			System.out.println("Inválido!");
		else
			System.out.println("Digite a nota da Atividade 9");
		v9 = scan.nextFloat();
		if (v9 < 0 || v9 > 10)
			System.out.println("Inválido!");
		else

			medatv = ((v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9) / 9) * 0.2f;

		System.out.printf("A média de suas atividades é: %.01f \n", medatv);

		nota = (5.75f) - medatv;
		nota = (nota * 2) / 0.8f;

		if (nota >= 10)
			System.out.println("Reprovado automaticamente!");
		else
			System.out.printf("Necessário tirar: %.01f", nota );

	}

}
