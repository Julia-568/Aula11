package Aula11;

import java.util.Scanner;

public class SuperHeroi {
	
	public static void main(String [] args) {
		
		//DECLARANDO VARIAVEIS
		int numeroFinal;
		int contador = 1;
		String codigoSecreto;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um numero final para salvar sua cidade: ");
		numeroFinal = ler.nextInt();
			
				
		do {
			System.out.println("Contando: " + contador);
			
			
			if (contador % 10 == 0) {
				System.out.println("Armadilha ativada! Digite o código para continuar: ");
				codigoSecreto = ler.next();
				if (!codigoSecreto.equals("1425")) {
				System.out.println("Código errado! Tente novamente");
				break;
			}
		} 
		contador++;
		  
		} while 
			(contador <= numeroFinal);
		
		if (contador > numeroFinal) {
			System.out.println("Você salvou a cidade!");
			
			}
		ler.close();
		}
		
	}
