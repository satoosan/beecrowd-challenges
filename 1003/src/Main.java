import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int soma = sum(a, b);
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}

}
