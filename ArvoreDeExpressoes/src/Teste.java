import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite uma expre��o com todos os parenteses");
		ArvoreDeExpressao a = new ArvoreDeExpressao(sc.nextLine());
		System.out.println("\nexpress�o digitada:");
		a.percorrer(0);
		System.out.println("\nexpress�o digitada em pos-ordem:");
		a.percorrer(1);
		System.out.println("\nexpress�o digitada:");
		a.percorrer(-1);
	}

}
