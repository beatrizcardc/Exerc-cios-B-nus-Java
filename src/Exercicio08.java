import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		// Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a m�dia. Fa�a um programa onde o professor informe a m�dia e as notas de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota superior � m�dia e quantos tiveram nota inferior � m�dia.
		Scanner leitor = new Scanner(System.in);
		int contador=0, alunos;
		double nota, notamedia;
		Object qtdmedias = null;
		Object bolean = qtdmedias;
		alunos=5;
		
		System.out.println("Qual � a nota m�dia da turma?");
		notamedia = leitor.nextDouble();
		
		while(contador<alunos) {
			//Para n�o come�ar do aluno zero colocamos o (contador + 1)
			System.out.println("Digite a nota do " + (contador + 1) + "� aluno");
			nota = leitor.nextDouble();
			qtdmedias = nota>notamedia;
			contador = contador + 1;
			
			}
		leitor.close();
		}
			
			
	}


