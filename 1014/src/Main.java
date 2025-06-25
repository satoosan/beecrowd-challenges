import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int distancia = sc.nextInt();
		double gasto = sc.nextDouble();
		
		double consumoMedio = distancia/gasto;
		System.out.println(String.format("%.3f", consumoMedio) + " km/l");
		
		sc.close();
	}

}
