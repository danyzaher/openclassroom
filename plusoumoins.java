import java.util.Scanner;
import java.util.Random;
class plusoumoins {
	public static void main(String args[]) {
		int n;
		int reponse;
		Random rando =new Random();
		n = rando.nextInt(100);
		boolean trouve = false;
		Scanner scanner = new Scanner(System.in);
		while (!trouve) {
			System.out.println("entrez un nombre");
			reponse = scanner.nextInt();
			if (reponse == n) {
				System.out.println("gg ez");
				trouve = true;
			} if (reponse > n)  {
				System.out.println("c'est moins");
			} if (reponse < n){
				System.out.println("c'est plus");
			}
		}
	}
}
			

