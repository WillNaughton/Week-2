import java.util.Scanner;

import javax.swing.Timer;



public class MenuDrivenApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int imput = 0;
		String user = "USER";
		String car = "CAR";
		
		while(imput != -1) {
			System.out.println("Welcome " + user);
			System.out.println("Pick an option: ");
			System.out.println("1) Create Name");
			System.out.println("2) Fortune");
			System.out.println("3) Random Fact");
			System.out.println("4) Enter Favorite Car");
			System.out.println("-1) Exit");
			
			imput = sc.nextInt();
			
			if(imput == 1) {
				System.out.println("Enter User Name: ");
				user = sc.next();

				
			}
			if(imput == 2) {
				System.out.println("A hunch is creativity trying to tell you something.");
				
				
			}
			if(imput == 3) {
				System.out.println("If you have 3 quarters, 4 dimes, and 4 pennies, you have $1.19. You also have the largest amount of money in coins without being able to make change for a dollar.");
				
			}
			if(imput == 4) {
				System.out.println("Enter Favorite Car: ");
				car = sc.next();
				 if (car.equals( "SlingShot")) {
					 System.out.println("Cool Car Bro!!");
				 }
				
			}
		}
	}
	
}
