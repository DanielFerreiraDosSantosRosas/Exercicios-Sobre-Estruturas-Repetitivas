import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor de N:");
		
		int n = sc.nextInt();
		int quadrado, cubo;
		
		for (int i=1 ; i <= n ; i ++ ) {
			quadrado = i*i ;
			cubo = i*i*i ;
			
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
			
		}
		
		
		
		sc.close();

	}

}
