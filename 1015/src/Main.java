import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Double> xPosition = new ArrayList<>();
		List<Double> yPosition = new ArrayList<>();
		
		//x1 and y1
		xPosition.add(sc.nextDouble());
		yPosition.add(sc.nextDouble());
		
		//x2 and ye
		xPosition.add(sc.nextDouble());
		yPosition.add(sc.nextDouble());
		
		double distancia = Math.sqrt(Math.pow(xPosition.get(1) - xPosition.get(0), 2) + Math.pow(yPosition.get(1) - yPosition.get(0), 2));
		System.out.println(String.format("%.4f", distancia));
		
		sc.close();
	}

}
