import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite uma expreção com todos os parenteses");
		ArvoreDeExpressao a = new ArvoreDeExpressao(sc.nextLine());
		System.out.println("\nexpressão digitada:");
		a.percorrer(0);
		System.out.println("\nexpressão digitada em pos-ordem:");
		a.percorrer(1);
		System.out.println("\nexpressão digitada:");
		a.percorrer(-1);
	}

}
