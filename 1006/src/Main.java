import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double media = (a*2 + b*3 + c*5)/10.0;
		System.out.printf("MEDIA = %.1f\n", media);
		
		sc.close();
	}

}
