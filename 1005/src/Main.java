import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.printf("MEDIA = %.5f\n", media(a, b));
		sc.close();
	}
	
	public static double media(double a, double b) {
		return (a*3.5 + b*7.5)/11.0;
	}

}
