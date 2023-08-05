package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números deseja digitar? ");
		int quant = sc.nextInt();
		
		double[] vetor = new double[quant];
		
		double maior = 0;
		int pos = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° número: ", i + 1);
			vetor[i] = sc.nextDouble();
			if(maior == 0) {
				maior = vetor[i];
				pos = i;
			} else if(maior < vetor[i]) {
				maior = vetor[i];
				pos = i;
			}
		}
		
		System.out.printf("\nMaior valor %.2f%n", maior);
		System.out.println("Posição no vetor: " + pos);
		
		sc.close();
	}

}
