import java.util.Scanner;

public class Main {

	static double PI = 3.14159;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double volumeEsfera = 4/3.0 * PI * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f\n", volumeEsfera);
		
		sc.close();
	}

}
