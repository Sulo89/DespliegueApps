package poyectoSaul;
import java.util.Scanner;

/**
 * PrimaMainMetodos contiene los métodos para calculo de la prima de los empleados
 * @author saulf
 */


/*
 * Clase para probar los métodos para calcular la prima de los empleados
 */
public class PrimaMainMetodos {
	

	static Scanner  teclado=new Scanner(System.in);

	/**
	 * Inicia el programa
	 * @param args args
	 */
	public static void main(String[] args) {

		int numEmple;
		String nomEmple;
		int meses;
		char esDirectivo;
		char respuesta;
		

		do {
			System.out.println("\nDATOS  EMPLEADO/A");
			numEmple=leerNumEmple();
			nomEmple=leerNomEmple();
			meses=leerMeses();
			esDirectivo=leerEsDirectivo();
			System.out.println("\n\tLe corresponde la prima "+hallarPrima(esDirectivo, meses));
			
			
			System.out.println("\n¿CALCULAR MAS PRIMAS? (S/N): ");
			respuesta=teclado.nextLine().toUpperCase().charAt(0);
		}while(respuesta=='S');		
	}
	/**
	 * Halla la prima de un empleado
	 * @param esDirectivo recibe el parametro '+' o '-' para indicar si es directivo
	 * @param meses recibe el número de meses que el trabajador lleva en la empresa
	 * @return devuelve la prima que le corresponde a un empleado
	 */


	public static String hallarPrima(char esDirectivo, int meses) {
		if(esDirectivo=='+') // ES DIRECTIVO
			if(meses>=12)
				return "P1";
			else
				return "P3";
		else 	// NO ES DIRECTIVO
			if(meses>=12)
				return "P2";
			else
				return "P4";
	}
	/**
	 * Lee el número de empleado
	 * @return devuelve el número de empleado
	 */

	
	public static int leerNumEmple() {		
		int numEmple;
		do{
			System.out.println("NÚMERO [100-999]: ");
			numEmple = teclado.nextInt();
		}while(numEmple<100 || numEmple>999);		
		teclado.nextLine();
		return numEmple;
	}
	/**
	 * Lee el nombre de empleado
	 * @return devuelve el nombre de empleado
	 */
	
	
	public static String leerNomEmple() {
		String nomEmple;
		do {
			System.out.println("NOMBRE (max 10 caracteres): ");
			nomEmple = teclado.nextLine();
		}while(nomEmple.length()>10);		
		return nomEmple;
	}
	/**
	 * Lee los meses de trabajo de un empleado
	 * @return devuelve el numero de meses de trabajo de un empleado
	 */

	public static int leerMeses() {
		int meses;
		do {
			System.out.println("MESES DE TRABAJO: ");
			meses = teclado.nextInt();
		}while(meses<0);
		teclado.nextLine();
		return meses;
	}
	
	/**
	 * Lee si es directivo un empleado
	 * @return devuelve el valor + si es directivo y el valor - si no lo es
	 */

	public static char leerEsDirectivo() {
		char esDirectivo;
		do {
			System.out.println("¿ES DIRECTIVO? (+/-): ");
			esDirectivo = teclado.nextLine().charAt(0);
		}while(esDirectivo!='+' && esDirectivo!='-');
		return esDirectivo;
	}
}