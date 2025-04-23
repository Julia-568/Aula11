package Aula11;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
	
	public static void main(String [] args) {
		
		//DECLARANDO VARIAVEIS
		int numero;
		int tentativas = 0;
		int palpite;
		
		Scanner ler = new Scanner (System.in);
		Random random = new Random();
		numero = random.nextInt(100) + 1;
		
		System.out.println("Adivinhe o número secreto!");
		
		do {
			System.out.print("Seu palpite: ");
			palpite = ler.nextInt();
			tentativas++;
			
			if (palpite < numero) {
                System.out.println("Maior!");
            } else if (palpite > numero) {
                System.out.println("Menor!");
            }
			
		} while (numero != palpite);
		
		 System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
	     ler.close();
	}

}
