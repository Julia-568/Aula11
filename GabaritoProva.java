package Aula11;

import java.util.Scanner;

public class GabaritoProva {
	
	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
    
	int totalAlunos = 0;
    double somaNotas = 0;
    double mediaNotas;
        
    while (true) {
          totalAlunos++;
          int acertos = 0;
            
          System.out.println("Aluno " + totalAlunos + ", insira suas respostas (A, B, C, D ou E):");
          System.out.print("Questão 1: ");
            if (ler.next().equalsIgnoreCase("A")) acertos++;
          
          System.out.print("Questão 2: ");
            if (ler.next().equalsIgnoreCase("B")) acertos++;
            
          System.out.print("Questão 3: ");
            if (ler.next().equalsIgnoreCase("C")) acertos++;
            
          System.out.print("Questão 4: ");
            if (ler.next().equalsIgnoreCase("D")) acertos++;
          
          System.out.print("Questão 5: ");
            if (ler.next().equalsIgnoreCase("E")) acertos++;
            
          System.out.print("Questão 6: ");
            if (ler.next().equalsIgnoreCase("E")) acertos++;
            
          System.out.print("Questão 7: ");
            if (ler.next().equalsIgnoreCase("D")) acertos++;
            
          System.out.print("Questão 8: ");
            if (ler.next().equalsIgnoreCase("C")) acertos++;
            
          System.out.print("Questão 9: ");
            if (ler.next().equalsIgnoreCase("B")) acertos++;
            
          System.out.print("Questão 10: ");
            if (ler.next().equalsIgnoreCase("A")) acertos++;
            
            somaNotas += acertos;
          
            System.out.println("Você acertou " + acertos + " questões. Sua nota é: " + acertos);
            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            if (!ler.next().equalsIgnoreCase("S")) {
                break;
            }
        }
        mediaNotas = somaNotas / totalAlunos;
        System.out.println("Total de Alunos que utilizaram o sistema: " + totalAlunos);
        System.out.println("A Média das Notas da Turma: " + mediaNotas);
        ler.close();
    }
}
         
            
	
	

