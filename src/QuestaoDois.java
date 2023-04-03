import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, cont = 0, valorDigitado;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um um numero");
		valorDigitado = teclado.nextInt();
		teclado.close();
		System.out.println(n1);
		while (cont < valorDigitado) {
			n1 = n1 + n2;
			n2 = n1 - n2;
			System.out.println(n1);
			cont = n1;
		}
		if (valorDigitado == n1)
			System.out.println("\nPertence a sequência de Fibonacci,\n"
					+ "número digitado: " + valorDigitado);
		else 
			System.out.println("\nNão pertence a sequência de Fibonacci,\n"
					+ "número digitado: " + valorDigitado);
	}

}
