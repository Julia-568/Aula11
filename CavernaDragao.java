package Aula11;

import java.util.Random;
import java.util.Scanner;

public class CavernaDragao {
	
	public static void main(String[] args) {
		
		//DECLARANDO VARIAVEIS
		int pontos = 0;
		int encontro;
		String direçao;
		
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		encontro = random.nextInt(2);
		
		System.out.println("Bem-Vindo a Caverna dos Dragões!");
		System.out.println("Escolha uma direção: frente, esquerda ou direita");
		
		while (true) {
            System.out.print("Digite sua escolha: ");
            direçao = ler.next();
            ler.close();
            
            if (encontro == 0) {
                System.out.println("Você encontrou um dragão! Você foi derrotado.");
                break; 
            } else {
                System.out.println("Você encontrou um tesouro! Você ganhou 10 pontos.");
                pontos += 10; 
            }
            System.out.println("Pontuação atual: " + pontos);
	}
		    System.out.println("Fim de jogo! Sua pontuação final é: " + pontos);
	}
	 
}
