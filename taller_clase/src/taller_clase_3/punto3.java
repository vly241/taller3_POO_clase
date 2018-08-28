package taller_clase_3;

import java.util.Scanner;

class punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("ingrese el lado de A del triangulo: ");
		a = sc.nextInt();
		
		System.out.println("ingrese el lado de B del triangulo: ");
		b = sc.nextInt();
		
		System.out.println("ingrese el lado de C del triangulo: ");
		c = sc.nextInt();
		
		sc.close();
		
		int s,r1,r2,r3,rr;
		double raiz;
		s=(a+b+c)/2;
		r1=s*(s-a);
		r2=s*(s-b);
		r3=s*(s-c);
		
		rr=r1*r2*r3;
		
		raiz = Math.sqrt(rr);
		
	
		
		System.out.println("el area del triangulo es: "+ raiz);
	}

}
