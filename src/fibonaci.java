
//Por Camilo Lavado y Jairo Rodriguez
//Fecha 01/12/1995
//Versión 1
import java.util.Scanner;

public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner usuario = new Scanner(System.in);
//Definición de variables a utilizar
		int a = 0;
		int b = 1;
		int c;
		int n;

//Respuesta por pantalla solicitando que el usuario ingrese datos
		System.out.println("Por favor ingrese cantidad de elementos deseados para la serie de Fibonacci:  ");
		n = usuario.nextInt();

//Ciclo de iteración que permite repetir una serie de instrucciones hasta que se cumpla un número determinado de repeticiones, en este caso definidas por el usuario
		for (int i = 0; i <= n; i++) {

			// Resultado por pantalla
			System.out.println(a);
		
			// Ejecuta suma de valores para para la secuencia de Fibonacci, repitiendo el ciclo
			c = a + b;
			a = b;
			b = c;

		}

	}
}
