import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("PROD = " + prod(a, b));
		
		sc.close();
	}

	public static int prod(int a, int b) {
		return a * b;
	}
	
}
