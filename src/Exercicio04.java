import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		// Um rob� de combate s� deve ativar sua arma principal quando o inimigo est� a menos de 70cm de dist�ncia. Fa�a um programa onde o usu�rio informe a dist�ncia do inimigo e sejam exibidas as mensagens �ATIVADO� ou �DESATIVADO� dependendo do status da arma.
		Scanner leitor = new Scanner(System.in);
		double distancia = 0;
		
		System.out.println("Qual � a dist�ncia do inimigo? Por favor informe em cent�metros.");
			distancia = leitor.nextDouble();
		
		if (distancia<70) {
			System.out.println("A arma foi ATIVADA!");
			
		}else {
			System.out.println("A arma est� DESATIVADA!");
		}
		leitor.close();
	}
		
}
