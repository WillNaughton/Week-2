import java.util.Scanner;

public class MenuDrivenImput {

	public static void main(String[] args) {

		int desition = 0;
		Scanner sc = new Scanner(System.in);
		while (desition != -1) {
		
			System.out.println("1) create new user");
			System.out.println("2) update account info");
			System.out.println("Pick a number between -1 - 10: ");
			desition = sc.nextInt();
		System.out.println("You picked: " + desition);
		
		if (desition > 10 || desition < -1) {
			
			System.out.println("pick a number between -1 - 10");
		}
		}
		System.out.println("goodbye");
	}

}
