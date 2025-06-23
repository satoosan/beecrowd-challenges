import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//area = n.raio^2
		//n = 3.14159
		
		double n = 3.14159;
		double raio = sc.nextDouble();
		
		double area = n * Math.pow(raio, 2);
		System.out.printf("A=%.4f\n", area);
		
		
		sc.close();
	}

}
