import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		// Um robô de combate só deve ativar sua arma principal quando o inimigo está a menos de 70cm de distância. Faça um programa onde o usuário informe a distância do inimigo e sejam exibidas as mensagens “ATIVADO” ou “DESATIVADO” dependendo do status da arma.
		Scanner leitor = new Scanner(System.in);
		double distancia = 0;
		
		System.out.println("Qual é a distância do inimigo? Por favor informe em centímetros.");
			distancia = leitor.nextDouble();
		
		if (distancia<70) {
			System.out.println("A arma foi ATIVADA!");
			
		}else {
			System.out.println("A arma está DESATIVADA!");
		}
		leitor.close();
	}
		
}
