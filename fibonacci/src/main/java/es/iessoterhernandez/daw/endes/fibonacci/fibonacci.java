package es.iessoterhernandez.daw.endes.fibonacci;

import java.util.*;

public class fibonacci {

	public void secuenciaFibonacci() {
		
		Scanner sc = new Scanner(System.in);
    
		int a = 0, b = 1, c, n;
    
		System.out.println("Cuantas suceciones de la secuencia de fibonacci quieres???");
		n = sc.nextInt();
    
		for (int i = 0; i < n; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
    
		sc.close();
	}

}
