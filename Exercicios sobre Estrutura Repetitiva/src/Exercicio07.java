import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Quantidade de Testes Que Deseja :");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();

			if (b == 0) {
				System.out.println("Divisão impossivel");
			} else {
				double divisao = a / b;

				System.out.println(divisao);
			}
		}

		sc.close();
	}

}
