import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		// 7 � No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella. Para isso, devem acertar quantos feij�es est�o em um jarro (1238). Fa�a um programa que solicite a digita��o da quantidade de feij�es at� que um cliente acerte.
		Scanner leitor = new Scanner(System.in);
		int quantidade=0;
		int tentativas=0;
		
		while(quantidade!=1238 && tentativas <5) {
			//Pedir para o usu�rio digitar novamente
			System.out.println("Quantos feij�es tem no pote?");
			quantidade = leitor.nextInt();
		if (quantidade!=1238) {
			System.out.println("Siga tentando");
		}
			//Quantas tentativas foram necess�rias para acertar?
			tentativas = tentativas +1;
		}
		if (quantidade==1238) {
			System.out.println("Parab�ns! Voc� ganhou uma noite no castelo da princesa Javarella!");
			System.out.println("Voc� acertou com " + tentativas + " !");
		}else {
			System.out.println("N�o foi dessa vez. Voc� n�o tem mais tentativas!");
		}
			leitor.close();
				
	}
		
}
