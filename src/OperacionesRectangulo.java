import java.util.Scanner;

/*
 *Programa para conocer el perímetro y el area de un rectangulo.
 */

public class OperacionesRectangulo
{

	public static void main (String args[]) {

		double base, altura, result;
		
	Rectangulo operaciones = new Rectangulo();
			
			Scanner sc = new Scanner(System.in);
			System.out.print("\n¿Cuál es la base?: ");
			base = sc.nextDouble();
			System.out.print("\n¿Cuál es la altura?: ");
			altura = sc.nextDouble();
			
			operaciones.setBase(base);
			operaciones.setAltura(altura);
			
			result = operaciones.perimetro();
			System.out.println("\nEl resultado del perímetro es: " + result);
			
			result = operaciones.area();
			System.out.println("\nEl resultado del área es: " + result);
								
			System.out.println("\n\nEGUN ONA IZAN!!\n");
		}

}
