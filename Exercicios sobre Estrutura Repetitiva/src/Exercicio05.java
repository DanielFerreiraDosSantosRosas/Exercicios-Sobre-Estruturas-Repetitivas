import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

		Scanner sc= new Scanner (System.in);
		
		int n, x, somain = 0, somaout = 0;
		
		n = sc.nextInt();
		
		for (int i=0 ; i < n; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				somain += 1;
			}
			else {
				somaout +=1;
			}
		}
		
		System.out.println(somain + "in");
		System.out.println(somaout + "out");
		
		
		
		
		sc.close();
	}

}
