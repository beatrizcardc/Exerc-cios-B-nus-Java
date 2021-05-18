import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		// Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a média. Faça um programa onde o professor informe a média e as notas de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota superior à média e quantos tiveram nota inferior à média.
		Scanner leitor = new Scanner(System.in);
		int qtdmedias, contador=0, contadornotas=0, alunos;
		double nota, notamedia;
		
		alunos=50;
		
		System.out.println("Qual é a nota média da turma?");
		notamedia = leitor.nextInt();
		
		while(contador<alunos) {
			//Para não começar do aluno zero colocamos o (contador + 1)
			System.out.println("Digite a nota do " + (contador + 1) + "º aluno");
			nota = leitor.nextInt();
			contador = contador + 1;
			
			}
		leitor.close();
		}
			
			
	}


