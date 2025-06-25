import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double totalDeVendas = sc.nextDouble();
		
		double receber = salarioFixo + (totalDeVendas * 0.15);
		System.out.printf("TOTAL = R$ %.2f\n", receber);
		
		sc.close();
	}

}
