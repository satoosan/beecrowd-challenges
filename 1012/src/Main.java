import java.util.Scanner;

public class Main {

	static double PI = 3.14159;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		areaTriangulo(a, c);
		areaCirculo(c);
		areaTrapezio(a, b, c);
		areaQuadrado(b);
		areaRetangulo(a, b);
		
		sc.close();
	}

	public static void areaTriangulo(double base, double altura) {
		System.out.println("TRIANGULO: " + String.format("%.3f", (base * altura)/2.0));
	}
	
	public static void areaCirculo(double raio) {
		System.out.println("CIRCULO: " + String.format("%.3f", PI * Math.pow(raio, 2)));
	}
	
	public static void areaTrapezio(double baseA, double baseB, double altura) {
		System.out.println("TRAPEZIO: " + String.format("%.3f", ((baseA + baseB) * altura)/2.0));
	}
	
	public static void areaQuadrado(double lado) {
		System.out.println("QUADRADO: " + String.format("%.3f", Math.pow(lado, 2)));
	}
	
	public static void areaRetangulo(double ladoA, double ladoB) {
		System.out.println("RETANGULO: " + String.format("%.3f", ladoA * ladoB));
	}
	
}
