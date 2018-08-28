package taller_clase_14;
import java.util.Scanner;
class punto14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("ingrese un numero: ");
		numero= sc.nextInt();
		
		sc.close();
		
		if(numero>100) {
			numero = numero+20;
		}else if(numero==100) {
			numero=numero+1;
		}else if(numero < 100) {
			numero = numero-20;
		}
		
		System.out.println("el resultado es:  "+ numero);
		
	}

}
