import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		// 7 – No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella. Para isso, devem acertar quantos feijões estão em um jarro (1238). Faça um programa que solicite a digitação da quantidade de feijões até que um cliente acerte.
		Scanner leitor = new Scanner(System.in);
		int quantidade=0;
		int tentativas=0;
		
		while(quantidade!=1238 && tentativas <5) {
			//Pedir para o usuário digitar novamente
			System.out.println("Quantos feijões tem no pote?");
			quantidade = leitor.nextInt();
		if (quantidade!=1238) {
			System.out.println("Siga tentando");
		}
			//Quantas tentativas foram necessárias para acertar?
			tentativas = tentativas +1;
		}
		if (quantidade==1238) {
			System.out.println("Parabéns! Você ganhou uma noite no castelo da princesa Javarella!");
			System.out.println("Você acertou com " + tentativas + " !");
		}else {
			System.out.println("Não foi dessa vez. Você não tem mais tentativas!");
		}
			leitor.close();
				
	}
		
}
