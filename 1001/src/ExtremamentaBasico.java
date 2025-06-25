import java.util.Scanner;

public class ExtremamentaBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sum(a, b);
		
		sc.close();
	}

	public static void sum(int a, int b) {
		System.out.println("X = " + (a+b));
	}
	
}
