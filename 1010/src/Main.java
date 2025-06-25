import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<Integer> codPecas = new ArrayList<>();
		List<Integer> numPecas = new ArrayList<>();
		List<Double>  valorUnitPeca =new ArrayList<>();
		
		//Peca 1
		int codPeca1 = sc.nextInt();
		int numPeca1 = sc.nextInt();
		double valorUnitPeca1 = sc.nextDouble();
		
		//Peca 2
		int codPeca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();
		double valorUnitPeca2 = sc.nextDouble();
		
		codPecas.add(codPeca1);
		codPecas.add(codPeca2);
		numPecas.add(numPeca1);
		numPecas.add(numPeca2);
		valorUnitPeca.add(valorUnitPeca1);
		valorUnitPeca.add(valorUnitPeca2);
		
		double total = IntStream.range(0, numPecas.size()).mapToDouble(i -> numPecas.get(i) * valorUnitPeca.get(i)).sum();
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
		sc.close();
	}

}
