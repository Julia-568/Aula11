package Aula11;

import java.util.Scanner;

public class JogoCorridaEspacial {
	
	public static void main(String[] args) {
		
		// DECLARANDO VARIÁVEIS
		int estrelasColetadas = 0;
		String comandoDesvio;
		int totalEstrelasDesejadas;
				
	    Scanner ler = new Scanner(System.in);
				
		System.out.println("Bem-vindo à Corrida Espacial!");
		System.out.println("Colete as estrelas e desvie dos meteoros!");
				
	
		System.out.print("Quantas estrelas você quer coletar? ");
		totalEstrelasDesejadas = ler.nextInt();
				
		while (estrelasColetadas < totalEstrelasDesejadas) {
		estrelasColetadas++;
		System.out.println("Você coletou uma estrela!");
		System.out.println("Total de estrelas: " + estrelasColetadas);
					
		if (estrelasColetadas % 10 == 0) {
		    System.out.println("Um meteoro apareceu! Você precisa desviar.");
						
		do {
		    System.out.print("Digite 'direita' ou 'esquerda' para desviar: ");
		    comandoDesvio = ler.next();
		    
	    } while (!comandoDesvio.equals("esquerda") && !comandoDesvio.equals("direita"));
						
		System.out.println("Você desviou para " + comandoDesvio + " e escapou do meteoro!");
		}
					
		if (estrelasColetadas < totalEstrelasDesejadas) {
	        System.out.print("Pressione Enter para coletar mais estrelas...");
		    ler.nextLine(); 
		    ler.nextLine();
		}
}	
		System.out.println("Parabéns! Você coletou todas as estrelas!");
		ler.close();
			}
		}
