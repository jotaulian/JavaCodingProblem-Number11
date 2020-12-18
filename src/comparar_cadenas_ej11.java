//- Realizar un programa que lea dos palabras y nos indique mediante
//una función cuál de las dos es mayor alfabéticamente.
import java.util.Scanner;

public class comparar_cadenas_ej11
{

	public static void main(String[] args)
	{
		String p1, p2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una palabra: ");
		p1 = teclado.nextLine();
		System.out.println("Dame otra palabra: ");
		p2 = teclado.nextLine();
		teclado.close();
	
		if(p1.compareTo(p2)>0) {
			System.out.println("La primer palabra ingresada es mayor alfabeticamente");
		} else{
			System.out.println("La segunda palabra ingresada es mayor alfabeticamente");
		}
	}

}
